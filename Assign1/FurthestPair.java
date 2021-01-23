public class FurthestPair {

    private static double[] findPair(double[] arr){
        double[] pair  = new double[2];

        double min = arr[0], max = arr[0];

        for (double num : arr){
            if (num < min){
                min = num;
            }

            if (num > max){
                max = num;
            }
        }

        pair[0] = min;
        pair[1] = max;

        return pair;

    }
    
}
