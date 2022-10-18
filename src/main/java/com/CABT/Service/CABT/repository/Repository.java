package com.CABT.Service.CABT.repository;

import  com.CABT.Service.CABT.entity.Bundles;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
@AutoConfiguration
public interface Repository extends JpaRepository<Bundles,String> {

    List<Bundles> get();

    Bundles get(String bundleUid);

    void delete(String bundleUid);
}

