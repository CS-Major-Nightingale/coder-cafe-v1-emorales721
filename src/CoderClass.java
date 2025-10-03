import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CoderClass {

    public static void main(String args[]) {

        //time stuff
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = myTime.format(myFormatter);

        System.out.println("***************************************");
        System.out.println("*\t\t\t\tWelcome to" + "\t\t\t  *");
        System.out.println("* \t\t\t Best Coder Cafe!" + "\t\t  *");
        System.out.println("*\t\t\t" + myDate + " " + formattedTime + "\t\t  *");
        System.out.println("*  \t\t\t\t\t\t\t\t\t  *");
        //end of time stuff

        double matchaPrice =  4.50; //matcha price is equal to 4.50
        double lattePrice = 5.30; //latte price
        double cappPrice = 3.75; //cappucino price
        double hotPrice = 4.80; //hot chocolate price
        double salesTax = 8.875/100; // sales tax
        double serviceFee = 1.21; //every total has a service fee of 1.21

        int latteQuantity = 4; //how many lattes being order
        int matchaQuantity = 2; //how many matchas
        int cappQuantity = 3; //how many capp
        int hotQuantity = 1; //how many hotchoc
        double matchaSubtotal =  matchaPrice * matchaQuantity; //matcha subtotal
        double latteSubtotal = lattePrice * latteQuantity; // latte subtotal
        double cappSubtotal = cappPrice * cappQuantity; //capp subtotal
        double hotSubtotal = hotQuantity * hotPrice; //hot subtotal
        double subTotal = (matchaSubtotal + latteSubtotal + cappSubtotal + hotSubtotal);//base price
        double salesTotal = subTotal * salesTax; //base price and sales tax
        double ccafeFee = subTotal % 10; // itemTotal divided by how many items
        double endTotal = salesTotal + ccafeFee + subTotal + serviceFee;

        System.out.printf("*  2 x Iced Matcha\t\t\t  $ %.2f  *", matchaSubtotal);
        System.out.println();
        System.out.printf("*  4 x Iced Latte \t\t\t  $ %.2f *", latteSubtotal);
        System.out.println();
        System.out.printf("*  3 x Cappucino \t\t\t  $ %.2f *", cappSubtotal);
        System.out.println();
        System.out.printf("*  1 x Hot Chocolate \t\t  $ %.2f  *", hotSubtotal);
        System.out.println();
        System.out.println("*  \t\t\t\t\t\t\t\t\t  *");
        System.out.printf("*  Subtotal: \t\t\t\t  $ %.2f *", subTotal);
        System.out.println();
        System.out.printf("*  Sales Tax: \t\t\t\t  $ %.2f  *", salesTotal);
        System.out.println();
        System.out.printf("*  Service Fee: \t\t\t  $ %.2f  *", serviceFee);
        System.out.println();
        System.out.printf("*  Coder Cafe Fee: \t\t\t  $ %.2f  *", ccafeFee);
        System.out.println();
        System.out.printf("*  Total: \t\t\t\t\t  $ %.2f *", endTotal);
        System.out.println();
        System.out.println("*\t\t Thank you, come again!" + "\t\t  *");
        System.out.println("***************************************");



    }

}



