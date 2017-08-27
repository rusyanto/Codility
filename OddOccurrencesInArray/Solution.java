import java.util.*;

class Solution {
    Map<Integer, Integer> occurMap;
    
    public int solution(int[] A) {
        this.occurMap = new HashMap<Integer, Integer>();
        int occurrences;
        
        for (int a : A) {
            if ( occurMap.containsKey(a) ) {
                occurMap.put(a, occurMap.get(a) + 1);
            } else {
                occurMap.put(a, 1);
            }
        }
        
        for ( Map.Entry<Integer, Integer> entry : occurMap.entrySet() ) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}
