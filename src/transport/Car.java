package transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения а/м");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения а/м");
    }

    @Override
    public void pitstop() {
        System.out.println("А/м заправляют, меняют резину");
    }

    @Override
    public void bestTime() {
        System.out.println("А/м, лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("А/м разгоняется до максимальной скорости");
    }
}
