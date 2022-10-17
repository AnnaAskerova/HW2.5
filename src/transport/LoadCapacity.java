package transport;
enum LoadCapacity {
    N1("До 3.5"),
    N2("3.5-12"),
    N3("Больше 12");

    private final String stringLoadCapacity;

    LoadCapacity(String stringCapacity) {
        this.stringLoadCapacity = stringCapacity;
    }

    public String getStringCapacity() {
        return stringLoadCapacity;
    }
}