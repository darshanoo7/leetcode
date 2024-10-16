class Solution {
    public int myAtoi(String s) {
        int al=0;
        String num="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                if(al==0){
                    continue;
                } else{
                    break;
                }
                
            } else if(c=='-' || c=='+'){
                if(al==0){
                    
                    if(c=='-'){
                        num+='-';
                    }
                    
                    al=1;
                } else{
                    break;
                }
            } else if(c>='0' && c<='9'){
                if(c=='0'&&al<3){
                    al=2;
                    continue;
                }
                al=3;
                num+=c;
                
            } else{
                break;
            }
        }


        if(num=="" || num.equals("-")){
            return 0;
        }
        if(num.length()>12){
            if(num.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        System.out.println(num);
        long n=Long.parseLong(num);
        int ret=0;
        if(n>=Math.pow(2,31)-1){
            ret=Integer.MAX_VALUE;
        } else if(n<=Math.pow(-2,31)){
            ret=Integer.MIN_VALUE;
        } else{
            ret=(int) n;
        }

        return ret;

    }
}