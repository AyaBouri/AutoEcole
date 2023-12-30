package com.example.demo.Entity;
import java.util.List;
import com.example.demo.Model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "login")
public class Login {
    @Id
    @Column(name = "loginid")
    private Long loginid;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "userid")
    private List<User> users;   
}