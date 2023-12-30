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
    //getter and setter
    //login id
    public Long getLoginId(){
        return loginid;
    }  
    public void setLoginId(Long loginId){
        this.loginid=loginId;
    }
    //email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    //password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    //user
    public List<User> getUser(){
        return users;
    }
    public void setUser(List<User> users){
        this.users=users;
    }
}