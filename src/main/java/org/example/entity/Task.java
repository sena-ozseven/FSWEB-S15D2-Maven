package org.example.entity;

public class Task implements Comparable<Task>{
    private String project;
    private String description;
    private String assignee;


    @Override
    public int compareTo(Task task) {
        return 0;
    }
}
