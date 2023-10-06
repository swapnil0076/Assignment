package com.proj.exception;

public class GithubUserNotFound extends RuntimeException{

    public GithubUserNotFound() {
    }

    public GithubUserNotFound(String message) {
        super(message);
    }
}
