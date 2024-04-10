class Solution {
    
    public boolean isIsomorphic(String s, String t) {
       
        Map<Integer,Integer> m1= new HashMap<>();
        Map<Integer,Integer> m2= new HashMap<>();
        List<Character> l1=new ArrayList<>();
        List<Character> l2=new ArrayList<>();

        
        for(int i=0;i<s.length();i++){
            if(l1.contains(s.charAt(i))){
                m1.put(i,l1.indexOf(s.charAt(i)));
                l1.add(s.charAt(i));
            }
            else{
            l1.add(s.charAt(i));
            m1.put(i,i);
            }
            
             if(l2.contains(t.charAt(i))){
                m2.put(i,l2.indexOf(t.charAt(i)));
                l2.add(t.charAt(i));
            }
            else{
            l2.add(t.charAt(i));
            m2.put(i,i);
            }
            
        }
    
        if(m1.equals(m2)){
            return true;
        }
        
        return false;
        
    }
}