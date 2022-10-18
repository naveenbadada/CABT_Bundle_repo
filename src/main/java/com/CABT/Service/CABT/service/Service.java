package com.CABT.Service.CABT.service;

import com.CABT.Service.CABT.entity.Bundles;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
@AutoConfiguration
public interface Service {
    List<Bundles> get();

    Bundles get(String id);

    void save(Bundles bundles);

    void delete(String bundleUid);
}