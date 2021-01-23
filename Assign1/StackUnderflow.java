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
    
    

    //unsure about this one.
    private static boolean canPermExist(char[] n){
        return true;
    }

    
}
