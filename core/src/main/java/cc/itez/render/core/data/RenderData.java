package cc.itez.render.core.data;

import cc.itez.render.core.std.RenderBuilder;
import cc.itez.render.core.std.RenderTemplate;
import cc.itez.render.core.val.RestField;

import java.util.HashMap;

/**
 * 响应数据封装类
 */
public class RenderData extends HashMap<String, Object> implements RenderBuilder<RenderData> {
    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 响应信息
     */
    private String info;
    /**
     * 弹出信息
     */
    private String alert;

    public RenderData() {
        super();
        this.putCode(0).putMsg("").putInfo("");
    }

    public RenderData(RenderTemplate r) {
        super();
        this.putCode(r.getCode()).putMsg(r.getMsg()).putInfo(r.getInfo());
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
        this.put(RestField.CODE.fieldName(), this.code);
    }

    @Override
    public RenderData putCode(int code) {
        this.setCode(code);
        return this;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
        this.put(RestField.MSG.fieldName(), this.msg);
    }

    @Override
    public RenderData putMsg(String msg) {
        this.setMsg(msg);
        return this;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
        this.put(RestField.INFO.fieldName(), this.info);
    }

    @Override
    public RenderData putInfo(String info) {
        this.setInfo(info);
        return this;
    }

    @Override
    public String getAlert() {
        return this.alert;
    }

    @Override
    public void setAlert(String alert) {
        this.alert = alert;
        this.put(RestField.ALERT.fieldName(), this.alert);
    }

    @Override
    public RenderData putAlert(String alert) {
        this.setAlert(alert);
        return this;
    }
}
