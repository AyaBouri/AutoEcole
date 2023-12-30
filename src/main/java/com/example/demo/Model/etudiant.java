package com.example.demo.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="etudiant")
public class etudiant extends User{
    @Id
    @Column(name = "etudiantid")
    private Long etudiantid;
    //getter & setters
    public Long getetudiantId(){
        return etudiantid;
    }
    public void setEtudiantId(Long etudiantID){
        this.etudiantid=etudiantID;
    }
}