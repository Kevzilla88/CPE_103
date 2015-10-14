/**
 * Created by Kevin on 10/13/2015.
 */
public class TreeWork {

    public static <T extends Comparable<? super T>> boolean isHeap (T[] arr, int N){

        for (int i=0; i<N; i++) {
            if (i*2+1<N && arr[i * 2 + 1].compareTo(arr[i]) < 0) {

                return false;
            } else if (i*2+2<N && arr[i * 2 + 2].compareTo(arr[i]) < 0) {

                return false;
            }
        }
        return true;
    }
    public static <T > void printTree (T[] arr, int N){


    }
}
