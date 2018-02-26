package ChuckALuckSpel;

public class DiceCup {
    private Dobbelsteen[] dices;

    DiceCup(){
        this.dices = new Dobbelsteen[] {
                new Dobbelsteen(),
                new Dobbelsteen(),
                new Dobbelsteen()
        };
    }

    int[] getRolledValues(){
        int[] returnedValues = new int[this.dices.length];

        for(int i =0; i < returnedValues.length; i++){
            this.dices[i].gooi();
            returnedValues[i] = this.dices[i].getLaatsteWaarde();
        }

        return returnedValues;
    }

    @Override
    public String toString() {
        StringBuilder diceValues = new StringBuilder();
        diceValues.append("work: ");

        for(int rolledValue : this.getRolledValues()){
            diceValues.append(rolledValue);
        }
        return diceValues.toString();
    }
}
