package com.jahayes75.ls.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jahayes75.ls.persistence.model.Project;
import com.jahayes75.ls.persistence.repository.IProjectRepository;
import com.jahayes75.ls.service.IPojectService;

@Service
public class ProjectServiceImpl implements IPojectService {

    @Autowired
    private IProjectRepository projectRepository;

    public ProjectServiceImpl() {
    }

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public IProjectRepository getProjectRepository() {
        return projectRepository;
    }

    public void setProjectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

}