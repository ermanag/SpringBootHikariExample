package com.ermanetwork.springboothikariexample.repository;

import com.ermanetwork.springboothikariexample.model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonelRepository extends JpaRepository<Personel, Long> {

}
