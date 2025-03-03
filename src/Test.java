public class Test {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task = new Task("Task1", 1, "NEW");
        Subtask subtask = new Subtask("Subtask1", 1, "NEW");
        Epic epic = new Epic("Epic1", 1, "NEW");
        taskManager.addTask(1, task);
        taskManager.addSubtask(1, subtask);
        taskManager.addEpic(1, epic);
    }
}
