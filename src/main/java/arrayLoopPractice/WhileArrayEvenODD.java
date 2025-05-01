package arrayLoopPractice;

public class WhileArrayEvenODD {
    public static void main(String[] args) { 
        int Num[] = {10, 12, 14, 55, 63, 5531,22};
        int i = 0;

        while(i < Num.length) {
            if(Num[i] % 2 == 0) {
                System.out.println(Num[i] + " : number is even");
            } else {
                System.out.println( Num[i] + " : number is odd");
            }
            i++;
        }
    }
}
