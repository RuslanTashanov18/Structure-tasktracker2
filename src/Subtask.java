public class Subtask {
    private int id;
    private String subtaskName;
    private String status;
    public Subtask(String subtaskName, int id, String status){
        this.subtaskName = subtaskName;
        this.id = id;
        this.status = status;
    }
    public int getId() {
        return id;
    }
}
