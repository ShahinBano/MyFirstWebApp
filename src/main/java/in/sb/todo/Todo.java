package in.sb.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    @Size(min=10,message = "Enter atleast 10 character")
    private String description;
    private LocalDate date;
    private boolean done;

    public Todo() {
    }

    public Todo(int id, String username, String description, LocalDate date, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.date = date;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public Todo setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Todo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Todo setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Todo setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public boolean isDone() {
        return done;
    }

    public Todo setDone(boolean done) {
        this.done = done;
        return this;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", done=" + done +
                '}';
    }
}
