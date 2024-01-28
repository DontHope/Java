package inn.Homework2;

public class Room {
    double height;
    int width;
    String table;
    String chair;

    public Room(int width, String table, String chair) {
        this.height = 2.95;
        this.width = width;
        this.table = table;
        this.chair = chair;
    }

    public Room(int width) {
        this.height = 2.95;
        this.width = width;
    }
}
