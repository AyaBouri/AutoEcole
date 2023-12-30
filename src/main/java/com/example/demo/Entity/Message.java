package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="message")
public class Message {  
    @Id
    @Column(name = "messageId")
    private Long messageId; 
}