import java.util.Scanner;

public class BukuMain {
    void inputCetak() {
        Buku book = new Buku();
        Scanner input = new Scanner(System.in);
        System.out.println("Halo Silahkan Memasukan data dari Buku anda");
        System.out.print("Kode Buku: ");
        String kode = input.nextLine();
        System.out.print("Pengarang: ");
        String pengarang = input.nextLine();
        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahunTerbit = input.nextLine();
        System.out.print("Stok: ");
        int stok = input.nextInt();

        book.setKodeBuku(kode);
        book.setPengarang(pengarang);
        book.setJudul(judul);
        book.setTahunTerbit(tahunTerbit);
        book.setStok(stok);
        int Stok = book.getStok();
        System.out.println("Kode Buku anda adalah : " + book.getKodeBuku());
        System.out.println("Pengarang Buku anda adalah : " + book.getPengarang());
        System.out.println("Judul Buku anda adalah : " + book.getJudul());
        System.out.println("Tahun Terbit Buku anda adalah : " + book.getTahunTerbit());
        System.out.println("Stok Buku anda adalah : " + book.getStok());
        System.out.println();
        if (Stok > 0) {
            System.out.println("Buku anda tersedia! Silahkan ambil dikasir!");
        }
    }

    public static void main(String[] args) {
        BukuMain obj = new BukuMain();
        obj.inputCetak();
    }
}
