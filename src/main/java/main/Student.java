package main;

import java.util.ArrayList;

public class Student {
private long id;
private String name;
private ArrayList<Integer> numbers;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
