package CodingBat;

/*
Если задана строка, вернуть строку, состоящую из первых 2 символов (если есть),
однако включать первый символ только в том случае,
если он равен 'o', и включать второй символ только в том случае, если он равен 'z',
поэтому 'ozymandias' выдает 'oz'.
 */

public class DeleteChar {

        public static int intMax(int a, int b, int c) {
            int [] maxArr = { b, c};
            int max = a;
            for (int count: maxArr){
                if(count > max) max = count;
            }
            return max;
        }






    public static void main(String[] args) {
        System.out.println(intMax(2, 1,3));
    }
}
