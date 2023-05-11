package cc.itez.render.core.std;

/**
 * 响应数据模板
 */
public interface RenderTemplate {
    /**
     * 获取响应码
     *
     * @return 响应码
     */
    int getCode();

    /**
     * 获取响应消息
     *
     * @return 响应消息
     */
    String getMsg();

    /**
     * 获取响应消息
     *
     * @return 响应消息
     */
    default String getInfo(){
        return null;
    };
}
