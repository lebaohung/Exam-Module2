import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();

    public static void main(String[] args) {
        Main.showMenu();
        Main.controller();
    }

    public static void showMenu() {
        System.out.println("\n--CHUONG TRINH QUAN LY DANH BA--");
        System.out.println("Chon chuc nang theo so de tiep tuc");
        System.out.println("1. Xem danh sach");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Tim kiem");
        System.out.println("6. Doc tu file");
        System.out.println("7. Ghi vao file");
        System.out.println("8. Thoat");
        System.out.print("Chon chuc nang: ");
    }

    public static int scannerChoiceMenu() {
        int choiceMenu = scanner.nextInt();
        scanner.nextLine();
        while (choiceMenu < 1 || choiceMenu > 9) {
            System.out.print("Invalid choice! Enter again: ");
            choiceMenu = scanner.nextInt();
            scanner.nextLine();
        }
        return choiceMenu;
    }

    public static void controller() {
        int choice = Main.scannerChoiceMenu();
        switch (choice) {
            case 1:
                System.out.println("1.Xem danh sach");
                manager.show();
                Main.showMenu();
                Main.controller();
                break;
            case 2:
                System.out.println("2. Them moi");
                manager.add();
                Main.showMenu();
                Main.controller();
                break;
            case 3:
                System.out.println("3. Cap nhat");
                manager.edit();
                Main.showMenu();
                Main.controller();
                break;
            case 4:
                System.out.println("4. Xoa");
                Main.showMenu();
                Main.controller();
                break;
            case 5:
                System.out.println("5. Tim kiem");
                Main.showMenu();
                Main.controller();
                break;
            case 6:
                System.out.println("6. Doc tu file");
                Main.showMenu();
                Main.controller();
                break;
            case 7:
                System.out.println("7. Ghi vao file");

                Main.showMenu();
                Main.controller();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
}
