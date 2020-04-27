import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
    private LinkedList<Contact> contactsList = new LinkedList<Contact>();
    private Scanner scanner = new Scanner(System.in);

    public void show() {
        System.out.printf("%-15s%-10s%-20s%-10s%-20s\n", "SDT", "Nhom", "Ho ten", "Gioi tinh", "Dia chi");
        for (int i = 0; i < contactsList.size(); i++) {
            Contact thisContact = contactsList.get(i);
            System.out.printf("%-15s%-10s%-20s%-10s%-20s\n", thisContact.getSdt(), thisContact.getNhom(), thisContact.getTen(), thisContact.getGioitinh(), thisContact.getDiachi());
        }
    }

    public void add() {
        System.out.print("So dien thoai moi* (10 so): ");
        String sdt = scanner.nextLine();
        while (!sdt.matches("^[0-9]{10}") || sdt.isEmpty()) {
            System.out.print("So dien thoai khong hop le! Vui long nhap lai: ");
            sdt = scanner.nextLine();
        }
        System.out.print("Nhom: ");
        String nhom = scanner.nextLine();
        System.out.print("Ho ten* : ");
        String hoten = scanner.nextLine();
        while (hoten.isEmpty()) {
            System.out.print("Khong phu hop! Nhap lai: ");
        }
        System.out.println("Gioi tinh* (nam/nu): ");
        String gioitinh = scanner.nextLine();
        while (gioitinh.toLowerCase().equals("nam") || gioitinh.toLowerCase().equals("nu")) {
            System.out.print("Khong phu hop! Nhap lai (nam/nu): ");
            gioitinh = scanner.nextLine();
        }
        System.out.print("Dia chi: ");
        String diachi = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        while (email.matches("^[\\w\\d]+@[\\w\\d]+\\.[\\w\\d]+$")) {
            System.out.print("Khong phu hop! Nhap lai: ");
        }
        System.out.print("Ngay sinh(dd/mm/yyyy): ");
        String ngaysinh = scanner.nextLine();
        while (ngaysinh.matches("^\\d\\d/\\d\\d/\\d{4}$")) {
            System.out.println("Khong phu hop! Nhap lai: ");
        }
        Contact contact = new Contact(sdt, nhom, hoten, gioitinh, diachi, email, ngaysinh);
        contactsList.add(contact);
    }

    public void edit() {
        System.out.println("Nhap so dien thoai: ");
        String sdt = scanner.nextLine();
        while (sdt.matches("^[0-9]{10}")) {
            System.out.print("Khong tim duoc so dien thoai tren! Nhap lai: ");
            sdt = scanner.nextLine();
        }
        for (int i = 0; i < contactsList.size(); i ++) {
            if (contactsList.get(i).getSdt().equals(sdt)) {

            }
        }

    }

}
