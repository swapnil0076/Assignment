package com.proj.repo;

import com.proj.model.GitHubDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GitHubDataEntityRepository extends JpaRepository<GitHubDataEntity, Integer> {

    public Optional<GitHubDataEntity> findByName(String name);

}
