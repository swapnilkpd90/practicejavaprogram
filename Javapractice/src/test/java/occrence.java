import java.util.HashMap;
import java.util.Map;
public class occrence {
    public static void occ(String InputString){

        Map<Character,Integer>mapStr= new HashMap<>();
        char[] charstr= InputString.toCharArray();
        for(char c: charstr){
            if(mapStr.containsKey(c)){
                mapStr.put(c,mapStr.get(c)+1);
            }
            else{
                mapStr.put(c,1);
            }
        }
        for(Map.Entry entry: mapStr.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue()+"");
        }

    }
    public static void main(String[] args) {
        occ("swapnilkapde");
    }
}
