package com.thoughtworks.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    Rover rover;

    @Before
    public void setUp() {
        Grid grid = new Grid(5, 5);
        rover = new Rover(grid, new Position(1, 2, Direction.NORTH));
    }

    @Test
    public void shouldTurnRight() {
        rover.process("R");
        assertEquals(new Position(1, 2, Direction.EAST), rover.getPosition());
    }

    @Test
    public void shouldTurnLeft() {
        rover.process("L");
        assertEquals(new Position(1, 2, Direction.WEST), rover.getPosition());
    }

    @Test
    public void shouldMoveForward() {
        rover.process("M");
        assertEquals(new Position(1, 3, Direction.NORTH), rover.getPosition());
    }

    @Test
    public void shouldFollowMultipleInstructions() {
        rover.process("RLM");
        assertEquals(new Position(1, 3, Direction.NORTH), rover.getPosition());
    }

    @Test
    public void shouldNotMoveForwardForAnInvalidMove() {
        rover.process("MMMLMRMM");
        assertEquals(new Position(0, 5, Direction.NORTH), rover.getPosition());
    }
}
