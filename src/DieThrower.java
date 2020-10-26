public class DieThrower {
    Randomizer randomizer = new Randomizer();

    public int sumDice(Die... dice){
        int currentSum = 0;

        for(Die d : dice){
            currentSum += d.getType();
        }

        return currentSum;
    }

    public int throwDie(Die die){
        return randomizer.generateDieValue(die.getType());
    }
}
