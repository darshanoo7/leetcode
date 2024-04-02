class MyLinkedList {
    int length;
    Node head;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    } 
    public MyLinkedList(){
        this.length=0;
        this.head=null;
    }
    
    public int get(int index) {
        if(index < 0 || index >= this.length)
            return -1;
        else{
            int counter =0;
            Node curr=head;
            while(counter!=index){
                curr=curr.next;
                counter++;
            }
            return curr.val;
        }
    }
    
    public void addAtHead(int val) {
        
        Node newNode = new Node(val);
        newNode.next=this.head;
        this.head=newNode;
        this.length++;
    }
    
    public void addAtTail(int val) {
        if(this.length==0){
            addAtHead(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        this.length++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        Node temp=this.head;
        int counter=0;
        if(index==this.length){
            addAtTail(val);
            return;
        }
        if(index>this.length){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        while (counter!=index-1){
            temp=temp.next;
            counter++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        this.length++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>= this.length){
            return;
        }
        Node curr=this.head;
        int counter=0;
        
        if(index==0){
            this.head=curr.next;
            this.length--;
        }
        else{
            Node pre=null;
            
            while(counter<index){
                pre=curr;
                curr=curr.next;
                counter++;
            }
            pre.next=curr.next;
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */