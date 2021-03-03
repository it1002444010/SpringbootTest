package pers.it.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pers.it.enums.ExceptionEnum;
import pers.it.exception.MyException;
import pers.it.vo.ExceptionResult;

@ControllerAdvice
public class CommonExceptionHandler  {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResult> handleException(MyException e){
        ExceptionEnum em = e.getExceptionEnum();
        return ResponseEntity.status(em.getCode()).body(new ExceptionResult(e.getExceptionEnum()));
    }
}
