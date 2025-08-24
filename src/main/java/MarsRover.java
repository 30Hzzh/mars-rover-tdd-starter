public class MarsRover {
    private int xPosition;
    private int yPosition;
    private String direction;

    public MarsRover(Integer xPosition, Integer yPosition, String direction) {
        if (xPosition == null || yPosition == null) {
            throw new NullPointerException("Position cannot be null");
        }
        if (!direction.matches("N| E| S| W")) throw new IllegalArgumentException("Invalid direction: " + direction);
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public String getDirection() {
        return direction;
    }


    public MarsRover(String direction) {
        this(0, 0, direction);
    }

    public String getPosition() {
        return "(" + xPosition + ", " + yPosition + ") " + direction;
    }

    public void moveForward(String command) {
        String direction = this.direction;

        if (direction.equals("N")) {
            this.yPosition = this.yPosition + 1;
        }

        if (direction.equals("E")) {
            this.xPosition = this.xPosition + 1;
        }

        if (direction.equals("S")) {
            this.yPosition = this.yPosition - 1;
        }

        if (direction.equals("W")) {
            this.xPosition = this.xPosition - 1;
        }
    }

    // Additional methods for moving the rover would go here
}
