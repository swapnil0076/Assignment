package com.proj.exception;

public class GitHubDataNotFound extends RuntimeException{

    public GitHubDataNotFound() {
    }

    public GitHubDataNotFound(String message) {
        super(message);
    }
}
