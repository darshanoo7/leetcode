class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        for(int i=0;i<word.length();i++){
                if(word.charAt(i)==ch){
                    for(int j=0;j<=i;j++){
                        ans+=word.charAt(i-j);
                    }
                    for(int j=i+1;j<word.length();j++){
                        ans+=word.charAt(j);
                    }
                    return ans;
                }
        }

        return word;
    }
}