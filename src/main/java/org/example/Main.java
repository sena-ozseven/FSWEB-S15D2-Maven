package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("hamster project", "fill the water", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("ucubik special project", "get the most expensive food for her", "ann", Status.ASSIGNED, Priority.HIGH);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("hamster project", "fill the water", "bob", Status.IN_QUEUE, Priority.HIGH);
        Task taskBob2 = new Task("ucubik special project", "get her the most expensive toys", "bob", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("hamster project", "clean her home", "carol", Status.IN_QUEUE, Priority.HIGH);
        Task taskCarol2 = new Task("ucubik special project", "brush her fur", "carol", Status.IN_PROGRESS, Priority.MED);
        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task unassigned = new Task("hamster project", "kiss them", "N/A", Status.IN_QUEUE, Priority.HIGH);
        Task unassigned2 = new Task("hamster project", "hug the hamsters", "N/A", Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassigned);
        unassignedTasks.add(unassigned2);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println(taskData.getTasks("bob"));

    }
}