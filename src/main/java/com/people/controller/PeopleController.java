package com.people.controller;

import com.github.pagehelper.PageInfo;
import com.people.entity.People;
import com.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    @RequestMapping("/getAllPeopleController")
    @ResponseBody
    public Map<String,Object> getAllPeopleController(Integer page, Integer rows){
        PageInfo<People> pageInfo = peopleService.getAllPeople(page, rows);
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }
}
