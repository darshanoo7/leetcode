class Solution {

    public List<Integer> gen(List<Integer> old){
        List<Integer> ret=new ArrayList<>();
        ret.add(1);
        for(int i=1;i<old.size();i++){
            ret.add(old.get(i-1)+old.get(i));
        }
        ret.add(1);
        return ret;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        List<Integer> old=new ArrayList<>();
        old.add(1);
        lst.add(old);
        for(int i=1;i<numRows;i++){
            List<Integer> newList=new ArrayList<>();
            newList=gen(old);
            lst.add(newList);
            old=newList;
        }
        return lst;
    }
}