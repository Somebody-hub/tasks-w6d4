package model;

public class Task {
    private String title;
    private TaskStatus taskStatus;
    private int priority;

    public Task(String title, TaskStatus taskStatus, int priority) {
        this.title = title;
        this.taskStatus = taskStatus;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task: " + title + " Status: " + taskStatus + " Priority: " + priority;
    }
}
