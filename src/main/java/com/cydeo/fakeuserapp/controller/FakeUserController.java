package com.cydeo.fakeuserapp.controller;
import com.cydeo.fakeuserapp.service.FakeUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FakeUserController {
    private final FakeUserService fakeUserService;
    public FakeUserController(FakeUserService fakeUserService) {
        this.fakeUserService = fakeUserService;
    }
    @GetMapping("/no-db/random")
    public ResponseEntity<String> getRandomName() {
        return ResponseEntity.ok(fakeUserService.getRandomName());
    }

    @GetMapping("/with-db/random")
    public ResponseEntity<String> getNameDromDB() {
        return ResponseEntity.ok(fakeUserService.getNameFromDB());
    }

}
