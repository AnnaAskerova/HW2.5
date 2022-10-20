package transport;

import driver.Driver;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public abstract class Transport {
    private final String brand;
    private final String model;
    private final Float engineVolume;
    private boolean isInspected = false;
    private Driver<?> driver;
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();

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

    public boolean isInspected() {
        return isInspected;
    }

    public void setInspected(boolean inspected) {
        isInspected = inspected;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
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

    public Driver<?> getDriver() {
        return driver;
    }

    public void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public void printSponsors() {
        for (Sponsor s : sponsors) {
            System.out.println(s.getName());
        }
    }

    public void printMechanics() {
        for (Mechanic<?> s : mechanics) {
            System.out.println(s.getName());
        }
    }

    public void getInfo() {
        System.out.println(brand + ' ' + model + '\n' + "Водитель \n" + driver.getName() + "\nCпонсоры:");
        printSponsors();
        System.out.println("Mеханики: ");
        printMechanics();
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract boolean passTechnicalInspection();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(engineVolume, transport.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}
