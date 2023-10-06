package com.proj.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "github_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GitHubDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String htmlUrl;
    private String description;
    private String createdAt;
    private int openIssues;
    private int watchers;
    @ManyToOne(cascade = CascadeType.ALL)
    private Owner owner;

}
