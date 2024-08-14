class Solution {
    public boolean containsStr(String haystack,String needle,int i){
        if(i+needle.length()>haystack.length())
            return false;
        String com=haystack.substring(i,i+needle.length());
        if(needle.equals(com)){
            return true;
        }
        return false;
    }
    public int strStr(String haystack, String needle) {
        
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(containsStr(haystack,needle,i)){
                    return i;
                }
            }
        }
        return -1;

    }
}