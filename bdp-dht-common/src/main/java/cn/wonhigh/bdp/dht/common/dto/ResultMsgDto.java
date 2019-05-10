package cn.wonhigh.bdp.dht.common.dto;

import java.io.Serializable;

public class ResultMsgDto implements Serializable {

    /**
     * 结果编码：
     * 默认：0 表示成功
     * 其他则可以自定义错误码
     */
    private Object code="0";
    /**
     * 错误信息
     * 如果出现异常最好将异常信息返回给调用方
     */
    private Object errorMsg;
    /**
     * 成功结果信息
     * 全部使用gson信息的字符串
     */
    private Object msg;


    public ResultMsgDto(){

    }

    public ResultMsgDto(Object code, Object errorMsg, Object msg) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.msg = msg;
    }

    public ResultMsgDto(Object code, Object msg) {
        this.code = code;
        this.msg = msg;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

}
