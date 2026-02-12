package baitap1;

import java.util.Scanner;

public class Main {
    static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Loi: Cac canh phai la so duong.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tong 2 canh phai lon hon canh con lai.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap canh a: ");
            double a = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Nhap canh b: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Nhap canh c: ");
            double c = Double.parseDouble(sc.nextLine().trim());

            validateTriangle(a, b, c);

            System.out.println("Tam giac hop le: a=" + a + ", b=" + b + ", c=" + c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Loi: Vui long nhap dung dinh dang so.");
        }
    }
}
