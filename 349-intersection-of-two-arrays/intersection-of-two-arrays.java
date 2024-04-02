class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        
        for(Integer i : nums1){
            s1.add(i);
        }
        
        for(Integer i : nums2){
            s2.add(i);
        }
        
        for(Integer j:nums1){
            if(s2.contains(j)){
                if(!s3.contains(j))
                    s3.add(j);
            }
        }

        for(Integer j:nums2){
            if(s1.contains(j)){
                if(!s3.contains(j))
                    s3.add(j);
            }
        }
        
        int[] ans=new int[s3.size()];
        int u=0;
        for(Integer k: s3){
            ans[u]=k;
            u++;
        }
        
        return ans;
        
    }
}