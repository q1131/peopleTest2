package com.people.service;

import com.github.pagehelper.PageInfo;
import com.people.entity.People;

public interface PeopleService {
    PageInfo<People> getAllPeople(Integer page, Integer rows);
}
