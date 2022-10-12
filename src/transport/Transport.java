package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Float engineVolume;
    private boolean isInspected = false;

    public boolean isInspected() {
        return isInspected;
    }

    public void setInspected(boolean inspected) {
        isInspected = inspected;
    }

    public Transport(String brand, String model, Float engineVolume) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Некорректные данные");
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Некорректные данные");
        } else {
            this.model = model;
        }
        if (engineVolume == null || engineVolume <= 0) {
            throw new IllegalArgumentException("Некорректные данные");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract boolean passTechnicalInspection();

}
