package com.cydeo.fakeuserapp.service.impl;

import com.cydeo.fakeuserapp.repository.FakeUserRepository;
import com.cydeo.fakeuserapp.service.FakeUserService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FakeUserServiceImpl implements FakeUserService {

    private final Faker faker;
    private final FakeUserRepository fakeUserRepository;

    public FakeUserServiceImpl(Faker faker, FakeUserRepository fakeUserRepository) {
        this.faker = faker;
        this.fakeUserRepository = fakeUserRepository;
    }

    @Override
    public String getRandomName() {
        return faker.name().fullName();
    }

    @Override
    public String getNameFromDB() {
        Long id = (long) new Random().nextInt(10) + 1;
        return fakeUserRepository.findById(id).get().getName();
    }

}
