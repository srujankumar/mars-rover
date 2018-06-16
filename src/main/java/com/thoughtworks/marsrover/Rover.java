package com.thoughtworks.marsrover;

public class Rover {
    private Position position;
    private Grid grid;

    public Rover(Grid grid, Position position) {
        this.grid = grid;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void process(String instructions) {
        instructions.chars().mapToObj( c -> (char) c).forEach(this::process);
    }

    private void process(Character instruction) {
        switch (instruction) {
            case 'R':
                turnRight();
                break;
            case 'L':
                turnLeft();
                break;
            case 'M':
                move();
                break;
        }
    }

    private void move() {
        if(grid.isValidMove(position.moveAhead())) {
            position = position.moveAhead();
        }
    }

    private void turnLeft() {
        position = position.rotateLeft();
    }

    private void turnRight() {
        position = position.rotateRight();
    }

    @Override
    public String toString() {
        return position.toString();
    }
}
