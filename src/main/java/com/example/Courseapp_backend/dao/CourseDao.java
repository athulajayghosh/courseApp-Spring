package com.example.Courseapp_backend.dao;

import com.example.Courseapp_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {

}
