import transport.*;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "СеДАн");
        Car bmw = new Car("BMW", "Z8", 2f, "Купе");
        Car hyundai = new Car("Hyundai", "Avante", 2.2f, null);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "");

        Truck kamaz = new Truck("Камаз", "6520", 9.8f, "Больше 12");
        Truck ford = new Truck("Ford", "Cargo 25", 9.0f, "");
        Truck howo = new Truck("Howo", "HW76", 9.8f, "трололо");
        Truck isuzu = new Truck("Isuzu", "Forward", 7.8f, "3.5-12");

        Bus kiaBus = new Bus("Kia", "Granbird", 17.2f, "capacity");
        Bus intercityBus = new Bus("Mercedes-Benz", "Tourismo", 11.5f, "100-120");
        Bus touristBus = new Bus("Mercedes-Benz", "Sprinter", 3f, "");
        Bus paz = new Bus("ПАЗ", "Вектор Next", 4.4f, "40-50");

      /*  DriverB driverB = new DriverB("Чак Норрис", 32);
        driverB.start(audi);
        DriverC driverC = new DriverC("Фома Аквинский", 20);
        driverC.stop(kamaz);
        DriverD driverD = new DriverD("Джо Байден", 40);
        driverD.refillCar(paz);
        driverB.printInfo(kia);
        driverC.printInfo(kamaz);
        driverD.printInfo(kiaBus);*/
        audi.printType();
        kia.printType();
        bmw.printType();
        hyundai.printType();
        kamaz.printType();
        howo.printType();
        ford.printType();
        isuzu.printType();
        kiaBus.printType();
        intercityBus.printType();
        touristBus.printType();
        paz.printType();
    }
}