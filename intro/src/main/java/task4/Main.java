package task4;

/**
 * Created by kpkshke on 26.06.17.
 * Task4 with array of random doubles between in range of [0;100]
 */
public class Main {
    public static void main(String[] args) {
        int length = 10; // length of array, length = 2*n
        double A[] = new double[length]; // array A

        // init of array by random doubles
        for (int i = 0; i < length; i++) {
            A[i] = Math.random()*100;
        }

        searchForMaxPair(A);
    }

    private static void searchForMaxPair (double[] A) {
        double max = Double.MIN_VALUE; // temp var to store max value

        for (int i = 0; i < A.length/2; i++) {
            if (A[i] + A[A.length - 1 - i] > max) {
                max = A[i] + A[A.length - 1 - i];
            }
        }

        System.out.println("Your max is " + max);
    }

}
