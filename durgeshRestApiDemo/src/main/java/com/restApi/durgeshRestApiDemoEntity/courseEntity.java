package com.restApi.durgeshRestApiDemoEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class courseEntity {

//    this course entity class
   public String courseName;
   @Id
   public Integer courseId;
   public String courseDesc;

   public courseEntity(){}
    public courseEntity(Integer courseId,String courseName,String courseDesc){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseDesc=courseDesc;
    }
}
