import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.HashSet;
import java.util.Set;

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

        DriverB driverB = new DriverB("Чак Норрис", 32);
        DriverC driverC = new DriverC("Фома Аквинский", 20);
        DriverD driverD = new DriverD("Джо Байден", 40);
        DriverB driverB1 = new DriverB("Сергей Матвеев", 12);
        DriverC driverC1 = new DriverC("Владимир Ленин", 30);
        DriverD driverD1 = new DriverD("Сергей Есенин", 10);

        Set<Transport> participants = new HashSet<>();
        participants.add(audi);
        participants.add(bmw);
        participants.add(kamaz);
        participants.add(howo);
        participants.add(paz);
        participants.add(touristBus);
        driverB1.setDrivenVehicle(audi);
        driverB.setDrivenVehicle(bmw);
        driverC1.setDrivenVehicle(kamaz);
        driverC.setDrivenVehicle(howo);
        driverD1.setDrivenVehicle(touristBus);
        driverD.setDrivenVehicle(paz);
        Sponsor sponsor1 = new Sponsor("Вася Пупкин", 1200);
        for (Transport participant : participants) {
            sponsor1.sponsorRace(participant);
        }
        Sponsor sponsor2 = new Sponsor("Снуп Дог", 1400);
        for (Transport participant : participants) {
            sponsor2.sponsorRace(participant);
        }
        Sponsor sponsor3 = new Sponsor("Данила Бас", 1500);
        for (Transport participant : participants) {
            sponsor3.sponsorRace(participant);
        }

        Mechanic<Car> carMechanic = new Mechanic<>("Джон Доу", "Рога и копыта");
        Mechanic mechanic = new Mechanic<>("Мэри Роу", "Рога и копыта");
        Mechanic<Truck> truckMechanic = new Mechanic<>("Ален Делон", "Рога и копыта");
        Mechanic<Truck> mechanic1 = new Mechanic<>("Макс Пейн", "112 auto");
        Mechanic<Bus> busMechanic = new Mechanic<>("Эва Перон", "Пони и радуга");
        carMechanic.inspectVehicle(audi);
        carMechanic.inspectVehicle(bmw);
        truckMechanic.inspectVehicle(kamaz);
        truckMechanic.inspectVehicle(howo);
        mechanic1.inspectVehicle(howo);
        mechanic1.inspectVehicle(kamaz);
        busMechanic.inspectVehicle(paz);
        busMechanic.inspectVehicle(touristBus);
        for (Transport participant : participants) {
            mechanic.inspectVehicle(participant);
        }
       /* kamaz.getInfo();
        audi.getInfo();*/
        var ss = new ServiceStation<>();
        ss.fixVehicle();
        ss.addVehicle(paz);
        ss.addVehicle(kamaz);
        ss.addVehicle(bmw);
        ss.fixVehicle();

    }

    public static void checkAllVehicles(Transport... transports) {
        for (Transport t : transports) {
            try {
                if (!t.passTechnicalInspection()) {
                    throw new RuntimeException(t.getBrand() + ' ' + t.getModel());
                }
            } catch (UnsupportedOperationException e) {
                System.out.println("Автобус " + t.getBrand() + ' ' + t.getModel() + ' ' + e.getMessage());
            }
        }
    }

}