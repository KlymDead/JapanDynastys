package Lesson3.Japan;

import java.util.Scanner;

//All with scanner. Enter names of dynasty's , power of army.
public class Japan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first dynasty name");
        String nameFirst = scanner.next();
        System.out.println("Enter the power of warriors");
        int warriorsFirst = scanner.nextInt();
        System.out.println("Enter the power of archers");
        int archersFirst = scanner.nextInt();
        System.out.println("Enter the power of riders");
        int ridersFirst = scanner.nextInt();
        int powerFirst = (warriorsFirst*860) + (archersFirst*860)+ (ridersFirst*860);
        System.out.println("Total power of " + nameFirst + " " + powerFirst);

        System.out.println("Enter second dynasty name");
        String nameSecond = scanner.next();
        System.out.println("Enter the power of warriors");
        int warriorsSecond = scanner.nextInt();
        System.out.println("Enter the power of archers");
        int archersSecond = scanner.nextInt();
        System.out.println("Enter the power of riders");
        int ridersSecond = scanner.nextInt();
        double army1 = 860 * 1.5;
        int army2 = (int) army1;
        int powerSecond = (warriorsSecond*army2) + (archersSecond*army2)+ (ridersSecond*army2);

        System.out.println("Total power of " + nameSecond + " " + powerSecond);

        System.out.print(nameFirst + " power is " + powerFirst + ". " + nameSecond + " power is " + Math.round(powerSecond) + ".");
    }
}
