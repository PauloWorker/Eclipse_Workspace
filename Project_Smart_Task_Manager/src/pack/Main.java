package pack;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

// Interface for things that can be printed
interface Printable {
    void print();
}

// ==== MODEL ==== //
abstract class Task implements Printable {
    private final UUID id;
    private String title;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String title, LocalDate dueDate) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public UUID getId() { return id; }
    public String getTitle() { return title; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return completed; }

    public void setTitle(String title) { this.title = title; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public void complete() { this.completed = true; }

    @Override
    public void print() {
        System.out.println("[" + (completed ? "✔" : "✘") + "] " +
                title + " (Due: " + dueDate + ")");
    }
}

// Polymorphism: different tipos de tarefas
class StudyTask extends Task {
    public StudyTask(String title, LocalDate dueDate) {
        super("Study: " + title, dueDate);
    }
}

class WorkTask extends Task {
    public WorkTask(String title, LocalDate dueDate) {
        super("Work: " + title, dueDate);
    }
}

class LifeTask extends Task {
    public LifeTask(String title, LocalDate dueDate) {
        super("Life: " + title, dueDate);
    }
}

// ==== SERVICE ==== //
class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void complete(UUID id) {
        tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .ifPresent(Task::complete);
    }

    public List<Task> getAll() {
        return tasks;
    }

    public List<Task> getPending() {
        return tasks.stream()
                .filter(t -> !t.isCompleted())
                .collect(Collectors.toList());
    }

    public List<Task> sortByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
    }
}

// ==== MAIN ==== //
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.add(new StudyTask("Learn OOP in Java", LocalDate.now().plusDays(2)));
        manager.add(new WorkTask("Finish API module", LocalDate.now().plusDays(1)));
        manager.add(new LifeTask("Buy groceries", LocalDate.now().plusDays(3)));

        System.out.println("\n=== ALL TASKS ===");
        manager.getAll().forEach(Task::print);

        System.out.println("\n=== PENDING TASKS ===");
        manager.getPending().forEach(Task::print);

        System.out.println("\n=== SORTED BY DATE ===");
        manager.sortByDate().forEach(Task::print);
    }
}
