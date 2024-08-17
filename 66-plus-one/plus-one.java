class Solution {
    public boolean isNine(int[] digits){
        for(int i:digits){
            if(i!=9)
                return false;
        }
        return true;
    }
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(isNine(digits)){
            len++;
        }
        int[] arr=new int[len];
        int carry=1;
        
        for(int i=0;i<digits.length;i++){
            arr[arr.length-1-i]=(digits[digits.length-1-i]+carry)%10;
            carry=(digits[digits.length-1-i]+carry)/10;
        }

        if(carry!=0){
            arr[0]=carry;
        }

        return arr;
        
    }
}