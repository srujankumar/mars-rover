package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void shouldReturnLeft() {
        assertEquals(Direction.EAST, Direction.SOUTH.left());
        assertEquals(Direction.WEST, Direction.NORTH.left());
    }

    @Test
    public void shouldReturnRight() {
        assertEquals(Direction.WEST, Direction.SOUTH.right());
        assertEquals(Direction.EAST, Direction.NORTH.right());
    }

    @Test
    public void shouldReturnDirectionAlphabet() {
        assertEquals("E", Direction.EAST.toString());
        assertEquals("W", Direction.WEST.toString());
    }
}