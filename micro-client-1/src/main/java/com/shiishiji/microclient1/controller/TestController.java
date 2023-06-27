package com.shiishiji.microclient1.controller;

import com.shiishiji.microclient1.dto.TestResource;
import com.shiishiji.microclient1.repository.TestResourceRepository;
import com.shiishiji.microclient1.repository.TestResourceRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    TestResourceRepository repository;

    public TestController() {
        this.repository = new TestResourceRepositoryImpl();
    }

    @GetMapping("/tests")
    ArrayList<TestResource> all() {
        return this.repository.findAll();
    }

}
