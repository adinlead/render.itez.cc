package cc.itez.render.core.std;

public interface RenderBuilder<T> {

    int getCode();

    void setCode(int code);

    T putCode(int code);

    String getMsg();

    void setMsg(String msg);

    T putMsg(String msg);

    String getInfo();

    void setInfo(String info);

    T putInfo(String info);

    String getAlert();

    void setAlert(String alert);

    T putAlert(String alert);
}
