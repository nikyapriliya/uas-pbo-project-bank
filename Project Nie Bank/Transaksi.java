import java.util.Objects;

public class Transaksi extends User {
    public static void viewTransaksi(String user) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Username\t| Jenis Transaksi\t| Nominal\t| Saldo Akhir\t|");
        System.out.println("-------------------------------------------------------------");
        if(user == null){
            for(int i = 0; i < NieBankApp.trx1.length; i++){
                System.out.println("| "+NieBankApp.trx1[i]+"\t\t| "+NieBankApp.trx2[i]+"\t\t\t| "+NieBankApp.trx3[i]+"\t\t| "+SiBangApp.getTrx4()[i]+"\t\t\t| ");
            }
        } else{
            for(int i = 0; i < NieBankApp.trx1.length; i++) {
                if (Objects.equals(NieBankApp.trx1[i], user)) {
                    System.out.println("| " + NieBankApp.trx1[i] + "\t\t| " + NieBankApp.trx2[i] + "\t\t\t| " + NieBankApp.trx3[i] + "\t\t| " + NieBankApp.getTrx4()[i] + "\t\t\t| ");
                }
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.print("Tekan enter untuk kembali");
        SiBangApp.input();
        Admin.viewMenuPage(user);
    }
}