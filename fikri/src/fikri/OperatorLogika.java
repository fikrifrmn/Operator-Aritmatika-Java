package fikri;

//Fikri Firmansyah
//2209010131

import java.util.Scanner;
public class OperatorLogika {
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        boolean hasil1;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Penjumlahan
        hasil = nilai1+nilai2;
        System.out.println("Hasil = " +hasil);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Pengurangan
        hasil = nilai1-nilai2;
        System.out.println("Hasil"+hasil);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Perkalian
        hasil = nilai1*nilai2;
        System.out.println("Hasil = "+hasil);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Pembagian
        hasil = nilai1/nilai2;
        System.out.println("Hasil = "+hasil);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input anka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Sisa Bagi
        hasil = nilai1%nilai2;
        System.out.println("Hasil = "+hasil);
        
        //OPERATOR PENUGASAN
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Pengisian dan Penambahan
        hasil = nilai1 += nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil +="+hasil);
        
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Pengisian dan Pengurangan
        hasil = nilai1 -= nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil -= "+hasil);
        
        //OPERATOR PEMBANDING
        System.out.println("Input angka -1 = ");
        nilai1 = keyboard.nextInt();
        System.out.println("Input anka -2 = ");
        nilai2 = keyboard.nextInt();
        
        //Lebih Besar
        hasil1 = nilai1 > nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("nilai1 > nilai2 = "+hasil1);
        
        //OPERATOR BITWISE
        int Nilai3,Nilai4,hasil3;
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE and (&)
        
        hasil3 = Nilai3 & Nilai4;
        System.out.println("BITWISE and (&)");
        System.out.println("nilai1 & nilai2 = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE OR (|)
        hasil3 = Nilai3 | Nilai4;
        System.out.println("BITWISE OR (|)");
        System.out.println("nilai1 | nilai2 = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE XOR (|)
        hasil3 = Nilai3 ^ Nilai4;
        System.out.println("BITWISE XOR (|)");
        System.out.println("nilai1 ^ nilai2 = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE NEGASI(~)
        hasil3 = ~Nilai4;
        System.out.println("BITWISE NEGASI(~)");
        System.out.println("~ Nilai4 = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE RIGHT SHIFT
        hasil3 = Nilai4 >> Nilai3;
        System.out.println("BITWISE RIGHT SHIFT");
        System.out.println("Nilai = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE LEFT SHIFT
        hasil3 = Nilai4 << Nilai3;
        System.out.println("BITWISE LEFT SHIFT");
        System.out.println("Nilai = "+hasil3);
        
        System.out.println("Input angka -1 = ");
        Nilai3 = keyboard.nextInt();
        System.out.println("Input angka -2 = ");
        Nilai4 = keyboard.nextInt();
        
        //BITWISE RIGHT SHIFT UNSIGNED
        hasil3 = Nilai4 >>> Nilai3;
        System.out.println("BITWISE RIGHT SHIFT UNSIGNED");
        System.out.println("Nilai = "+hasil3);  
    }
    
}
