package com.people.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.people.entity.People;
import com.people.mapper.PeopleMapper;
import com.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public PageInfo<People> getAllPeople(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<People> peopleList = peopleMapper.getAllPeople();
        PageInfo<People> pageInfo=new PageInfo<>(peopleList);
        return pageInfo;
    }
}
