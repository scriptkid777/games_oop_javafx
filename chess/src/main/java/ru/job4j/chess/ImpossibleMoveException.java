package ru.job4j.chess;

public class ImpossibleMoveException extends RuntimeException {
    public ImpossibleMoveException(){}

    public ImpossibleMoveException(String message) {
        super(message);
    }

}
