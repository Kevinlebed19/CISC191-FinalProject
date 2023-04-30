package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ObjectOrientedTest {
    @Test
    void testChargeable() {
        Chargeable testChargeableHybrid = new HybridCar("Honda", 45000, 32500, 4, null, 4);
        testChargeableHybrid.chargeUp();
        assertEquals(100, testChargeableHybrid.getBatteryCharge());

        Chargeable testChargeableElectric = new ElectricCar("Chevy", 10000, 50000, 2, null, 2);
        testChargeableElectric.chargeUp();
        assertEquals(100, testChargeableHybrid.getBatteryCharge());

    }

    @Test
    void testCombustible() {
        Combustible testCombustibleHybrid = new HybridCar("Ford", 25500, 45000, 4, null, 4);
        testCombustibleHybrid.tankUp();
        assertEquals(100, testCombustibleHybrid.getFuelLevel());

        Combustible testCombustibleGas = new GasCar("Nissan", 12000, 49000, 5, null, 4);
        testCombustibleGas.tankUp();
        assertEquals(100, testCombustibleGas.getFuelLevel());

    }

    @Test
    void testVehicle() {
        Vehicle testVehicle1 = new Vehicle("Ford", 25000, 5000, 4, null);
        assertEquals("Ford", testVehicle1.getManufacturerName());
        assertEquals(25000, testVehicle1.getMilesOnVehicle());
        assertEquals(5000, testVehicle1.getPrice());
        assertEquals(4, testVehicle1.getNumberOfSeats());
        assertNull(testVehicle1.getOptions());

//        Vehicle vehicle = new Vehicle("GMC", 80000, 7995, 4, null);
//
//        assertEquals("GMC", vehicle.getManufacturerName());
//        assertEquals(80000, vehicle.getMilesOnVehicle());
//        assertEquals(7995, vehicle.getPrice());
//        assertEquals(4, vehicle.getNumberOfSeats());
    }

    @Test
    void carTest() {
        Car testCar = new Car("Toyota", 125300, 2500, 5, null, 4);
        assertEquals("Toyota", testCar.getManufacturerName());
        assertEquals(125300, testCar.getMilesOnVehicle());
        assertEquals(2500, testCar.getPrice());
        assertEquals(5, testCar.getNumberOfSeats());
        assertNull(testCar.getOptions());
        assertEquals(4, testCar.getNumberOfDoors());
    }

    @Test
    void pickupTruckTest() {
        PickupTruck testTruck = new PickupTruck("Tesla", 250, 125000, 5, null, 0);
        assertEquals("Tesla", testTruck.getManufacturerName());
        assertEquals(250, testTruck.getMilesOnVehicle());
        assertEquals(125000, testTruck.getPrice());
        assertEquals(5, testTruck.getNumberOfSeats());
        assertNull(testTruck.getOptions());
        assertEquals(0, testTruck.getCargoCapacity());
    }

    @Test
    void sportUtilityVehicleTest() {
        SportUtilityVehicle testSportVehicle = new SportUtilityVehicle("Mazda", 55000, 65000, 6, null, 12000);
        assertEquals("Mazda", testSportVehicle.getManufacturerName());
        assertEquals(55000, testSportVehicle.getMilesOnVehicle());
        assertEquals(65000, testSportVehicle.getPrice());
        assertEquals(6, testSportVehicle.getNumberOfSeats());
        assertNull(testSportVehicle.getOptions());
        assertEquals(12000, testSportVehicle.getMaxTowingWeight());

    }

    @Test
    void gasCarTest() {
        GasCar testGasser = new GasCar("Ford", 3500, 45000, 4, null, 2);
        assertEquals("Ford", testGasser.getManufacturerName());
        assertEquals(3500, testGasser.getMilesOnVehicle());
        assertEquals(45000, testGasser.getPrice());
        assertEquals(4, testGasser.getNumberOfSeats());
        assertNull(testGasser.getOptions());
        assertEquals(2, testGasser.getNumberOfDoors());

    }

    @Test
    void hybridCarTest() {
        HybridCar testHybridCar = new HybridCar("Toyota", 387000, 12500, 4, null, 4);
        assertEquals("Toyota", testHybridCar.getManufacturerName());
        assertEquals(387000, testHybridCar.getMilesOnVehicle());
        assertEquals(12500, testHybridCar.getPrice());
        assertEquals(4, testHybridCar.getNumberOfSeats());
        assertNull(testHybridCar.getOptions());
        assertEquals(4, testHybridCar.getNumberOfDoors());
        testHybridCar.setBatteryCharge(50);
        assertEquals(50, testHybridCar.getBatteryCharge());

    }

    @Test
    void electricCarTest() {
        ElectricCar testElectricCar = new ElectricCar("Chevy", 12000, 35000, 2, null, 2);
        assertEquals("Chevy", testElectricCar.getManufacturerName());
        assertEquals(12000, testElectricCar.getMilesOnVehicle());
        assertEquals(35000, testElectricCar.getPrice());
        assertEquals(2, testElectricCar.getNumberOfSeats());
        assertNull(testElectricCar.getOptions());
        assertEquals(2, testElectricCar.getNumberOfDoors());
        testElectricCar.setBatteryCharge(90);
        assertEquals(90, testElectricCar.getBatteryCharge());
    }

    @Test
    void optionTest() {
        Option testOption = new Option("Power Windows");
        assertEquals("Power Windows", testOption.getDetails());

        Option testOption2=new Option();
        assertNull(testOption2.getDetails());

        testOption2.setDetails("Anti-lock Brakes");
        assertEquals("Anti-lock Brakes", testOption2.getDetails());

    }

    @Test
    void addOptionTest() {
        Option testOption = new Option("Power Windows");
        Vehicle testVehicle = new Vehicle();

        assertEquals(0, testVehicle.getOptions().length);

        testVehicle.addOption(testOption);

        assertEquals(1, testVehicle.getOptions().length);
        assertEquals("Power Windows", testVehicle.getOptions()[0].getDetails());
    }
}
