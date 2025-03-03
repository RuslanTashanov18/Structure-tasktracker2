public class Epic {
    private int id;
    private String epicName;
    private String status;
    public Epic(String epicName, int id, String status){
        this.epicName = epicName;
        this.id = id;
        this.status = status;
    }
    public int getId() {
        return id;
    }
}
