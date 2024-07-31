import java.util.Scanner;

public class Removespace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String newstr= " ";

        for(int i = 0; i <input.length();i++){
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)){
                newstr +=c;
            }
        }
        System.out.println("output String is : " + newstr);
    }
}
