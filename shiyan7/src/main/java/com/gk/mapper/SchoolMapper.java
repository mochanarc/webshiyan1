package com.gk.mapper;
import com.gk.pojo.School1;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
public interface SchoolMapper {
    //查询出所有计算机学院开设的课程信息
    @Select("select * from s_school where id=#{id}")
    @Results({@Result(id=true,property="id",column="id"),
            @Result(property = "schoolname",column = "schoolname"),
            @Result(column = "id",property = "courseList",
                    many = @Many(select = "com.gk.mapper.CourseMapper.selectCourseBySid"))})
    School1 selectCourseBySchool(int id);
}
