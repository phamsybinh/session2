import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scaner sc = new Scanner(System.in);
        System.out.println("Kiểm tra 1 số có chia hết cho 3 và 5 ");
        System.out.println("Nhập vào một số");
        int num = sc.nextInt();
        if (num%3==0){
            if (num%5 == 0){
                System.out.println(num+ " chia hết cho 3 và 5");
            }
        } else {
            System.out.println(num+ " không chia hết cho 3 và 5");

        }
    }
}
