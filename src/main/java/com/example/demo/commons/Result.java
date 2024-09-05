package com.example.demo.commons;

import com.example.demo.commons.Constant.ResultConstant;
import lombok.Data;

@Data
public class Result<T>{
    private Integer code;
    private String msg;
    private T data;
    public Result<T> success(){
        code = ResultConstant.SUCCESS_CODE;
        msg = ResultConstant.SUCCESS_CONTENT;
        return this;
    }
    public Result<T> success(T data){
        code = ResultConstant.SUCCESS_CODE;
        msg = ResultConstant.SUCCESS_CONTENT;
        this.data = data;
        return this;
    }
    public Result<T> fail(){
        code = ResultConstant.FAIL_CODE;
        msg = ResultConstant.FAIL_CONTENT;
        return this;
    }
    public Result<T> fail(String msg){
        code = ResultConstant.FAIL_CODE;
        this.msg = msg;
        return this;
    }
}
