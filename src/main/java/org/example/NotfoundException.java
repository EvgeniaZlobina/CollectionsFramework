package org.example;

public class NotfoundException extends RuntimeException{
    public NotfoundException (String playName) {
        super("Игрок с именем"+ playName+ "не найден");
    }
}
