import ru.geekbrains.lesson3.Harvester;
import ru.geekbrains.lesson3.RefuelingStation;
import ru.geekbrains.lesson3.RefuelingStationV2;
import ru.geekbrains.lesson3.hw.CarWashStation;
import ru.geekbrains.lesson3.hw.Pickup;
import ru.geekbrains.lesson3.hw.Sedan;

import java.awt.*;

public static void main(String[] args) {

    RefuelingStation refuelingStation = new RefuelingStation();
    RefuelingStationV2 refuelingStation2 = new RefuelingStationV2();
    CarWashStation carWashStation = new CarWashStation();

    Harvester harvester = new Harvester("John Deere", "X9", Color.GREEN);
    harvester.setRefuelingStation(refuelingStation2);
    harvester.fuel();
    carWashStation.wash(harvester);

    Sedan sedan = new Sedan("Toyota", "Camry", Color.BLACK);
    sedan.setRefuelingStation(refuelingStation);
    sedan.fuel();
    carWashStation.wash(sedan);

    Pickup pickup = new Pickup("Ford", "F-150", Color.RED);
    pickup.setRefuelingStation(refuelingStation2);
    pickup.fuel();
    carWashStation.wash(pickup);
}
