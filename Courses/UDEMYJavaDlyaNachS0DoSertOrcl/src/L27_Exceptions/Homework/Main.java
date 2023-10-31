package L27_Exceptions.Homework;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("meat");
        try {
            tiger.drink("water");
            try {
                tiger.drink("pivo");
            }
            catch (NotWaterException drinkExcepton) {
                System.out.println(drinkExcepton.getMessage());
            }
            catch (Exception drinkException) {
                System.out.println(drinkException.getMessage());;
            }
            finally {
                System.out.println("This is inner finally block");
            }
        }
        catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
        }
        catch (Exception drinkException) {
            System.out.println(drinkException.getMessage());
        }
        finally {
            System.out.println("This is outer finally block");
        }
    }
}
