import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverControlTest {
    @Test
    public void test_move_forward() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";
        // When
        marsRover.executeCommand(command);

        // Then
        assertEquals("(0, 1) N", marsRover.getPosition());
    }

    @Test
    public void test_turn_left() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "L";
        // When
        marsRover.executeCommand(command);

        // Then
        assertEquals("(0, 0) W", marsRover.getPosition());
    }

    @Test
    public void test_turn_right() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "R";
        // When
        marsRover.executeCommand(command);

        // Then
        assertEquals("(0, 0) E", marsRover.getPosition());
    }

    @Test
    public void test_move_backward() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "B";
        // When
        marsRover.executeCommand(command);

        // Then
        assertEquals("(0, -1) N", marsRover.getPosition());
    }

    @Test
    public void test_execute_multiple_commands() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String commands = "MMRMM";
        // When
        marsRover.executeCommand(commands);

        // Then
        assertEquals("(2, 2) E", marsRover.getPosition());
    }

    @Test
    public void test_execute_invalid_command() {
        // Given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "MMXRMFMLMMQBB"; // Invalid command
        // When
        String result = marsRover.executeCommand(command);

        //Then
        String invalidCommand = "XFQ";
        assertEquals(invalidCommand, result);
        assertEquals("(2, 2) N", marsRover.getPosition());
    }
}
