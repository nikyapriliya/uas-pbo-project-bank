import java.util.Objects;

public class Login extends Daftar{

    public static void viewLoginPage() {
        System.out.println("-----------------------------");
        System.out.println("LOGIN PAGE");
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : ");
        user = NieBankApp.input();
        cancel(user);
        cekUser(user);
        System.out.print("Password : ");
        pass = NieBankApp.input();
        cancel(pass);
        cekPass(pass);
        login(user);
    }

    public static void cekUser(String user) {
        while (!NieBankApp.validasiUser(user)) {
            System.out.println("Username belum terdaftar !");
            System.out.print("Username : ");
            user = NieBankApp.input();
            cancel(user);
        }
    }
    public static void login(String user) {
        if (Objects.equals(user, "admin")) {
            Admin.viewMenuPage(user);
        } else {
            User.viewMenuPage(user);
        }
    }

    public static void cekPass(String pass) {
        while (!NieBankApp.validasiPass(pass)) {
            System.out.println("Password Salah !");
            System.out.print("Password : ");
            pass = NieBankApp.input();
        }
    }


}