public class Task {
    private int id;
    private String taskName;
    private String status;
    public Task(String taskName, int id, String status){
        this.taskName = taskName;
        this.id = id;
        this.status = status;
    }
    public int getId() {
        return id;
    }
}
