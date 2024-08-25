import java.util.Scanner;
public class Problem10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int product = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (arr[i] * arr[j] * arr[k] == product){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
