package com.ermanetwork.springboothikariexample.controller;

import com.ermanetwork.springboothikariexample.model.Personel;
import com.ermanetwork.springboothikariexample.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personel")
public class PersonelController {

    @Autowired
    PersonelService personelService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Personel> getPersoneller(){
        return personelService.getAllPersonel();
    }
}
