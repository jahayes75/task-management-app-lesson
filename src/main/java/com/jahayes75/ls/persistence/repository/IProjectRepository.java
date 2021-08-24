package com.jahayes75.ls.persistence.repository;

import java.util.Optional;

import com.jahayes75.ls.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}

