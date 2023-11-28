package todolist.api.todolist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import todolist.api.todolist.entity.Todo;
public interface TodoRepository extends JpaRepository<Todo, Long>{
} 
