public class reverse {
    public static void main(String[] args) {
        String str="mom";
        String rev="";
        int strlenght=str.length();

        for(int i=strlenght-1;i>=0;i--){
            rev= rev+str.charAt(i);
        }
        System.out.println(rev+ "reverse string");
        if(rev.equalsIgnoreCase(str)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }


    }
}
