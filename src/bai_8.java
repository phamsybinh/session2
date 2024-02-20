import java.util.Scanner;

public class bai_8 {
    public static boolean kiemTra3CanhTamGiac(double a, double b, double c){
            return (a+b>c) && (a+c>b) && (b+c>a);
    }
    public static void tinhDienTichChuVi(double a, double b, double c){
        double p = (a + b + c) / 2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double chuVi = a + b + c;
        System.out.println("Diện tích tam giác là " + dienTich);
        System.out.println("Chu vi tam giác là " + chuVi);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào 3 cạnh của một tam giác để tính chu vi, diện tích");
            System.out.println("Nhập độ dài cạnh a: ");
            double a = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh b: ");
            double b = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh c: ");
            double c = sc.nextDouble();
            if (kiemTra3CanhTamGiac(a,b,c)){
                tinhDienTichChuVi(a,b,c);
            } else {
                System.out.println("Ba cạnh không thỏa mãn điều kiện của một tam giác");
            }
            System.out.println("Có tiếp tục không? (c/k)");
            String line = new Scanner(System.in).nextLine();
            if (line.equalsIgnoreCase("k")){
                break;
            }
        }
    }
}
