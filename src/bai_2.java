
public class bai_2 {
    public static void main(String[] args) {

        System.out.println("Chuyển đổi số thành chữ");
        System.out.println("Nhập vào một số");
        int num = sc.nextInt();
        switch (num){
            case 0:
                System.out.println("Số Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số Chín");
                break;
            default:
                System.out.println("Bạn nhập sai định dạng");
        }
    }
}
