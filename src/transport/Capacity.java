package transport;

enum Capacity {
    XS("До 10"),
    S("10-25"),
    M("40-50"),
    L("60-80"),
    XL("100-120");

    private final String stringCapacity;

    Capacity(String stringCapacity) {
        this.stringCapacity = stringCapacity;
    }

    public String getStringCapacity() {
        return stringCapacity;
    }
}