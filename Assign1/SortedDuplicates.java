public class SortedDuplicates {

    private static void printDuplicates(int[] arr1, int[] arr2){

        int j;

        for (int i = 0; i < arr1.length; i++){
           if (arr1[i] == arr2[i]){
               System.out.println(arr1[i]);
           }

           else if (arr1[i] > arr2[i]){
            j = i;

            while (j < arr1.length && arr1[i] > arr2[j]){
                j++;
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
            
           }

           else{
               j = i;

               while (j > 0 && arr1[i] < arr2[j]){
                   j--;
                   if (arr1[i] == arr2[j]){
                       System.out.println(arr1[i]);
                   }
               }
           }
        }
    }    
}
