import java.util.Random;
public class Deck {

    String suits[] = {"diamoind", "hearts", "clubs", "spades"};
    String ranks[] = {"king", "ace", "5","3","4","6","7","8","9","10"};

    Card cards[] = new Card[52];

    int count;
    Deck(){
        for(int i = 0;i<suits.length; i++)
            for(int j = 0; j<ranks.length; j++)
                cards[count++] = new Card(suits[i], ranks[j]);

    }
    public void displayCards(){
        for(int i=0;i<cards.length;i++)
            System.out.println(cards[i]);
    }

    public void shuffle(){
        Random random = new Random();
                for(int i =0;i<6000;i++) {
                    Card temp = cards[0];
                    int ran = random.nextInt(52);
                    cards[0] = cards[ran];
                    cards[ran] = temp;

                }
    }
}