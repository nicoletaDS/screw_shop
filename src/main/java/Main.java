import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        do {
            placeOrder(order);
            if (order.checkOrder()) {
                System.out.println("The order is ok! The total price is: " + order.totalPrice());
            } else {
                System.out.println("You ordered more screws as screw nuts. Please place your order again!");
            }
        } while (!order.checkOrder());


    }

    private static void placeOrder(Order order) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many screws do you want?");
        order.setScrew(input.nextInt());
        System.out.println("How many screw nuts do you want?");
        order.setScrew_nut(input.nextInt());
        System.out.println("How many washers do you want?");
        order.setWasher(input.nextInt());
    }
}
