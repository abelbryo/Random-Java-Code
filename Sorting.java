public class Sorting{
    public static void main(String [] args){

        int B [] = {3,1,5,4,2};
        int [] sortedArr = insertionSort(B);
        for (int i : sortedArr)
            System.out.println(i);
    }

    public static int[] insertionSort(int []  A ){
        int key, i = 0;
        for(int j = 0; j < A.length; j++){
            key = A[j];
            i = j - 1;
            while(i >= 0 && A[i] > key){
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1 ] = key;
        }    
        return A;
    }

}
