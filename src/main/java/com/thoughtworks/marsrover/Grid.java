package com.thoughtworks.marsrover;

import java.util.Objects;

public class Grid {
    private int x;
    private int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValidMove(Position position) {
        return position.isWithIn(x, y) && position.isOutside(0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grid)) return false;
        Grid grid = (Grid) o;
        return x == grid.x &&
                y == grid.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
