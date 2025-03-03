import java.util.HashMap;
public class TaskManager {
    HashMap<Integer, Task> taskHashMap = new HashMap<>();
    HashMap<Integer, Subtask> subtaskHashMap = new HashMap<>();
    HashMap<Integer, Epic> epicHashMap = new HashMap<>();
    public void addTask(int id, Task task){
        taskHashMap.put(id, task);
    }
    public void addSubtask(int id, Subtask subtask){
        subtaskHashMap.put(id, subtask);
    }
    public void addEpic(int id, Epic epic){
        epicHashMap.put(id, epic);
    }
}
