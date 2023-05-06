package com.restApi.dao;


import com.restApi.durgeshRestApiDemoEntity.courseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDao extends JpaRepository<courseEntity, Integer> {

}
