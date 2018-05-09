package top.yangluotong.constant;

public enum WEEKDAY {
    MONDAY(1, "success"),
    TUESDAY(2, "faied");


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

    WEEKDAY(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
