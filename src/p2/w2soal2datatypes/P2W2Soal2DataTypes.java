
package p2.w2soal2datatypes;
import java.util.Scanner; //menambahkan library untuk menggunakan fungsi Scanner scan = new Scanner(Sytem.in)

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2W2Soal2DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //membuat sebuah objek scanner benama scan yang befungsi untuk scan input dari user
        int banyak = scan.nextInt(); //mengisi variabel banyak dengan hasil input user
        StringBuilder hasil = new StringBuilder(); //membuat sebuah objek string bernama hasil dengan menggunakan StringBuilder
        /*  StringBuilder ini merupakan fungsi yang ada pada Java dimana menampung string dalam memori
            StringBuilder biasanya digunakan dengan .append yang bertujuan mengisi StringBuilder
            Beberapa metode pada StringBuilder:
            .append     : menambahkan string pada akhir string yang sedang dibangun oleh StringBuilder
            .insert     : menambahkan string pada posisi tertentu dalam string yang sedang dibangun oleh StringBuilder
            .delete     : menghapus string pada posisi tertentu dalam string yang sedang dibangun oleh StringBuilder
            .replace    : menggantikan string pada posisi tertentu dalam string yang sedang dibangun oleh StringBuilder
            .reverse    : membalik urutan string yang sedang dibangun oleh StringBuilder
            .capacity   : mendapatkan kapasitas dari StringBuilder, default adalah 16 dan bisa bertambah sesuai isi string di dalamnya
            .length     : mendapatkan kapasitas dari StringBuilder tanpa memasukan nilai defaultnya
        */
        for (int i = 0; i < banyak; i++) { //loop for yang di tentukan oleh input pertaman user
            try { //salah satu fungsi pada java yang memungkinkan jika sesuatu yang digunakan untuk menangani potensi kesalahan atau Exception
                long input = scan.nextLong(); //mengisi variable input bertipe long dengan scan
                hasil.append(input).append(" can be fitted in:\n");
                if (input >= -128 && input <= 127) {
                    hasil.append("* byte\n"); //menggunakan append karena kita akan menambahkan string baru dari belakang
                }
                if (input >= -32768 && input <= 32767) {
                    hasil.append("* short\n");
                }
                if (input >= -2147483648 && input <= 2147483647) {
                    hasil.append("* int\n");
                }
                if (input >= -9223372036854775808L && input <= 9223372036854775807L) {
                    hasil.append("* long\n");
                }
            } catch (Exception e) {
                hasil.append(scan.next()).append(" can't be fitted anywhere.\n");
            }
        }

        System.out.println(hasil);
    }
}
