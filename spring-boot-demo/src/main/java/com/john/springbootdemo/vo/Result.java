package com.john.springbootdemo.vo;

/**
 * @author JohnZhong
 *
 * 响应页面所用到的类
 */
public class Result {

    private Boolean successful;
    private String msg;
    private Object data;

    public Result(Boolean successful, String msg, Object data) {
        this.successful = successful;
        this.msg = msg;
        this.data = data;
    }

    /**
     *  基础的响应方法
     * @param successful 内容是否执行成功
     * @param msg 返回信息
     * @param data 返回的数据
     * @return 封装的响应对象
     */
    public static Result response(Boolean successful, String msg, Object data){
        return new Result(successful, msg, data);
    }


    /**
     * 返回成功携带成功信息与数据
     * @param msg 成功信息
     * @param data 数据
     * @return 封装的响应对象
     */
    public static Result ok(String msg, Object data){
        return new Result(true, msg, data);
    }


    /**
     *  返回成功携带数据
     * @param data 数据
     * @return 封装的响应对象
     */
    public static Result ok(Object data){
        return new Result(true, "执行成功！", data);
    }

    /**
     * 返回成功没有数据
     * @return
     */
    public static Result ok(){
        return new Result(true, "执行成功！", null);
    }

    /**
     * 返回失败需要传入失败信息
     * @param msg 失败信息
     * @return 封装的响应对象
     */
    public static Result fail(String msg){
        return new Result(false, msg, null);
    }

    /**
     * 返回失败携带默认信息没有数据
     * @return 封装的响应对象
     */
    public static Result fail(){
        return new Result(false, "执行失败！", null);
    }


    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
