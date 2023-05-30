package com.ermanetwork.springboothikariexample.service;

import com.ermanetwork.springboothikariexample.model.Personel;
import com.ermanetwork.springboothikariexample.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelService {

    @Autowired
    PersonelRepository personelRepository;

    public List<Personel> getAllPersonel() {
        return personelRepository.findAll();
    }
}
