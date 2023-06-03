package service;

import data.ToDo;
import exception.EntityNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;
import repository.ToDoRepository;

@Service
public class ToDoService {
  private ToDoRepository toDoRepository;

  public List<ToDo> findAll() {
    return toDoRepository.findAll();
  }

  public ToDo findById(String id) {
    return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  public ToDo save(ToDo toDo) {
    return toDoRepository.save(toDo);
  }

  public void deleteById(String id) {
    toDoRepository.deleteById(id);

  }
}
