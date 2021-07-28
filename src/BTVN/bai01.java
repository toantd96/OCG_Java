package BTVN;

public class bai01 {
    public static void main(String[] args) {
        System.out.print("Cac so tu 10 den 200 chia het cho 7 ma khong chia het cho 5 la: ");

        for (int i = 10; i < 201; i++) {
            if ((i % 7 == 0) && (i % 5 != 0)) {
                System.out.printf("%d,",i);

            }
        }
    }
}
