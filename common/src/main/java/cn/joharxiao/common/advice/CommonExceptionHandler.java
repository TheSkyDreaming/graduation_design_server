package cn.joharxiao.common.advice;

import cn.joharxiao.common.ExceptionEnum;
import cn.joharxiao.common.exception.MyException;
import cn.joharxiao.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<ExceptionResult> handlerException(MyException e){
        ExceptionEnum eenum=e.getExceptionEnum();
        return ResponseEntity.status(eenum.getCode()).body(new ExceptionResult(eenum));
    }
}
