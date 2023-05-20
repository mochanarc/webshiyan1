package com.gk.mapper;
import com.gk.pojo.Course;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;
public interface CourseMapper {
    //查询id=2的课程信息
    @Select("select * from s_course where id = #{id}")
   Course selectCourseById(int id);
    //将 id=4 这⻔课程的课时数修改为 32+8=40；
    @Update("update s_course set name=#{name},hours=#{hours}"+"where id=#{id}")
    int updateCourse(Course course);
    //查询出所有计算机学院开设的课程信息
    @Select("select * from s_course where sid=#{id}")
    @Results({@Result(id=true,column="id",property="id"),
            @Result(column = "name",property = "name"),
            @Result(column = "hours",property = "hours")})
List<Course> selectCourseBySid(int sid);
}
