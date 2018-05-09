package top.yangluotong.generic;

public class MyGeneric<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void getMyData(T data) {
        data.equals("2");
    }
}
