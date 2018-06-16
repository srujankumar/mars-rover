package com.thoughtworks.marsrover;

import java.util.Objects;

public class Position {
    private int x;
    private int y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Position rotateRight() {
        return new Position(x, y, direction.right());
    }

    public Position rotateLeft() {
        return new Position(x, y, direction.left());
    }

    public Position moveAhead() {
        switch (direction.toString()) {
            case "E":
                return new Position(x+1, y, direction);
            case "W":
                return new Position(x-1, y, direction);
            case "N":
                return new Position(x, y+1, direction);
            case "S":
                return new Position(x, y-1, direction);
            default:
                throw new IllegalStateException("Unknown Direction");
        }
    }

    public boolean isWithIn(int x, int y) {
        return this.x <= x && this.y <= y;
    }

    public boolean isOutside(int x, int y) {
        return this.x >= x && this.y >= y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y &&
                direction == position.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, direction);
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
