package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения автобуса");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения автобуса");
    }

    @Override
    public void pitstop() {
        System.out.println("Автобус заправляют, меняют резину");
    }

    @Override
    public void bestTime() {
        System.out.println("Автобус, лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус разгоняется до максимальной скорости");
    }
}
