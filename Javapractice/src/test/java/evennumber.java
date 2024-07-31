import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evennumber {

    public static void evn(int num[] ){
        //int num[] ={10,45,7,2,9,4,6,9};
        int n= num.length;
        List<Integer> oddNo = new ArrayList<Integer>();
        //int newNum[] = new int[n+1];
        for(int i =0; i<num.length;i++){
            if(num[i]%2==0){
                 System.out.println("number is even-"+num[i]);
                 oddNo.add(num[i]);
                 //newNum[j++] = num[i];

            }
            else {
                System.out.println("number is odd-"+num[i]);
                //newNum[i] = num[i];
            }
            //return odds.toArray();
        }
        System.out.println("new number is -"+ oddNo.toArray());
        //return oddNo.toArray();
    }


    public static void main(String[] args) {
        //evn(19);

       // int[] odds = Arrays.stream(arrayOfNumbers).filter(number -> number%2 != 0).toArray()
    }
}
