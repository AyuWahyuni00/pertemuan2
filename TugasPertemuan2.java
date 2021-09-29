/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pertemuan.pkg2;

/**
 *
 * @author acer
 */
public class TugasPertemuan2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        TugasPertemuan2 per = new TugasPertemuan2();
        System.out.println("=====Variable=====");
        per.perVariabel();
        System.out.println("=====Perbandingan=====");
        per.perPercabanganIf();
        System.out.println("====Percabangan====");
        per.perpercabanganIfElse();
        System.out.println("====Percabangan====");
        per.perPencabanganIfElseIf();
        System.out.println("====Percabangan====");
        per.perPercabanganSwitchCase();
         }
    
    void perVariabel(){
//    deklarasi variabel
String nama_depan, namaBelakang, alamat;
int npm, umur,noHp;
// isi variable
nama_depan = "Ayu";
namaBelakang ="Wahyuni";
alamat ="Pasaman Barat";
npm =19100076;
umur= 21;
noHp=628228742;
// cetak
        System.out.println("Nama : " + nama_depan + " " + namaBelakang);
        System.out.println("Alamat : " + alamat);
        System.out.println("NPM : " + npm);
        System.out.println("No Hp : " + noHp);
        System.out.println("Umur : " + umur);
    }    
    
    void perPercabanganIf() {
        int belanja =15000000;
        
//  mengambil input
        System.out.println("Total Belanja Rp : " + belanja +" ");
        
//  pecabangan if dengan nimonal 150000
        if (belanja >= 150000000) {
            System.out.println("Selamat Anda Mendapatkan Hadiah");
        }
        
        System.out.println("Terima Kasih Telah Belanja di Toko Kami");
    }  
    
   void perpercabanganIfElse(){
//deklarasi
   int nilai;
   String nama;
   
   nilai = 50;
   nama = "Wahyuni";
//mengambil input
       System.out.println("Nama:" +nilai);
       System.out.println("Nilai:" +nama);
       
//cek apakah dia lulus atau tidak
  if (nilai>=70){
       System.out.println("Selamat" +nama+", anda lulus");
  } else {
      System.out.println("Maaf" +nama+", anda gagal");
  }
   }
   
   void perPencabanganIfElseIf(){
//deklarasi
       int nilai;
       String grade;
//mengambil input
       System.out.println("Inputkan nilai:");
       nilai = 81;
//hitung gradenya
       if (nilai>90 && nilai <=100){
           grade = "A";
       } else if (nilai >80 && nilai <=90){
           grade = "B+";
       } else if (nilai >70 && nilai <=80){
           grade = "B";
       } else if (nilai >60 && nilai <=70){
           grade = "C+";
       } else if (nilai >50 && nilai <=60){
           grade = "C";
       }else if (nilai >40 && nilai <=50){
           grade = "D";
       } else {
           grade = "E";
       } 
//cetak hasilnya
       System.out.println("Grade:" + grade);
   }
       
   void perPercabanganSwitchCase(){
//Deklarasi
       String lampu;
//mengambil input
       System.out.println("inputkan nama warna:");
       lampu ="merah";
       
       switch (lampu){
           case "merah":
               System.out.println("Lampu Merah, berhenti!");
               break;
            case "kuning":
               System.out.println("Lampu Kuning, Harap hati-hati!");
               break;
            case "hijau":
               System.out.println("Lampu Hijau, silahkan jalan!");
               break;
            default:
                    System.out.println("Warna lampu salah");
       }
       
   }
}