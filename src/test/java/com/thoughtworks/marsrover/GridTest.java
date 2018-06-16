package com.thoughtworks.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class GridTest {
    private Grid grid;

    @Before
    public void setupGrid() {
        grid = new Grid(5, 5);
    }

    @Test
    public void shouldReturnTrueIfAMoveIsValid() {
        Position position = new Position(1, 2, Direction.NORTH);

        assertTrue(grid.isValidMove(position));
    }

    @Test
    public void shouldReturnFalseIfAMoveIsInvalid() {
        Position positionQ1 = new Position(1, 6, Direction.NORTH);
        Position positionQ3 = new Position(-1, -6, Direction.NORTH);

        assertFalse(grid.isValidMove(positionQ1));
        assertFalse(grid.isValidMove(positionQ3));
    }
}
