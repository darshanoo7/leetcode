class Solution {

    

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();

        int n=students.length;
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
            s.push(sandwiches[n-i-1]);
        }

        int attempt=0;

        while(!q.isEmpty() && attempt <q.size()){
            if(q.peek()==s.peek()){
                q.remove();
                s.pop();
                attempt=0;
            }
            else{
                q.offer(q.remove());
                attempt++;
            }
            
        }        
        System.out.println(q);
                    return q.size();


       
}
}