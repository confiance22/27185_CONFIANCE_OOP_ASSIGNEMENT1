package package27185.q2;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("id>0");
        this.id = id;
        this.createdDate = createdDate == null ? LocalDate.now() : createdDate;
        this.updatedDate = updatedDate == null ? LocalDate.now() : updatedDate;
    }

    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
}