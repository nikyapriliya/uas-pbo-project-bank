import java.util.Objects;

public class LandingPage{
    public static void viewLandingPage() {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG DI NIE BANK APP");
        System.out.println("-----------------------------");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.print("Masukkan Pilihanmu : ");
        String pilih = NieBankApp.input();
        landingPage(pilih);
    }

    public static void landingPage(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Login.viewLoginPage();
        } else if (Objects.equals(pilih, "2")) {
            Daftar.viewDaftarPage();
        } else {
            NieBankApp.salah();
            LandingPage.viewLandingPage();
        }
    }


}