import java.util.Scanner;

public class ChecktheSumofArray{
    
    public static boolean isThereASum(int arr[], int t){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == t){
                    return true;
                }
            }
        }
        return false;
}

public static void main(String[] args){

    int[] arr = {0, -1, 2, -3, 1};
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a value of 't': ");
     int t = sc.nextInt();

     System.out.println("The sum of Arry match the value t: " + isThereASum(arr, t));
}

}
