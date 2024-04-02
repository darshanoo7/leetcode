class Solution {
    
    public boolean contains(int[] nums,int target){
        int count=0;

        for(Integer i: nums){
            if(i==target){
                count++;
            }
        }
        if(count==1)
            return true;
        return false;
    }
    
    public int singleNumber(int[] nums) {
        int ans=-1;
        for(Integer i:nums){
            if(contains(nums,i)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}