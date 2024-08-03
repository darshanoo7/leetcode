class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        ArrayList<Integer> target1=new ArrayList<>();
        // ArrayList<Integer> arr1=new ArrayList<>();
        
        for(int t:target){
            target1.add(t);
        }
        // for(int a:arr){
        //     arr1.add(a);
        // }
        Collections.sort(target1);
        // Collections.sort(arr1);
        // if(target.length!=arr.length) return false;
        // if(target1.equals(arr1)) ==true) return true;
        // return false;

        for(int e:arr){
            if(target1.contains(e)){
                target1.remove(Integer.valueOf(e));
            }
        }

        if(target1.isEmpty()){
            return true;
        }
        return false;
    }
}