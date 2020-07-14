package CodingBat.String2;

public class getSandwich {
    //A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the given string,
    // or return the empty string "" if there are not two pieces of bread.
    public String getSandwich(String str) {
        String bread = "bread";
        int firstBread = str.indexOf(bread);
        int  lastBread = str.lastIndexOf(bread);
        if (lastBread != firstBread){
            return str.substring((firstBread + 5), lastBread);
        }
        return "";

    }

    public static void main(String[] args) {
        System.out.println(new getSandwich().getSandwich("xxbreadjam"));
    }
}
