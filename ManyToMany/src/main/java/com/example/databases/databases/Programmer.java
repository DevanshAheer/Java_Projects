package com.example.databases.databases;

import jakarta.persistence.*;

import java.util.Set;
import java.util.concurrent.Semaphore;

@Entity
@Table(name ="programmer")
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    private String name;
    public int salary;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name= "programmers_projects", joinColumns = @JoinColumn(name = "programmer_id",referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName ="id"))
    private Set<Projects> projects;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }
}
