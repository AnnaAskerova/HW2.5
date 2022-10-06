package transport;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения грузовика");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения грузовика");
    }

    @Override
    public void pitstop() {
        System.out.println("Грузовик заправляют, меняют резину");
    }

    @Override
    public void bestTime() {
        System.out.println("Грузовик, лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик разгоняется до максимальной скорости");
    }
}
