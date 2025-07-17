package org.example.entity;

import java.util.HashSet;
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


    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return getAnnsTasks();
            case "bob":
                return getBobsTasks();
            case "carol":
                return getCarolsTasks();
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(getAnnsTasks());
                allTasks.addAll(getBobsTasks());
                allTasks.addAll(getCarolsTasks());
                allTasks.addAll(getUnassignedTasks());
                return allTasks;
            default:
                throw new IllegalArgumentException("Invalid name: " + name);
        }
    }

    public Set<Task> getUnion(Set<Task> task1, Set<Task> task2) {
        Set<Task> copyTask1 = new HashSet<>(task1);
        copyTask1.addAll(task2);
        return copyTask1;
    }
    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2) {
        Set<Task> copyTask1 = new HashSet<>(task1);
        copyTask1.retainAll(task2);
        return copyTask1;
    }
    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2) {
        Set<Task> copyTask1 = new HashSet<>(task1);
        copyTask1.removeAll(task2);
        return copyTask1;
    }

}
