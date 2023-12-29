package com.example.demo.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "moniteur")
public class Moniteur extends User{   
    @Id
    @Column(name = "moniteurid")
    private Long moniteurid;
    @Column(name = "prix")
    private float prix;
    //Getters and Setters
    //Id
    public Long getMoniteurId(){
        return moniteurid;
    }
    public void setMoniteurId(Long MoniteurId){
        this.moniteurid=MoniteurId;
    }
    //prix
    public float getPrix(){
        return prix;
    }
    public void setPrix(float Prix){
        this.prix=Prix;
    }
}