class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> se=new HashSet<>();
        for(Integer i : nums){
            if(se.contains(i)){
                return true;
            }
            se.add(i);
        }
        return false;
    }
}