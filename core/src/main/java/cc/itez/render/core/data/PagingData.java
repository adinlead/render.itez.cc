package cc.itez.render.core.data;

import cc.itez.render.core.std.RenderTemplate;
import cc.itez.render.core.val.RestField;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 分数数据封装
 *
 * @param <T>
 */
public class PagingData<T> extends RenderData {
    /**
     * 当前页码
     */
    private Integer idx;
    /**
     * 每页条数
     */
    private Integer size;
    /**
     * 列表
     */
    private List<T> list;
    /**
     * 记录总数
     */
    private Long count;

    public PagingData() {
        super();
        this.putIdx(0)
                .putSize(0)
                .putCount(0L)
                .putList(Collections.emptyList());
    }

    public PagingData(RenderTemplate r) {
        super(r);
        this.putIdx(0)
                .putSize(0)
                .putCount(0L)
                .putList(Collections.emptyList());
    }

    public Integer getIdx() {
        if (this.idx == null) {
            this.idx = 1;
        }
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
        this.put(RestField.NUM.fieldName(), this.idx);
    }

    public PagingData<T> putIdx(Integer idx) {
        this.setIdx(idx);
        return this;
    }

    public Integer getSize() {
        if (this.size == 0) {
            this.size = 10;
        }
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
        this.put(RestField.SIZE.fieldName(), this.size);
    }

    public PagingData<T> putSize(Integer size) {
        this.setSize(size);
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
        this.put(RestField.LIST.fieldName(), this.list);
    }

    public PagingData<T> putList(List<T> list) {
        this.setList(list);
        return this;
    }

    public void setList(Supplier<List<T>> supplier) {
        this.list = supplier.get();
        this.put(RestField.LIST.fieldName(), this.list);
    }

    public PagingData<T> putList(Supplier<List<T>> supplier) {
        this.setList(supplier);
        return this;
    }

    /**
     * 根据页码与行数查询列表
     *
     * @param function 查询方法，入参为页面与行数
     * @return 分页数据
     */
    public PagingData<T> putList(BiFunction<Integer, Integer, List<T>> function) {
        this.setList(function.apply(this.getIdx(), this.getSize()));
        return this;
    }

    /**
     * 根据页码与行数查询列表
     *
     * @param function 查询方法，入参为页面与行数
     * @return 分页数据
     */
    public PagingData<T> putList(Function<PagingData<T>, List<T>> function) {
        this.setList(function.apply(this));
        return this;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
        this.put(RestField.COUNT.fieldName(), this.count);
    }

    public PagingData<T> putCount(Long count) {
        this.setCount(count);
        return this;
    }

    public PagingData<T> putCount(Supplier<Long> supplier) {
        this.setCount(supplier.get());
        return this;
    }

    public PagingData<T> putCount(Function<PagingData<T>, Long> function) {
        this.setCount(function.apply(this));
        return this;
    }

    @Override
    public PagingData putCode(int code) {
        this.setCode(code);
        return this;
    }

    @Override
    public PagingData putMsg(String msg) {
        this.setMsg(msg);
        return this;
    }

    @Override
    public PagingData putInfo(String info) {
        this.setInfo(info);
        return this;
    }

    @Override
    public PagingData putAlert(String alert) {
        this.setAlert(alert);
        return this;
    }

    /**
     * 循环处理列表内容
     *
     * @param consumer
     * @return
     */
    public PagingData each(Consumer<T> consumer) {
        if (this.list != null) {
            this.list.forEach(consumer);
            this.setList(this.list);
        }
        return this;
    }
}
