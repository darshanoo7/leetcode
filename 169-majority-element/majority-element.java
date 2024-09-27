class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int curr=nums[0];
        int count=0;
        int ret=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=curr){
                count=0;
                curr=nums[i];
            }
            count++;
            if(count>n/2){
                ret=nums[i];
                break;
            }
        }
        return ret;


    }
}