import java.util.Scanner;

/**
 * In 1626, the Indians sold Manhattan for $24.
 * Write a program that calculates the sum
 * would have been obtained this year if the Indians had put these
 * money to the bank at 5% per annum.
 */
public class PercentPerAnnum {

    public static void main(String[] args) {
        PercentPerAnnum percentPerAnnum = new PercentPerAnnum();
        percentPerAnnum.finder(1626, 24, 0.05, 2020);
    }

    void finder (int pastYear, double profit, double percent, int futureYear) {
        for (int i = pastYear + 1; i <= futureYear ; i++) {
            profit += profit * percent;

            System.out.println(i + ": " + profit);
        }
    }
}
/**
 * profit = sale * percent
 * sale += profit
 */