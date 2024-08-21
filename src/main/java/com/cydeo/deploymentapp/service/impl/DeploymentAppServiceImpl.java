package com.cydeo.deploymentapp.service.impl;

import com.cydeo.deploymentapp.repository.DeploymentAppRepository;
import com.cydeo.deploymentapp.service.DeploymentAppService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DeploymentAppServiceImpl implements DeploymentAppService {

    private final Faker faker;
    private final DeploymentAppRepository deploymentAppRepository;

    public DeploymentAppServiceImpl(Faker faker, DeploymentAppRepository deploymentAppRepository) {
        this.faker = faker;
        this.deploymentAppRepository = deploymentAppRepository;
    }

    @Override
    public String getRandomName() {
        return faker.name().fullName();
    }

    @Override
    public String getNameFromDB() {
        Long id = (long) new Random().nextInt(10) + 1;
        return deploymentAppRepository.findById(id).get().getName();
    }

}
