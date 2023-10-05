public class Card {

    final String suits;
    final String ranks;

    public Card(String suits, String ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }

    public String getSuits() {
        return suits;
    }

    public String getRanks() {
        return ranks;
    }

    public String toString(){

        return ranks +  " of "  + suits;
    }
}

