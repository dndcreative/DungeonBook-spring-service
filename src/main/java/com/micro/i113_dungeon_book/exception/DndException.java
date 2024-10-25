package com.micro.i113_dungeon_book.exception;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

@Getter
public class DndException extends RuntimeException {

    private final String message;
    private final HttpStatus status;
    private Exception cause;

    public DndException(String message, HttpStatus status) {
        super();
        this.status = status;
        this.message = message;
    }

    public DndException(String message, Exception cause, HttpStatus status) {
        super();
        this.cause = cause;
        this.status = status;
        this.message = message;
    }

    public DndException(Exception cause, HttpStatus status) {
        super();
        this.status = status;
        this.cause = cause;
        this.message = StringUtils.EMPTY;
    }
}
