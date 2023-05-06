package com.restApi.durgeshRestApiDemoServiceLayer;
import com.restApi.durgeshRestApiDemoEntity.courseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface RestApiDemoServiceInterface {

//    we have created the interface for lose coupling

//    method to fetch all course name as list
List<courseEntity> getAllCourses();
//    method to fetch only one course name with given courseid
courseEntity getCourseName(Integer courseId);
//    method to add new course
courseEntity addNewCourse(courseEntity ce);
//method to update the course
void updateCourse(courseEntity ce);


}
