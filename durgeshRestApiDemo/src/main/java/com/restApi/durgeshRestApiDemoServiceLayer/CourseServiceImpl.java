package com.restApi.durgeshRestApiDemoServiceLayer;

import com.restApi.dao.MyDao;
import com.restApi.durgeshRestApiDemoEntity.courseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
// @service annotation tell us that this call will work on service layer
public class CourseServiceImpl implements RestApiDemoServiceInterface{


    @Autowired
    MyDao md;
//    List<courseEntity> ls;

    public CourseServiceImpl(){
//        ls=new ArrayList<>() ;
//        ls.add(new courseEntity(1,"Backend Developer"));
//        ls.add(new courseEntity(2,"FullStack Developer"));
//        ls.add(new courseEntity(3,"Data Engineer"));
    }
    @Override
    public List<courseEntity> getAllCourses() {

        return md.findAll();
    }

    @Override
    public courseEntity getCourseName(Integer id) {

//        for(int i=0;i<ls.size();i++){
//            courseEntity ce=ls.get(i);
//            if(ce.courseId==id){
//                return ce.courseName;
//            }
//        }
//        return "No Course Avaliable associated with given CourseId";

       return md.getOne(id);

    }

    @Override
    public courseEntity addNewCourse(courseEntity ce) {
//        ls.add(ce);
//        return ce;
        md.save(ce);
        return ce;

    }

    @Override
    public void updateCourse(courseEntity ce) {


//        ls=ls.stream().map(c->{
//            if(c.courseId==id){
//                c.courseId= ce.courseId;
//                c.courseName= ce.courseName;
//            }
//            return c;
//        }).collect(Collectors.toList());

        md.save(ce);


    }
}
