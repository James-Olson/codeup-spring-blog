package com.codeup.codeupspringblog.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, columnDefinition = "VarChar(50)")
    public long username;
    @Column(columnDefinition = "VarChar(50)")
    public long email;
    @Column(nullable = false, columnDefinition = "VarChar(50)")
    long password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    public List<Post> posts;
}

