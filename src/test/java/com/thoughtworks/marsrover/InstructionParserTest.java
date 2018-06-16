package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructionParserTest {

    @Test
    public void testParseGrid() {
        String instruction = "5 5";
        assertEquals(new Grid(5, 5), InstructionParser.parseGrid(instruction));
    }

    @Test
    public void testParsePosition() {
        String instruction = "1 2 N";
        assertEquals(new Position(1, 2, Direction.NORTH), InstructionParser.parsePosition(instruction));
    }
}