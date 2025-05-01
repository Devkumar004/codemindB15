package arrayLoopPractice;

public class DoWhileArrayEvnOdd {
public static void main(String[]args) {
    int Num[] = {10, 12, 14, 55, 63, 5531,22};

    int i=0;
    
    do {
    	if(Num[i]%2==0) {
    		System.out.println(Num[i]+" :  is even number");
    	}
    	else {
    		System.out.println(Num[i]+" : is odd n number");
    		
    	}
    	i++;
    }
    	while(i<Num.length);
}
}
