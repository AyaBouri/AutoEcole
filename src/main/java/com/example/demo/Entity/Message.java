package com.example.demo.Entity;
import java.time.LocalDate;
import com.example.demo.Model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name ="message")
public class Message {  
    @Id
    @Column(name = "messageId")
    private Long messageId;
    @Column(name = "libelle") 
    private String libelle;
    @Column(name = "Description")
    private String description;
    @Column(name = "date_envoie")
    private LocalDate date_envoie;
    @OneToOne(mappedBy = "userid")
    private User user;
    //getter and setters
    public Long getMessageId(){
        return messageId;
    }
    public void setMessageId(Long messageId){
        this.messageId=messageId;
    }
    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String Libelle){
        this.libelle=Libelle;
    }
    public LocalDate getDateEnvoie(){
        return date_envoie;
    }
    public void setDateEnvoie(LocalDate date_envoie){
        this.date_envoie=date_envoie;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
}