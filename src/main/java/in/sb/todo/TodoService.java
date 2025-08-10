package in.sb.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();

    private static int todoCount=0;

    static {
        todos.add(new Todo(++todoCount,"Shahin","Learn AWS Certified",
                LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todoCount,"Pria","Learn DevOps",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todoCount,"Amit","Learn Java Certified",
                LocalDate.now().plusYears(3),false));
    }
    public List<Todo> findByUserName(String username){
        Predicate<? super Todo> predicate=todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }
    public void addTodo(String username, String description, LocalDate date, boolean done){
        Todo todo = new Todo(++todoCount, username,description,date,done);
        todos.add(todo);
    }
    public void deleteById(int id){
        Predicate<? super Todo> predicate=todo -> todo.getId()==id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate=todo -> todo.getId()==id;
      Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateDoto(@Valid Todo todo) {
      deleteById(todo.getId());
      todos.add(todo);
    }
}
