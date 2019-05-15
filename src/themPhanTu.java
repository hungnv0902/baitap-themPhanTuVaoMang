import java.util.Scanner;

public class themPhanTu {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]+"\t");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so muon chen :");
        int x = input.nextInt();
        System.out.println("Nhap vao vi tri can chen");
        int index = input.nextInt();

        if(index <= 1 && index > arr.length) {
            System.out.println("KHong chen dc phan tu");
        } else {
            for(int i = arr.length-1; i > index; i--) {
                arr[i-1] = arr[i - 2];

            }
            arr[index-1] = x;


            for(int i = 0; i < arr.length; i ++) {
                System.out.print(arr[i]+"\t");
            }
        }

    }
}
