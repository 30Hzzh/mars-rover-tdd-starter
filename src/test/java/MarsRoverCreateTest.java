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
}
