package ru.itm.mycrud2springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "people")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    public User() {
    }

    public User(long id, int age, String name, String lastName) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}