package com.thoughtworks.marsrover;

public class InstructionParser {

    public static Grid parseGrid(String instruction) {
        String[] coordinates = instruction.split(" ");
        return new Grid(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    public static Position parsePosition(String positionString) {
        String[] positionArray = positionString.split(" ");
        int xCoordinate = Integer.parseInt(positionArray[0]);
        int yCoordinate = Integer.parseInt(positionArray[1]);
        Direction direction = Direction.get(positionArray[2]);
        return new Position(xCoordinate, yCoordinate, direction);
    }
}
