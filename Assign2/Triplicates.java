
import java.util.Arrays;

public class Triplicates {

    
    //essentially a modified merge sort, that will check for equality during
    //merging and return the value if it is duped.

    //s1.compareTo(s2) is s1 > s2
    //returns positive if true, neg if false, 0 if equal



    //follow the same idea as merge, except instead of moving to an
    //array, just iterate the operator of the lowest string
    //also, length of all 3 lists are the same
    //return empty string if none other found
    public static String findDupes(String[] a, String[] b, String[] c){
        int aa = 0, bb = 0, cc = 0;

        while((aa < a.length) && (bb < b.length) && (cc < c.length)){
            if (a[aa].compareTo(b[bb]) < 0){
                //b > a
                if (a[aa].compareTo(c[cc]) < 0) aa++;
                else if (a[aa].compareTo(c[cc]) > 0) cc++;
                else return a[aa];
            }

            else if (a[aa].compareTo(b[bb]) > 0){
                //b < a
                if (b[bb].compareTo(c[cc]) < 0) bb++;
                else if (b[bb].compareTo(c[cc]) > 0) cc++;
                else return b[bb];
            }

            else return a[aa];
        }

        while ((aa < a.length) && (bb < b.length)){
            if (a[aa].compareTo(b[bb]) > 0) bb++;
            else if (a[aa].compareTo(b[bb]) < 0) aa++;
            else return a[aa];
        }

        while ((aa < a.length) && (cc < c.length)){
            if (a[aa].compareTo(c[cc]) > 0) cc++;
            else if (a[aa].compareTo(c[cc]) < 0) aa++;
            else return a[aa];
        }

        while ((bb < b.length) && (cc < c.length)){
            if (b[bb].compareTo(c[cc]) > 0) cc++;
            else if (b[bb].compareTo(c[cc]) < 0) bb++;
            else return b[bb];
        }

        return "";
    }

    public static String checkDupicates(String[] a, String[] b, String[] c) {

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        return findDupes(a, b, c);
    }

}