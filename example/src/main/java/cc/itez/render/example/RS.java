package cc.itez.render.example;

import cc.itez.render.core.data.RenderData;
import cc.itez.render.core.data.ThrownData;
import cc.itez.render.core.std.RenderFactory;
import cc.itez.render.core.std.RenderTemplate;

public enum RS implements RenderFactory, RenderTemplate {
    /* ========== 常用状态码 ========== */
    /** 成功 */
    OK(200, "OK", "成功"),
    /** 页面不存在 */
    NOT_FOUND(404, "Not Found", "页面不存在"),
    /** 错误请求 */
    BAD_REQUEST(400, "Bad Request", "错误请求"),
    /** 未授权 */
    UNAUTHORIZED(401, "Unauthorized", "未授权"),
    /** 服务器内部错误 */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "服务器内部错误"),
    /** 未实现 */
    NOT_IMPLEMENTED(501, "Not Implemented", "未实现"),

    /* ========== 信息性状态码 ========== */
    /** 继续 */
    CONTINUE(100, "Continue", "继续"),
    /** 交换协议 */
    SWITCHING_PROTOCOLS(101, "Switching Protocols", "交换协议"),
    /** 处理中 */
    PROCESSING(102, "Processing", "处理中"),

    /* ========== 成功状态码 ========== */
    /** 已创建 */
    CREATED(201, "Created", "已创建"),
    /** 已接受 */
    ACCEPTED(202, "Accepted", "已接受"),
    /** 非权威性信息 */
    NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information", "非权威性信息"),
    /** 无内容 */
    NO_CONTENT(204, "No Content", "无内容"),
    /** 重置内容 */
    RESET_CONTENT(205, "Reset Content", "重置内容"),
    /** 部分内容 */
    PARTIAL_CONTENT(206, "Partial Content", "部分内容"),
    /** 多状态 */
    MULTI_STATUS(207, "Multi-Status", "多状态"),
    /** 已报告 */
    ALREADY_REPORTED(208, "Already Reported", "已报告"),
    /**
     * IM Used
     * HTTP状态码226表示“IM Used”，它是一种HTTP协议的非标准扩展，用于指示服务器已经成功地完成了对资源的部分更新请求，
     * 并且响应返回的实体中包含描述已执行操作的相关元数据。
     * 这个状态码通常用于WebDAV（Web Distributed Authoring and Versioning）协议或类似的协议中，这些协议需要对资源进行部分更新或检查其元数据。
     * 如果您正在使用这些协议，那么226状态码可能对您有用，否则您通常不需要考虑它。
     */
    IM_USED(226, "IM Used", "IM Used"),

    /* ========== 重定向状态码 ========== */
    /** 多种选择 */
    MULTIPLE_CHOICES(300, "Multiple Choices", "多种选择"),
    /** 永久移动 */
    MOVED_PERMANENTLY(301, "Moved Permanently", "永久移动"),
    /** 临时移动 */
    FOUND(302, "Found", "临时移动"),
    /** 查看其它地址 */
    SEE_OTHER(303, "See Other", "查看其它地址"),
    /** 未修改 */
    NOT_MODIFIED(304, "Not Modified", "未修改"),
    /** 使用代理 */
    USE_PROXY(305, "Use Proxy", "使用代理"),
    /** 临时重定向 */
    TEMPORARY_REDIRECT(307, "Temporary Redirect", "临时重定向"),
    /** 永久重定向 */
    PERMANENT_REDIRECT(308, "Permanent Redirect", "永久重定向"),

    /* ========== 客户端错误状态码 ========== */
    /** 要求付款 */
    PAYMENT_REQUIRED(402, "Payment Required", "要求付款"),
    /** 禁止访问 */
    FORBIDDEN(403, "Forbidden", "禁止访问"),
    /** 不允许使用该方法访问 */
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "不允许使用该方法访问"),
    /** 不接受请求的数据格式 */
    NOT_ACCEPTABLE(406, "Not Acceptable", "不接受请求的数据格式"),
    /** 需要代理身份验证 */
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required", "需要代理身份验证"),
    /** 请求超时 */
    REQUEST_TIMEOUT(408, "Request Timeout", "请求超时"),
    /** 请求冲突 */
    CONFLICT(409, "Conflict", "请求冲突"),
    /** 页面已过期 */
    GONE(410, "Gone", "页面已过期"),
    /** Length头 */
    LENGTH_REQUIRED(411, "Length Required", "缺少Content-Length头"),
    /** 先决条件失败 */
    PRECONDITION_FAILED(412, "Precondition Failed", "先决条件失败"),
    /** 请求体过大 */
    PAYLOAD_TOO_LARGE(413, "Payload Too Large", "请求体过大"),
    /** 请求的URI过长 */
    URI_TOO_LONG(414, "URI Too Long", "请求的URI过长"),
    /** 不支持的媒体类型 */
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", "不支持的媒体类型"),
    /** 请求范围不符合要求 */
    RANGE_NOT_SATISFIABLE(416, "Range Not Satisfiable", "请求范围不符合要求"),
    /** 预期未满足 */
    EXPECTATION_FAILED(417, "Expectation Failed", "预期未满足"),
    /**
     * 我是一只茶壶
     * HTTP状态码418是一种不常见的错误状态码，也称为"I'm a teapot"。
     * 这个状态码是作为愚人节玩笑所创造的，并没有实际用途。
     * 它在1998年被定义在RFC 2324中，文档描述了一个超文本咖啡壶控制协议（HTCPCP/1.0），并将418状态码作为“当服务器决定要变成一台茶壶时”的响应。
     * 虽然这个状态码是愚人节玩笑，但它仍然被一些网站和服务用于测试或幽默目的。
     */
    I_AM_A_TEAPOT(418, "I'm a teapot", "我是一只茶壶"),
    /** 请求被重定向到错误的服务器 */
    MISDIRECTED_REQUEST(421, "Misdirected Request", "请求被重定向到错误的服务器"),
    /** 请求无法处理 */
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity", "请求无法处理"),
    /** 当前资源被锁定 */
    LOCKED(423, "Locked", "当前资源被锁定"),
    /** 依赖请求失败 */
    FAILED_DEPENDENCY(424, "Failed Dependency", "依赖请求失败"),
    /** 需要升级协议 */
    UPGRADE_REQUIRED(426, "Upgrade Required", "需要升级协议"),
    /** 要求先决条件 */
    PRECONDITION_REQUIRED(428, "Precondition Required", "要求先决条件"),
    /** 请求过多 */
    TOO_MANY_REQUESTS(429, "Too Many Requests", "请求过多"),
    /** 请求头字段过长 */
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large", "请求头字段过长"),
    /** 因法律原因不可用 */
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "Unavailable For Legal Reasons", "因法律原因不可用"),

    /* ========== 服务器错误状态码 ========== */
    /** 网关错误 */
    BAD_GATEWAY(502, "Bad Gateway", "网关错误"),
    /** 服务不可用 */
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "服务不可用"),
    /** 网关超时 */
    GATEWAY_TIMEOUT(504, "Gateway Timeout", "网关超时"),
    /** HTTP版本不支持 */
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported", "HTTP版本不支持"),
    /** 变体也进行协商 */
    VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates", "变体也进行协商"),
    /** 存储空间不足 */
    INSUFFICIENT_STORAGE(507, "Insufficient Storage", "存储空间不足"),
    /** 请求循环 */
    LOOP_DETECTED(508, "Loop Detected", "请求循环"),
    /** 不扩展 */
    NOT_EXTENDED(510, "Not Extended", "不扩展"),
    /** 需要网络身份验证 */
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required", "需要网络身份验证");
    public final int code;
    public final String msg;
    public final String info;

    RS(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.info = null;
    }

    RS(int code, String msg, String info) {
        this.code = code;
        this.msg = msg;
        this.info = info;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public RenderData render() {
        return new RenderData(this);
    }

    @Override
    public ThrownData thrown() {
        return new ThrownData(this);
    }
}
