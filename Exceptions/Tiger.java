package Lesson28.Homework;

public class Tiger {
    String tigerFood = "meat";
    String tigerDrink = "water";

    void eat(String eatStringParameter) {
        if (eatStringParameter != tigerFood) {
            throw new NotMeatException("Tiger don't eats " + eatStringParameter);
        }
            System.out.println("Tiger eats " + tigerFood);
    }

    void drink(String drinkStringParameter) throws NotWaterException {
        if (drinkStringParameter != tigerDrink) {
            throw new NotWaterException("Tiger don't drinks " + drinkStringParameter);
        }
        System.out.println("Tiger drinks " + tigerDrink);
    }
}