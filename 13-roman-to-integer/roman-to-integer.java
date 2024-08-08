class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int sum=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            
            char a=s.charAt(i);
           if(a=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                sum-=2*1;
           }
           if(a=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                sum-=2*10;
           }
           if(a=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                sum-=2*100;
           }
            sum+=map.get(a);
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}