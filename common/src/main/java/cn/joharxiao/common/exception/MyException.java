package cn.joharxiao.common.exception;


import cn.joharxiao.common.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyException extends Exception{
    private ExceptionEnum exceptionEnum;

}
