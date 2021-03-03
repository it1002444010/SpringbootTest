package pers.it.enums;

public enum  ExceptionEnum {
    USER_NOT_FIND(400,"用户不存在"),
    USER_SAVE_ERROR(400,"用户保存失败"),
    USER_DELETE_ERROR(400,"用户删除失败"),
    USER_INSERT_ERROR(400,"用户新增失败"),
    ;
    ExceptionEnum(){}

    ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
