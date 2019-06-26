import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {

    Map<Integer,Integer> bins = new TreeMap<Integer, Integer>();

    public Bins(){bins = new TreeMap<Integer, Integer>();}


    public Bins(Dice dice){

        this(dice.numberOfNewDice*1,dice.getNumberOfNewDice()*6);
    }
    private Bins(int low, int high) {

        for (int i = low; i <= high; i++) {
            bins.put(i, 0);
        }
    }



    public Integer getBin(Integer bin){

        return this.bins.get(bin);
    }

    public void incrementBin(Integer bin){
        this.bins.put(bin, this.getBin(bin) + 1);
    }

    public Map<Integer, Integer> getMaps() {

        return bins;
    }
}
