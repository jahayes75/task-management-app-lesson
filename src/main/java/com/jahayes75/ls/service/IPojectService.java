package com.jahayes75.ls.service;

import java.util.Optional;

import com.jahayes75.ls.persistence.model.Project;

public interface IPojectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}