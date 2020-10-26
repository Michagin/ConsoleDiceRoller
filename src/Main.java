import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            boolean intro = true;
        while(true) {
            int value;
            DieThrower dieThrower = new DieThrower();
            ArrayList<Die> diceList = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            Scanner in = new Scanner(System.in);
            int diceSum = 0;
            System.out.println("Hvor mange og hvilken terning vil du rulle?");
            if(intro){
                System.out.println("Anvend xdy notation, hvor x er antal og y er terningestørrelsen.\nf.eks. 1d6 ville rulle 1 6-sidet terning. (minimum 1 side)");
                intro = false;
            }
            String inputString = in.next();
            String[] output = inputString.split("d");

            int amount = Integer.parseInt(output[0]);

            if (output.length > 1) {
                value = Integer.parseInt(output[1]);
            } else {
                value = 6;
            }

            for (int i = 0; i < amount; i++) {
                diceList.add(new Die(value));
            }

            for(Die die: diceList){
                die.setValue(dieThrower.throwDie(die));
                sb.append(die.getValue());
                if(amount>1)
                    sb.append(", ");
                diceSum += die.getValue();
            }

            if(amount>1){
                System.out.println("Du kastede " + amount + " " + value + "-sidet terninger og rullede " + sb.toString() + "det giver: " + diceSum + "!\n");
            } else {
                System.out.println("Du kastede " + amount + " " + value + "-sidet terning og rullede " + sb.toString() +"!\n");
            }
        }
    }
}
