package com.g.veterinaryApp.repository;

import com.g.veterinaryApp.model.Sahip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SahipRepository extends CrudRepository<Sahip,Integer> {
    List<Sahip> findAll();
    Sahip findByIsim(String isim);
}
