import java.util.Scanner;

public class bai_7 {
    public static void chanLe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số để kiểm tra chẵn lẻ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" là số chẵn");
        }else {
            System.out.println(num+" là số lẻ");
        }
    }
    public static void soNguyenTo(){
        System.out.println("Nhập vào một số để kiểm tra số nguyên tố ");
        int num = new Scanner(System.in).nextInt();
        if (num<2){
            System.out.println(num+" không phải là số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num%i==0){
                    System.out.println(num+" không là số nguyên tố");
                }else {
                    System.out.println(num+" là số nguyên tố");
                }
            }
        }
    }
    public static void chiaHetCho3(){
        System.out.println("Nhập vào một số để kiểm tra số đó có chia hết cho 3 không");
        int num = new Scanner(System.in).nextInt();
        if (num%3==0){
            System.out.println(num+" là số chia hết cho 3");
        } else {
            System.out.println(num+" là số không chia hết cho 3");
        }
    }
    public static void main(String[] args) {
        while (true){
        System.out.println("*********\n Hãy chọn một trong các chữ cái dưới đây để thực hiện các phép toán \n a.Kiểm tra tính chẵn lẻ của một số \n b.Kiểm tra số nguyên tố" +
                "\n c.Kiểm tra một số có chia hết cho 3 không \n d.Thoát");
            String line = new Scanner(System.in).nextLine();
            if (line.equalsIgnoreCase("a")){
                chanLe();
            }
            if (line.equalsIgnoreCase("b")){
                soNguyenTo();
            }
            if (line.equalsIgnoreCase("c")){
                chiaHetCho3();
            }
            if (line.equalsIgnoreCase("d")){
                break;
            }
        }
    }
}
