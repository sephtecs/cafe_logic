import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {  
        int sum = 0;
        for (int i = 1; i < numWeeks + 1; i++){
            sum = sum + i;
        }
        return sum;
    }

    public String printPriceChart(String productName, double price, int howManyProducts){
        System.out.println(productName);
        String output = productName;
        for(int i = 1; i <= howManyProducts; i++){
            double sum = price * i;
            int number = i;
            System.out.println(number + " - " + sum);
        }
        return output;
    }

    public double getOrderTotal(double[] items){
        double total = 0.0;
        for (double item : items) {
            total = total + item;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i) + " " + prices.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.print("Print your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello, " + userName + "! There are " + (customers.size() - 1) + " people ahead of you.");
    }
}







