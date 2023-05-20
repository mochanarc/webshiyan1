package com.gk.test;
import com.gk.mapper.SchoolMapper;
import com.gk.pojo.School1;
import com.gk.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class mybatisTest1 {
    SqlSession sqlSession=SqlSessionUtils.getSqlSession();
    @Test
    public void updateCourse(){
        SchoolMapper mapper=sqlSession.getMapper(SchoolMapper.class);
        School1 school1=mapper.selectCourseBySchool(1);
        System.out.println(school1.toString());
        sqlSession.close();
    }
}
