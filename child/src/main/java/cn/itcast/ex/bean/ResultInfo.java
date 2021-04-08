package cn.itcast.ex.bean;

public class ResultInfo {
    private int code;//后端返回状态码0正常，-1失败
    private Object data;//后端返回结果数据对象
    private String message;//返回消息

    public static ResultInfo create(int code,String message,Object data){
        ResultInfo result=new ResultInfo();
        result.code=code;
        result.data=data;
        result.message=message;
        return result;
    }
    public static ResultInfo sucess(String message,Object data){
       return ResultInfo.create(0,message,data);
    }
    public static ResultInfo sucess(Object data){
        return ResultInfo.sucess("执行成功",data);
    }
    public static ResultInfo sucess(){
        return ResultInfo.sucess(null);
    }
    public static ResultInfo fail(String message){
        return ResultInfo.create(-1,message,null);
    }
    public static ResultInfo fail(){
        return ResultInfo.fail("执行失败");
    }
}
