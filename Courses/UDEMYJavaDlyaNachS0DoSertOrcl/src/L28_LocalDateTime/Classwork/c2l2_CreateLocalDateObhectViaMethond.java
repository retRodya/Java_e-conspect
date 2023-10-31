package L28_LocalDateTime.Classwork;

class c2_CreateLocalDateObjectViaMethod {
    public static void main(String[] args) {
        // Car c = new Car(); -- constructor private, but let's create Car method with return new Car()
        Car c = Car.createCar();
    }
}

class Car {
    private Car() {
    }

    static Car createCar() {
        return new Car();
    }
}
