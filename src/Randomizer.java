import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {

    public int generateDieValue(int maxSize){
        return ThreadLocalRandom.current().nextInt(1, maxSize+1);
    }

}
