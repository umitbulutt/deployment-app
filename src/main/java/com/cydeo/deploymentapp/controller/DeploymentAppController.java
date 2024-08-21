package com.cydeo.deploymentapp.controller;
import com.cydeo.deploymentapp.service.DeploymentAppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeploymentAppController {
    private final DeploymentAppService deploymentAppService;
    public DeploymentAppController(DeploymentAppService deploymentAppService) {
        this.deploymentAppService = deploymentAppService;
    }
    @GetMapping("/no-db/random")
    public ResponseEntity<String> getRandomName() {
        return ResponseEntity.ok(deploymentAppService.getRandomName());
    }

    @GetMapping("/with-db/random")
    public ResponseEntity<String> getNameDromDB() {
        return ResponseEntity.ok(deploymentAppService.getNameFromDB());
    }

}
