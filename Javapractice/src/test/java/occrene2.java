import java.util.HashMap;

public class occrene2 {

    public static void main(String[] args) {

        String str="swapnilkapde";
        int count;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(map.containsKey(str.charAt(i)))
            {
                count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);

            }else
            {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println("Number of occurnance:-"+map);
    }

}
