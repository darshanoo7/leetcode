class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map= new HashMap<>();
        String[] ans=new String[names.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<heights.length;i++){
            map.put(heights[i],names[i]);
            arr.add(heights[i]);

        }

        Collections.sort(arr);
        for(int i=0;i<heights.length;i++){
            ans[i]=map.get(arr.get(heights.length-1-i));
        }

        return ans;
    }
}