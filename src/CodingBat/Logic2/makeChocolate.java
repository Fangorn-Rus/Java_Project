package CodingBat.Logic2;

public class makeChocolate {
    /*
    We want make a package of goal kilos of chocolate.
    We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.
     */
    public int makeChocolate(int small, int big, int goal) {
        int count = 0;
        int avg  = 0;
        for ( ; count < big; ) {
            if (goal >= 5) {
                goal -= 5;
                count++;
                avg = goal;
            }else {
                avg = goal;
                break;
            }
        }
        if ((avg - small) > 0) return -1;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(new makeChocolate().makeChocolate(6, 1, 10));
    }

}
