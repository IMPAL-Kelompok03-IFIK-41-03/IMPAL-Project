  
package pspec;

import java.util.Scanner;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 */
//No proses  : 1.2
//Nama proses  : Menyetujui syarat dan ketentuan

public class menyetujui_syarat_dan_ketentuan {
    public static void main(String[] args) {
        //User membuka form data diri user
        String nama,gender,email,password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama user: ");
        nama = input.nextLine();
        System.out.print("Masukan gender user: ");
        gender = input.nextLine();
        System.out.print("Masukan email user: ");
        email = input.nextLine();
        System.out.print("Masukan password user: ");
        password = input.nextLine();
        
        //Menyetujui syarat dan ketentuan
        String validate = nama+gender+email+password;
        System.out.println("Apakah kamu menyetujui syarat dan ketentuan?"); 
        System.out.print("ya atau tidak: ");
        String ya = null;
        ya =input.nextLine();
        if(validate != ya){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Akun berhasil dibuat:");
            System.out.print("Nama: ");
            System.out.println(nama);
            System.out.print("Gender: ");
            System.out.println(gender);
            System.out.print("Email: ");
            System.out.println(email);
        }else{
            System.out.println("Akun tidak berhasil dibuat");
        }
    }
}


/**
 *
 * @author Irawansyah
 */
//No. proses    : 2.2
//Nama proses   : Verifikasi user

public class verifikasi_user {
    public static void main(String[] args) {
        //user sudah bisa login dan menginput username berupa email dan password
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Email: ");
        String email = input.nextLine();
        System.out.print("Masukan Password: ");
        String password = input.nextLine();
        String ya = null;
        if(email== ya && password==ya){
            System.out.println("Gagal Memverifikasi");
        }else{
            System.out.println("Login Berhasil");
        }        
    }
}


/**
 *
 * @author Ifdhal Hadi
 */
//Nomor proses : 3.1
//Nama proses  : pilih rumpun jurusan 

public class pilih_rumpun_jurusan {
    public static void main(String[] args) {
        //Pilih rumpun jurusan adalah proses setelah login
        //Pilih menu test
     
        Scanner input = new Scanner(System.in);
        System.out.println("PILIH RUMPUN JURUSAN YANG SESUAI DENGAN KALIAN");
        System.out.print("IPA Atau IPS: ");
        String IPA = input.nextLine().toLowerCase();
        String c = null ;
        if(IPA !=c){
            System.out.print("RUMPUN JURUSAN YANG KAMU PILIH ADALAH: ");
            System.out.println(IPA);
        }else{
            System.out.println(IPA);
        }
    }
}


/**
 *
 * @author Kamila Hanum
 */

//No proses 	: 1.1
//Nama proses 	: Isi data user

public class isi_data_user {

    public static void main(String[] args) {
        //User membuka form data diri user
        String nama,gender,email,password;
        Scanner input = new Scanner(System.in);
        nama = input.nextLine();
        gender = input.nextLine();
        email = input.nextLine();
        password = input.nextLine();
        System.out.print("Masukan nama user: ");
        System.out.println(nama);
        System.out.print("Masukan gender user: ");
        System.out.println(gender);
        System.out.print("Masukan email user: ");
        System.out.println(email);
        System.out.print("Masukan password user: ");
        System.out.println(password);      
    }   
}
