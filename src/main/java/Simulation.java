import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Map;

public class Simulation {
    public System system;
    Dice dice;
    int numberOfRoles;
    Bins bins;


    public Simulation(int numberOfDice, int numberOfRoles) {
        this.dice = new Dice(numberOfDice);
        this.numberOfRoles = numberOfRoles;
        this.bins = new Bins(this.dice);
    }

    public void runSimulation() {

        for (int i = 1; i <= numberOfRoles; i++) {
            Integer rollResult = dice.tossAndSum();
            this.bins.incrementBin(rollResult);
        }

    }
     public String printResults() {
        StringBuilder SP = new StringBuilder();
        for(Map.Entry<Integer,Integer> entry : bins.getMaps().entrySet()){
            DecimalFormat df = new DecimalFormat("%s%.2f%s");
            double percent = (entry.getValue() / numberOfRoles);
            String formattedPercent = df.format(percent);
            SP.append(entry.getKey()+" :  "+entry.getValue()+" : " + formattedPercent + "\n");
        }
        return SP.toString();
     }

    public static void main(String[] args) {

    }
}
