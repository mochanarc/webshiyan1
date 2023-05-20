package com.gk.test;
import com.gk.utils.SqlSessionUtils;
import com.gk.mapper.CourseMapper;
import com.gk.pojo.Course;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class mybatisTest {
    SqlSession sqlSession=SqlSessionUtils.getSqlSession();
    @Test
    public  void findCourseById(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
        Course course= mapper.selectCourseById(2);
        System.out.println(course.toString());
    }
}
