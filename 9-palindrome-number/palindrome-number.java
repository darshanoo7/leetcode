class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String a=String.valueOf(x);
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(a.equals(rev)){
            return true;
        }
        return false;
    }

}