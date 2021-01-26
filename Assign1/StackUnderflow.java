public class StackUnderflow {
    

    private static boolean willUnderflow(char[] n){

        int height = 0;

        for (int i = 0; i < n.length; i++){
            if (n[i] == '-'){
                height--;
            }
            else {
                height++;
            }
            if (height < 0){
                return true;
            }
        }
        return false;
    }
    
    

    //n is the length of the sequence
    private static boolean canPermExist(int[] perm, int n){
        myStack stack = new myStack(n);

        for (int i = 0; i < n; i++){

            if (perm[i] == stack.peek()){
             stack.pop();   
            }

            else if (perm[i] > stack.peek() || stack.getHeight() == 0){
                for (int j = i; j < perm[i]; j++){
                    stack.push(j);
                }
            }

            else {
                return false;
            }
        }
        return true; 
    }

    
}
