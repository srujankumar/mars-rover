package com.thoughtworks.marsrover;

public enum Direction {

    EAST("E") {
        @Override
        public Direction left(){
            return NORTH;
        }

        @Override
        public Direction right(){
            return SOUTH;
        }
    },

    WEST("W") {
        @Override
        public Direction left(){
            return SOUTH;
        }

        @Override
        public Direction right(){
            return NORTH;
        }
    },

    NORTH("N") {
        @Override
        public Direction left(){
            return WEST;
        }

        @Override
        public Direction right(){
            return EAST;
        }
    },

    SOUTH("S") {
        @Override
        public Direction left(){
            return EAST;
        }

        @Override
        public Direction right(){
            return WEST;
        }
    };

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public abstract Direction left();

    public abstract Direction right();

    public static Direction get(String directionSign) {
        switch (directionSign) {
            case "E":
                return EAST;
            case "W":
                return WEST;
            case "N":
                return NORTH;
            case "S":
                return SOUTH;
            default:
                throw new IllegalStateException("Unknown Direction Sign");
        }
    }

    @Override
    public String toString() {
        return direction;
    }
}
