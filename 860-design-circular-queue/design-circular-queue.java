class MyCircularQueue {
    
    int[] data;
    int front=-1,rear=-1,k;

    public MyCircularQueue(int k) {
       data=new int[k];
        this.k=k;
    }
    
  
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else{
            if(front==-1){
                front=rear=0;
            }
            else{
                rear=(rear+1)%k;
            }
            data[rear]=value;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else{
            if(front==rear)
                front=rear=-1;
            else
                front=(front+1)%k;
            return true;
        }
    }
    
    public int Front() {
        if(front==-1)
            return -1;
       return data[front];
    }
    
    public int Rear() {
        if(rear==-1)
            return -1;
        return data[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(front==(rear+1)%k){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */