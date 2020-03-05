package cn.joharxiao.common.vo;

import cn.joharxiao.common.ExceptionEnum;


public class ExceptionResult {
    private int statusCode;
    private String message;
    private Long timeStamp;
    public ExceptionResult(ExceptionEnum eenum){
        this.statusCode=eenum.getCode();
        this.message=eenum.getMsg();
        this.timeStamp=System.currentTimeMillis();
    }
}
