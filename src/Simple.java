//Simple one. This app just work.
public class Simple {
    public static void main (String[] args){
        String nameFirst = "Li";
        int warriorsLi = 13;
        int archersLi = 24;
        int raidersLi = 46;
        int powerLi = (warriorsLi*860) + (archersLi*860) + (raidersLi*860);
        System.out.println("Total power of " + nameFirst + " " + powerLi);

        String nameSecond = "Myn";
        int warriorsMyn = 13;
        int archersMyn = 24;
        int raidersMyn = 46;
        double army1 = 860 * 1.5;
        int army2 = (int) army1;
        int powerMyn = (warriorsMyn*army2) + (archersMyn*army2)+ (raidersMyn*army2);
        System.out.println("Total power of " + nameSecond + " " + powerMyn);

        System.out.print(nameFirst + " power is " + powerLi + ". " + nameSecond + " power is " + Math.round(powerMyn) + ".");


    }
}
