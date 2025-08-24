import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverCreateTest {
    @Test
    public void test_create_rover_with_valid_input() {

        // Given
        int xPosition = 1;
        int yPosition = 2;
        String direction = "N";

        // When
        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);

        // Then
        assertEquals("(1, 2) N", marsRover.getPosition());
    }

    @Test
    public void test_create_rover_with_invalid_direction() {
        // Given
        int xPosition = 0;
        int yPosition = 0;
        String direction = "X"; // Invalid direction

        // When
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new MarsRover(xPosition, yPosition, direction);
        });

        // Then
        assertEquals("Invalid direction: X", exception.getMessage());
    }

    @Test
    public void test_create_rover_with_null_position() {
        // Given
        String direction = "N"; // Valid direction
        // When Create

        // Then
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new MarsRover(null, null, direction);
        });
        assertEquals("Position cannot be null", exception.getMessage());
    }

    @Test
    public void test_create_rover_without_position() {
        // Given
        String direction = "N"; // Valid direction
        // When Create
        MarsRover marsRover = new MarsRover(0, 0, direction);
        // Then
        assertEquals("(0, 0) N", marsRover.getPosition());
    }
}
