package com.CABT.Service.CABT.serviceImp;

import com.CABT.Service.CABT.entity.Bundles;
import com.CABT.Service.CABT.repository.Repository;
import com.CABT.Service.CABT.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import javax.transaction.Transactional;
import java.util.List;
@AutoConfiguration
@org.springframework.stereotype.Service
public class ServiceImp implements Service {

    @Autowired
    private Repository repo;

    @Transactional
    @Override
    public List<Bundles> get() {
        return repo.get();
    }

    @Transactional
    @Override
    public Bundles get(String bundleUid) {
        return (Bundles) repo.get(bundleUid);
    }

    @Transactional
    @Override
    public void save(Bundles bundles) {
        repo.save(bundles);
    }

    @Transactional
    @Override
    public void delete(String bundleUid) {
        repo.delete(bundleUid);
    }


}

