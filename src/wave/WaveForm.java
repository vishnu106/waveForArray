package wave;

public class WaveForm {
    public static void main(String[] args) {
        int arr[]= {2,4,7,8,9,10};



        for (int i = 0,k=0,j=1; i < arr.length; i+=2,j+=2) {
            if (i >= arr.length || j >= arr.length ){
                i= arr.length-1;;
                j= arr.length-1;;
                System.out.println(arr[j]); break;
            }
            System.out.println(arr[j]);
            System.out.println(arr[i]);
        }
    }
}
