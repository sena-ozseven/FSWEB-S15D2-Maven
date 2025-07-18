package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

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
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTasks;
            case "all":
                return getUnion(bobsTasks, carolsTasks, annsTasks);
        }
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task> ... sets) {
        HashSet<Task> allTasks = new LinkedHashSet<>();
        for (Set<Task> tasks : sets) {
            allTasks.addAll(tasks);
        }
        return allTasks;
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


    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                ", unassignedTasks=" + unassignedTasks +
                '}';
    }
}
