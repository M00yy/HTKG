package com.m00yy.service;

import com.m00yy.dao.PersonDao;
import com.m00yy.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonDao dao;
    public Integer insertPerson(String t_user_id){
        return dao.insertPerson(t_user_id);
    }

    public Person selectPersonById(String t_user_id){
        return dao.selectPersonById(t_user_id);
    }

    public Integer updatePerson(Person person){
        return dao.updatePerson(person);
    }
}
