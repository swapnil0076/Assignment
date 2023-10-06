package com.proj.service;

import com.proj.exception.GitHubDataAlreadyExists;
import com.proj.exception.GitHubDataNotFound;
import com.proj.exception.GithubUserNotFound;
import com.proj.model.GitHubDataEntity;
import com.proj.repo.GitHubDataEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GitHubDataServiceImpl implements GitHubDataEntityService {

    @Autowired
    GitHubDataEntityRepository entityRepository;

    @Override
    public GitHubDataEntity fetchAndSaveGitHubData(GitHubDataEntity gitHubDataEntity) throws GitHubDataAlreadyExists, GithubUserNotFound {

       Optional<GitHubDataEntity> b = entityRepository.findByName(gitHubDataEntity.getName());

        if(!b.isPresent()){
            entityRepository.save(gitHubDataEntity);
            return gitHubDataEntity;
        }
            throw new GitHubDataAlreadyExists("GitHub data with same user name already Exists");


    }

    @Override
    public GitHubDataEntity getTheGitHubData(Integer gitId) throws GitHubDataNotFound {

        Optional<GitHubDataEntity> data =  entityRepository.findById(gitId);

        if(data.isPresent()){

            return data.get();
        }

        throw new GitHubDataNotFound("The GitHUb data you want is not Found");
    }
}
