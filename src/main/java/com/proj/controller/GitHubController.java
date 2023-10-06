package com.proj.controller;

import com.proj.model.GitHubDataEntity;
import com.proj.service.GitHubDataEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GitHubController {

    @Autowired
    GitHubDataEntityService gitHubDataEntityService;


    @PostMapping("/api/github")
    public ResponseEntity<String> fetchAndSaveGitHubData(@RequestBody GitHubDataEntity data) {

        gitHubDataEntityService.fetchAndSaveGitHubData(data);

        return ResponseEntity.ok("Data saved successfully!");
    }

    @GetMapping("/api/github/{id}")
    public ResponseEntity<GitHubDataEntity> getGitHubDataById(@PathVariable Integer id) {

        GitHubDataEntity data = gitHubDataEntityService.getTheGitHubData(id);

        return ResponseEntity.ok(data);
    }




}
