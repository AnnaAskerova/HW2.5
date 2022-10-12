package transport;

enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    CROSSOVER("Кроссовер"),
    SUV("Внедорожник"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String stringBodyType;

    BodyType(String stringBodyType) {
        this.stringBodyType = stringBodyType;
    }

    public String getStringBodyType() {
        return stringBodyType;
    }
}
