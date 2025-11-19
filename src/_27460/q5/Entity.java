package _27460.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if(id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Created: " + createdDate);
        System.out.println("Updated: " + updatedDate);
    }
}

