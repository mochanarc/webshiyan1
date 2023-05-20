package com.gk.test;
import com.gk.utils.SqlSessionUtils;
import com.gk.mapper.CourseMapper;
import com.gk.pojo.Course;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class mybatisTest2 {
    SqlSession sqlSession=SqlSessionUtils.getSqlSession();
    @Test
    public void selectCourseById(){
        Course course=new Course();
        course.setId(4);
        course.setName("⾼级 Web 技术");
        course.setHours(40);
        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
        int update= mapper.updateCourse(course);
        if(update>0){
            System.out.println("成功修改了");
        }else {
            System.out.println("修改失败");
        }
        System.out.println(course.toString());
        sqlSession.commit();
        sqlSession.close();
    }
}
