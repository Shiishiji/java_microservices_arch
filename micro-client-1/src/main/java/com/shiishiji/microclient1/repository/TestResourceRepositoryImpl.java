package com.shiishiji.microclient1.repository;

import com.shiishiji.microclient1.dto.TestResource;

import java.util.ArrayList;

public class TestResourceRepositoryImpl implements TestResourceRepository {

    ArrayList<TestResource> database;

    public TestResourceRepositoryImpl() {
        this.database = new ArrayList<>();
        this.database.add(new TestResource("name1", 1));
        this.database.add(new TestResource("name2", 2));
        this.database.add(new TestResource("name3", 3));
        this.database.add(new TestResource("name4", 4));
        this.database.add(new TestResource("name5", 5));
        this.database.add(new TestResource("name6", 6));
        this.database.add(new TestResource("name7", 7));
    }

    @Override
    public ArrayList<TestResource> findAll() {
        return this.database;
    }
}
