package com.g.veterinaryApp.repository;

import com.g.veterinaryApp.model.Hayvan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HayvanRepository extends CrudRepository<Hayvan,Integer> {
    List<Hayvan> isimIleBul(String isim);
    Hayvan idIleBul(int id);
}
