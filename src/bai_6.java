public class bai_6 {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên sử dụng for và while");
        int i = 2;
        int dem=0;
        while (i<=200){
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if(i%j==0){
                    check = false;
                }

            }
            if (check){
                dem = dem +1;
                if (dem <= 20){
                    System.out.print(i+" ");
                }
            }
            i++;
        }
    }
}
