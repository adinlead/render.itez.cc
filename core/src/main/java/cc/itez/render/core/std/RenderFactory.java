package cc.itez.render.core.std;

import cc.itez.render.core.data.RenderData;
import cc.itez.render.core.data.ThrownData;

/**
 * 响应工厂接口
 */
public interface RenderFactory {
    /**
     * 提供响应数据
     *
     * @return 响应数据
     */
    RenderData render();

    /**
     * 抛出响应数据
     *
     * @return 抛出响应数据
     */
    ThrownData thrown();
}
