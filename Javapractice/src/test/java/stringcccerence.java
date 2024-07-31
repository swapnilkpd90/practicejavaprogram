import java.util.HashMap;
import java.util.Map;

public class stringcccerence {
    public static void occernce(String inputString){
        HashMap<Character,Integer> strMap = new HashMap<Character,Integer>();
        char[] chararry = inputString.toCharArray();

        for(char c: chararry){
            if(strMap.containsKey(c)){
                strMap.put(c, strMap.get(c)+1);
            }
            else{
                strMap.put(c,1);
            }

        }
        for(Map.Entry entry : strMap.entrySet()){
            System.out.println(entry.getKey()+"- values are- "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        occernce("java is use full");



    }
}
