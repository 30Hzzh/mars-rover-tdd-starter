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
}
