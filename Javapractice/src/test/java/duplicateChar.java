public class duplicateChar {

    public static void main(String[] args) {
        String str="beautiful beach";
        char[] charStr=str.toCharArray();
        for(int i=0;i<charStr.length;i++){
            for(int j=i+1;j<charStr.length;j++){
                if(charStr[i]==charStr[j]){
                    System.out.println(charStr[j]+"Dupliate");
                    break;
                }
            }
        }

    }
}
