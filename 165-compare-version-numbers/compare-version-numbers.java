class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int ans=0;
        
        int[] arr1=new int[s1.length];
        int[] arr2=new int[s2.length];

         for (int i = 0; i < s1.length; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }
         
         if(s1.length>s2.length){
        for(int i=0;i<s2.length;i++){
            if(arr1[i]>arr2[i]){
                ans=1;
                break;}
            else if(arr1[i]<arr2[i]){
                ans=-1;
                break;}
        }if(ans==0){
        for(int i=s2.length;i<s1.length;i++){
            if(arr1[i]!=0)
                ans=1;
        }}
         }else{
            for(int i=0;i<s1.length;i++){
            if(arr1[i]>arr2[i]){
                ans=1;
                break;}
            else if(arr1[i]<arr2[i]){
                ans=-1;
                break;}
        }if(ans==0){
        for(int i=s1.length;i<s2.length;i++){
            if(arr2[i]!=0)
                ans=-1;
        }}
         }

         return ans;
    }
}