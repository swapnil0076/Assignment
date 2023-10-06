package com.proj.exception;

public class GitHubDataAlreadyExists extends RuntimeException{

    public GitHubDataAlreadyExists() {
    }

    public GitHubDataAlreadyExists(String message) {
        super(message);
    }
}
