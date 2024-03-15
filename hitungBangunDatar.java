
import java.util.Scanner;


public class hitungBangunDatar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("------Isikan Pilihan------ :");
        
        int pilihan = sc.nextInt();
        if(pilihan == 1){
            System.out.println("\n Masukan Nilai Sisi");
            int s = sc.nextInt();
            
            BujurSangkar bs = new BujurSangkar(s);
            //int luas = bs.hitungLuas();
            //int keliling = bs.hitungKeliling();
            System.out.println(bs);
        }
        else if(pilihan == 2){
            System.out.println("\n Masukan Nilai Panjang");
            int p = sc.nextInt();
            
            System.out.println("\n Masukan Nilai Lebar");
            int l = sc.nextInt();
            
            PersegiPanjang ps = new PersegiPanjang(p, l);
            //int luas = ps.hitungLuas();
            //int keliling = ps.hitungKeliling();
            System.out.println(ps);
        }
        
    }
    
}
