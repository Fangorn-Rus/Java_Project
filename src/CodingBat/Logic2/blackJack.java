package CodingBat.Logic2;

public class blackJack {
    /*
    Given 2 int values greater than 0, return whichever
    value is nearest to 21 without going over. Return 0 if they both go over.
     */
    public int blackjack(int a, int b) {
        int rA = 21 - a;
        int rB = 21 - b;

        if (rA >= 0){
            if (rB < 0) return a;
            return (rA < rB) ? a : b;
        }
        if (rB >= 0){
            if (rA < 0) return b;
            return (rA < rB) ? a : b;
        }
        return 0;
     }

    public static void main(String[] args) {
        System.out.println(new blackJack().blackjack(19, 22));
    }

}
