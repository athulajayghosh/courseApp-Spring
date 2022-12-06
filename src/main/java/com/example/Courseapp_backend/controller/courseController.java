package com.example.Courseapp_backend.controller;

import com.example.Courseapp_backend.dao.CourseDao;
import com.example.Courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class courseController {
    @Autowired
    private CourseDao dao;


    @GetMapping("/")
    public String homepage(){
        return "Page Working fine";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> viewall(){
        return (List<Course>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcourse",consumes = "application/json",produces = "application/json")
    public String addcourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getCourseDate().toString());
        dao.save(c);
        return "course added";
        }


}
