package cc.itez.render.core.data;

import cc.itez.render.core.std.RenderBuilder;
import cc.itez.render.core.std.RenderTemplate;

public class ThrownData extends RuntimeException implements RenderBuilder<ThrownData> {
    /**
     * 响应数据
     */
    private final RenderData data;

    public ThrownData(RenderData data) {
        this.data = data;
    }

    public ThrownData(RenderTemplate rt) {
        this.data = new RenderData(rt);
    }

    @Override
    public int getCode() {
        return this.data.getCode();
    }

    @Override
    public void setCode(int code) {
        this.data.setCode(code);
    }

    @Override
    public ThrownData putCode(int code) {
        this.setCode(code);
        return this;
    }

    @Override
    public String getMsg() {
        return this.data.getMsg();
    }

    @Override
    public void setMsg(String msg) {
        this.data.setMsg(msg);
    }

    @Override
    public ThrownData putMsg(String msg) {
        this.setMsg(msg);
        return this;
    }

    @Override
    public String getInfo() {
        return this.data.getInfo();
    }

    @Override
    public void setInfo(String info) {
        this.data.setInfo(info);
    }

    @Override
    public ThrownData putInfo(String info) {
        this.setInfo(info);
        return this;
    }

    @Override
    public String getAlert() {
        return this.data.getAlert();
    }

    @Override
    public void setAlert(String alert) {
        this.data.setAlert(alert);
    }

    @Override
    public ThrownData putAlert(String alert) {
        this.setAlert(alert);
        return this;
    }
}
