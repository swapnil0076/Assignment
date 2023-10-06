package com.proj;


import com.proj.controller.GitHubController;
import com.proj.model.GitHubDataEntity;
import com.proj.service.GitHubDataEntityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GitHubControllerTest {

    @InjectMocks
    private GitHubController gitHubController;

    @Mock
    private GitHubDataEntityService gitHubDataEntityService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFetchAndSaveGitHubData() {
        GitHubDataEntity testData = new GitHubDataEntity();
        when(gitHubDataEntityService.fetchAndSaveGitHubData(testData)).thenReturn(testData);

        ResponseEntity<String> response = gitHubController.fetchAndSaveGitHubData(testData);

        assertEquals("Data saved successfully!", response.getBody());
    }

    @Test
    public void testGetGitHubDataById() {
        Integer id = 1;
        GitHubDataEntity testData = new GitHubDataEntity();
        when(gitHubDataEntityService.getTheGitHubData(id)).thenReturn(testData);

        ResponseEntity<GitHubDataEntity> response = gitHubController.getGitHubDataById(id);

        assertEquals(testData, response.getBody());
    }
}
