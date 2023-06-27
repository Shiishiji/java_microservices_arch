package com.shiishiji.microclient1.repository;

import com.shiishiji.microclient1.dto.TestResource;

import java.util.ArrayList;

public interface TestResourceRepository {

    ArrayList<TestResource> findAll();

}
