package ChuckALuckSpel;

public class ChuckALuckGame {
    protected int round = 0;
    protected double credit = 0;
    protected int luckyNumber = 0;
    protected double bet = 0;
    protected DiceCup cup;


    ChuckALuckGame(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
    }

    ChuckALuckGame(int credit) {
        this(credit * 1.0);
    }

    void playRound(int luckyNumber, double bet) {
        this.luckyNumber = luckyNumber < 7 && luckyNumber > 0 ? luckyNumber : 6; // couldn't be bothered to implement properly

        if (placeBet(bet) == false) {
            return;
        }
        round += 1;

        calculateWinings();
    }

    void calculateWinings() {
        cup = new DiceCup();
        int matches = 0;
        for (int i : cup.getRolledValues()) {
            if (i == luckyNumber) {
                matches += 1;
            }
        }
        switch (matches) {
            case 3:
                this.credit += bet * 10;
                break;
            case 2:
                this.credit += bet * 2;
                break;
            case 1:
                this.credit += bet;
                break;
            default:

                break;
        }
    }

    boolean placeBet(double bet) {
        if (this.credit < bet) {
            this.bet = -1;
            return false;
        }
        this.bet = bet;
        this.credit -= bet;
        return true;
    }
    @Override
    public String toString() {
        return "------------------\n" +
                "Round: " + round + "\n" +
                "Lucky Number: " + luckyNumber + "\n" +
                cup + "\n" +
                "Credits: " + credit;
    }
}
