package com.example.listam.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Item item;
    private Date commentDate;
    @Column(name = "comment")
    private String commentText;
    @ManyToOne
    private User user;


}
