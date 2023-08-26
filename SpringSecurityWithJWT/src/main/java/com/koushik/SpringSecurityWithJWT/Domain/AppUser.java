package com.koushik.SpringSecurityWithJWT.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data //gives getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String userName;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER) //to manage relationship, load all roles whenever the user is being loaded
    private Collection<Role> roles = new ArrayList<>(); // list of roles

}
