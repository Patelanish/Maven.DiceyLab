public class Dice {

    int numberOfNewDice;

    public Dice(int numberOfNewDice) {
        this.numberOfNewDice = numberOfNewDice;
    }

    public int getNumberOfNewDice() {
        return numberOfNewDice;
    }

    public Integer tossAndSum() {
        Integer result = 0;
        for (int i = 0; i < numberOfNewDice; i++) {
            result += (int) (Math.random() * (6 -1) + 1) + 1;
        }
        return result;

        }
    }


