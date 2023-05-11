package cc.itez.render.core.val;

public enum RestField {
    CODE("code"),
    MSG("msg"),
    INFO("info"),
    ALERT("alert"),
    NUM("num"),
    SIZE("size"),
    LIST("list"),
    COUNT("count"),
    ;

    private final String fieldName;

    RestField(String fieldName) {
        this.fieldName = fieldName;
    }

    public String fieldName() {
        return fieldName;
    }
}
