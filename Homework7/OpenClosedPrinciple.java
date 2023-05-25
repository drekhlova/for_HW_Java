/*2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
public double calculateAllowedSpeed(Vehicle vehicle) {
if (vehicle.getType().equalsIgnoreCase("Car")) {
return vehicle.getMaxSpeed() * 0.8;
} else if (vehicle.getType().equalsIgnoreCase("Bus")) {
return vehicle.getMaxSpeed() * 0.6;
}

    return 0.0;
}
}
public class Vehicle {
int maxSpeed;
String type;
public Vehicle(int maxSpeed, String type) {
this.maxSpeed = maxSpeed;
this.type = type;
}
public int getMaxSpeed() {
return this.maxSpeed;
}
public String getType() {
return this.type;
}
}

Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP */

package for_HW_Java.Homework7;

public class OpenClosedPrinciple {

    //Абстрактный класс Vehicle - транспортное средство
    public abstract class Vehicle {
        int maxSpeed; //максимальная скорость движения ТС
        String type; //тип ТС

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }
        
        //Получаем максимальную скорость движения ТС
        public int getMaxSpeed() {
            return this.maxSpeed;
        }
        
        //Получаем тип ТС
        public String getType() {
            return this.type;
        }

        //Расчет разрешенной скорости движения ТС
        public abstract double calculateAllowedSpeed();
    }
    
    //Класс Car - автомобиль
    public class Car extends Vehicle {
        public Car(int maxSpeed, String type) {
            super(maxSpeed, "Car");
        }
    
        //Рассчет максимальной разрешенной скорости движения автомобиля
        @Override
        public double calculateAllowedSpeed() {
            return getMaxSpeed() * 0.8;
        }
    }

    //Класс Bus - автобус
    public class Bus extends Vehicle {
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, "Bus");
        }

        //Рассчет максимальной разрешенной скорости движения автобуса
        @Override
        public double calculateAllowedSpeed() {
            return getMaxSpeed() * 0.6;
        }
    }

    //Класс для расчета разрешенной скорости движения ТС
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.calculateAllowedSpeed();
        }
    }
}