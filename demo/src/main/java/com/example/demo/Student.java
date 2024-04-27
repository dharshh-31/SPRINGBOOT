package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "BOOKS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Name")
    String name;
    @Column(name = "Author")
    String author;
    @Column(name = "Num")
    int num;
    @Column(name = "Status")
    String status;
    public Student() {
    }
    public Student(int id, String name, String author, int num, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.num = num;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
