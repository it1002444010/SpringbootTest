package pers.it.exception;

import pers.it.enums.ExceptionEnum;


public class MyException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

    public MyException(){}

    public MyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
