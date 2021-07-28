package BTVN;

import java.util.Scanner;

public class bai02 {
    public static boolean SoNguyenTo (int n){
        // check so nguyen to khi n < 2
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so nguyen n: ");
        int n = sc.nextInt();
        System.out.print("Cac so nguyen to nho hon n la: ");
        for (int i=0; i<=n; i++){
            if (SoNguyenTo(i)== true){
                System.out.printf("%d  " , i);
            }
        }

    }

}