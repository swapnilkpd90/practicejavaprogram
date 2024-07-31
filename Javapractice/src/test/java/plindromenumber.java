public class plindromenumber {

    public static void main(String[] args) {
        int num = 1231;
        int rev = 0;
        int temp = num;
        int rem;

        while (num>0){
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        System.out.println("reverse number:"+ rev);

        if(rev == temp){
            System.out.println("pallindrome number:");
        }
        else{
            System.out.println(" number is not pallindrome:");
        }
    }
}
