public class myStack {

    private int[] arr;
    private int height = 0;

    public myStack(int size){
        arr = new int[size];
    }

    public void push(int val){
        arr[height] = val;
        height++;
    }

    public int pop(){
        height--;
        return arr[height];
    }

    public int peek(){
        return arr[height-1];
    }

    public int getHeight(){
        return height;
    }
    
}
