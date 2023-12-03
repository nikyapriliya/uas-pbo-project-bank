import java.util.Objects;

public class Tarik extends User{
    public static Integer tarik;
    public static void viewTarik(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = NieBankApp.inputNumber();
        if(Objects.equals(input, "x")){
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        Integer tarik = Integer.parseInt(input);
        if(tarik <= Saldo.Saldo){
            NieBanKApp.addTrx(user, "Tarik   ",(-tarik));
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup !");
            viewTarik(user);
        }

    }
}