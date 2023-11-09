package L30_LambdaExpressions_2;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Functional interfaces: 1 abstract method of interface
 * Consumer
 * Supplier
 */
public class c2l2_LambdaExpressions {
}

class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Car model " + model + " with " + color + " color and " + engine + " engine";
    }

}

class CarTest {
    public static ArrayList<Car> createCar(Supplier<Car> cs) {
        ArrayList<Car> cal = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cal.add(cs.get());
        }
        return cal;
    }

    public static void changeCar(Car car, Consumer<Car> cC) {
        cC.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = createCar(() -> new Car("BMW", "red", 1.6));
        System.out.println("Our cars: " + ourCar);

        changeCar(ourCar.get(0), car -> {
            car.color = "black";
            car.engine = 2.4;
            System.out.println("Changed car: " + car);
        });

//        Consumer<Car> consumer = car -> {
//            car.color = "black";
//            car.engine = 2.4;
//            System.out.println("Changed car: " + car);
//        };

//        consumer.accept(ourCar.get(0));
        System.out.println("Our changed cars: " + ourCar);
    }
}