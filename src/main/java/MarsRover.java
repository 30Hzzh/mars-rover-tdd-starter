public class MarsRover {
    private int xPosition;
    private int yPosition;
    private String direction;

    public MarsRover(int xPosition, int yPosition, String direction) {
        if (!direction.matches("N| E| S| W")) throw new IllegalArgumentException("Invalid direction: " + direction);
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public String getPosition() {
        return "(" + xPosition + ", " + yPosition + ") " + direction;
    }

    // Additional methods for moving the rover would go here
}
