package com.restApi.durgeshRestApiDemoController;

import com.restApi.durgeshRestApiDemoEntity.courseEntity;
import com.restApi.durgeshRestApiDemoServiceLayer.RestApiDemoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class MyController {


     @Autowired
//     @Autowired create the object of CourseServiceImpl and inject into serviceinterface acording the injuction rule
      public RestApiDemoServiceInterface serviceinterface;
//    create a method that will give all the list of courses
    @GetMapping("/course")
    public List<courseEntity> getAllCourses(){
//        Now Controller will call service layer to get all the courses
           return this.serviceinterface.getAllCourses();

    }

//    get a perticualr course
    @GetMapping("/course/{courseId}")
    public courseEntity getCourseName(@PathVariable Integer courseId)
    {
//        System.out.println("id = ");
        return this.serviceinterface.getCourseName(courseId);
    }

//    to add new course
    @PostMapping("/addCourse")
    public courseEntity addNewCourse(@RequestBody courseEntity ce)
    {
        return this.serviceinterface.addNewCourse(ce);
    }

    @PutMapping("/updateCourse/{courseId}")
    public ResponseEntity<HttpStatus> updateCourse(@RequestBody courseEntity ce){
        try {
            this.serviceinterface.updateCourse(ce);
//         return ce;
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
