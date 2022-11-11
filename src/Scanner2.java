
import java.util.Scanner;
//Enter only names of dynasty's.
public class Scanner2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first dynasty name");
        String nameFirst = scanner.next();
        int warriorsFirst = 13;
        int archersFirst = 24;
        int ridersFirst = 46;
        int powerFirst = (warriorsFirst*860) + (archersFirst*860)+ (ridersFirst*860);
        System.out.println("Total power of " + nameFirst + " " + powerFirst);

        System.out.println("Enter second dynasty name");
        String nameSecond = scanner.next();
        int warriorsSecond = 13;
        int archersSecond = 24;
        int ridersSecond = 46;
        double army1 = 860 * 1.5;
        int army2 = (int) army1;
        int powerSecond = (warriorsSecond*army2) + (archersSecond*army2)+ (ridersSecond*army2);
        System.out.println("Total power of " + nameSecond + " " + powerSecond);

        System.out.print(nameFirst + " power is " + powerFirst + ". " + nameSecond + " power is " + Math.round(powerSecond) + ".");

    }
}
