package com.CABT.Service.CABT.controller;

import com.CABT.Service.CABT.entity.Bundles;
import com.CABT.Service.CABT.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.Id;
import java.util.*;
@AutoConfiguration
@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/bundles")
    public Bundles save(@RequestBody Bundles bundles) {
        service.save(bundles);
        return bundles;
    }

    @GetMapping("/bundles")
    public List<Bundles> get(){
        return service.get();
    }

    @GetMapping("/bundles/{bundleUid}")
    public Bundles get(@PathVariable String bundleUid) {
        Bundles bundles = service.get(bundleUid);
        if(bundles == null) {
            throw new RuntimeException("Bundle not found for the BundleUid:"+bundleUid);
        }
        return bundles;
    }

    @PutMapping("/bundles")
    public Bundles update(@RequestBody Bundles bundles) {
        service.save(bundles);
        return bundles;
    }

    @DeleteMapping("/bundles/{bundleUid}")
    public String delete(@PathVariable String bundleUid) {
        service.delete(bundleUid);
        return "Bundles has been deleted with BundleUid:"+bundleUid;
    }
}
