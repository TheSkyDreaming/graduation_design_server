package cn.joharxiao.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {
    RESOURCE_CANNOT_BE_NULL(400,"资源名称不能为空"),
    ;
    private int code;
    private String msg;
}
