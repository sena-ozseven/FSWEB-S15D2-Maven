package org.example.entity;

import java.util.Set;

public class TaskData {
    Set<Task> annsTasks;
    Set<Task> bobsTasks;
    Set<Task> carolsTasks;
    Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
    
    /*
    public Set<Task> getTasks(String name) {
        Set<String> name = new Set<Task>();
    }*/
}
