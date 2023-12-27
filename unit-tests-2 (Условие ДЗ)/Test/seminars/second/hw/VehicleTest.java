package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Moskvich", "3", 2023);
        motorcycle = new Motorcycle("Izh", "Jupiter", 1985);
    }
    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

    @Test
    void carInstanceIsVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.

    @Test
    void carHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void carTestDriveSetsSpeedTo60() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void motorcycleTestDriveSetsSpeedTo75() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

    @Test
    void carParkSetsSpeedToZero() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void motorcycleParkSetsSpeedToZero() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
