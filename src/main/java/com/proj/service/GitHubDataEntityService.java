package com.proj.service;

import com.proj.exception.GitHubDataAlreadyExists;
import com.proj.exception.GitHubDataNotFound;
import com.proj.exception.GithubUserNotFound;
import com.proj.model.GitHubDataEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubDataEntityService {

public GitHubDataEntity fetchAndSaveGitHubData(GitHubDataEntity gitHubDataEntity) throws GitHubDataAlreadyExists,GithubUserNotFound;
public GitHubDataEntity getTheGitHubData(Integer gitId) throws GitHubDataNotFound;

}
