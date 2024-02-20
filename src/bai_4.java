import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tính tổng các số chẵn trong khoảng cho trước");
        System.out.println("Nhập vào số a ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b ");
        int b = sc.nextInt();
        int tong = 0;
        for (int i = a; i <= b; i++){
            if (i%2==0){
                tong += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng "+a+ "-"+b+ " là "+tong);
    }
}
