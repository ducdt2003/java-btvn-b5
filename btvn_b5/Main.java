package btvn_b5;

import btvn_b5.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 1000000);

        while (true) {
            System.out.println("Vui lòng nhập username:");
            String userName = sc.nextLine();
            System.out.println("Vui lòng nhập password:");
            String passWord = sc.nextLine();
            if (account.login(userName, passWord)) {
                System.out.println("Đăng nhập thành công!");
                while (true) {
                    System.out.println("Chọn tính năng:");
                    System.out.println("1. Xem thông tin tài khoản");
                    System.out.println("2. Rút tiền");
                    System.out.print("Lựa chọn: ");
                    int choice = Integer.parseInt(sc.nextLine());

                    switch (choice) {
                        case 1:
                            account.showAccount();
                            break;
                        case 2:
                            System.out.print("Nhập số tiền muốn rút: ");
                            double amount = Double.parseDouble(sc.nextLine());
                            account.withdraw(amount);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    System.out.print("Do you want to continue? (Y/N): ");
                    String continueChoice = sc.nextLine();
                    if (continueChoice.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                }
            } else {
                System.out.println("Đăng nhập thất bại. Bạn có muốn thử lại không? (Y/N)");
                String retryChoice = sc.nextLine();
                if (retryChoice.equalsIgnoreCase("N")) {
                    System.exit(0);
                }
            }
        }
    }
}