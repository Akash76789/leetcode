class Solution {
    public int maxNumberOfBalloons(String text) {
      int n = text.length();
      HashMap<Character,Integer>have = new HashMap<>();
    for(int i =0; i<n; i++){
        char ch = text.charAt(i);
    have.put(ch,have.getOrDefault(ch,0)+1);

    }

     HashMap<Character,Integer>need = new HashMap<>();
     need.put('b',1);
     need.put('a',1);
     need.put('l',2);
     need.put('o',2);
     need.put('n',1);
    
    int minimum = Integer.MAX_VALUE;
    for(char ch :need.keySet()){
       int required = have.getOrDefault(ch,0)/need.get(ch);
       minimum = Math.min(minimum,required);
    }
    return minimum;

    }
}