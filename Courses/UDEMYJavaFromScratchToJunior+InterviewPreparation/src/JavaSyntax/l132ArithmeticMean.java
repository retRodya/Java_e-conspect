package JavaSyntax;

public class l132ArithmeticMean {
    public static void main(String[] args) {
        int i = 1;
        float sum = 0;
        while (i <= 100) {
            sum += i;
            System.out.println(i + " step : " + sum);
            if (i == 100){
                break;
            }
            i++;
        }
        System.out.println(sum / i);
    }
}
