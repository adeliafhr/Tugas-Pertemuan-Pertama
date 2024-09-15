# INHERITANCE (PEWARISAN)
# Apa itu inheritance ? 
Inheritance (pewarisan) adalah konsep dalam pemrograman berorientasi objek (OOP) di mana sebuah kelas baru dapat mewarisi sifat-sifat dan perilaku dari kelas yang sudah ada. 
Class yang akan diturunkan bisa disebut sebagai class induk (parent class), super class, atau base class. Sedangkan class yang menerima penurunan bisa disebut sebagai class anak (child class), sub class, derived class atau heir class.
Inheritance memungkinkan kelas anak untuk mengakses dan menggunakan atribut serta metode dari kelas induk.
# Extends
Menggunakan kata kunci extends dalam definisi kelas menunjukkan bahwa kelas tersebut adalah turunan dari kelas lain. Kelas anak dapat mengakses metode dan atribut publik
serta protected dari kelas induk. Untuk menurunkan sebuah class di bahasa pemrograman Java, tulis nama kelas anak, lalu perintah *extends* dan baru tulis nama kelas induk. 
# Berikut contoh source code penggunaan inheritance dan extends
<pre> 
  //ini adalah kelas induk
  public class MakhlukHidup {
    public void bernafas(){
        System.out.println("Saya bernafas ...");
    }
  //ini adalah kelas anak
  public class Hewan extends MakhlukHidup {
     private int JumlahKaki;
     private String CaraBergerak;
     private String Makanan;
  }
  //ini juga kelas anak
  public class Aves extends Hewan {
    private int JumlahSayap;
    private String BentukTubuh;
  }
</pre>
- MakhlukHidup adalah kelas induk yang berfungsi sebagai dasar untuk kelas-kelas lainnya.
Kelas ini memiliki satu metode, yaitu bernafas(), yang mencetak pesan "Saya bernafas ..." ketika dipanggil. Ini menunjukkan bahwa semua makhluk hidup memiliki kemampuan untuk bernapas.
- Hewan adalah kelas anak yang mewarisi sifat dari kelas MakhlukHidup. Dengan kata kunci extends, kelas Hewan dapat menggunakan metode yang ada di kelas MakhlukHidup, termasuk bernafas().
Kelas hewan memiliki tiga atribut yaitu jumlahKaki, caraBergerak, makanan.
- Aves adalah kelas anak yang mewarisi dari kelas Hewan. Ini berarti Aves juga mewarisi semua sifat dan metode dari MakhlukHidup. Aves memiliki dua atribut yaitu jumlahSayap dan bentukTubuh.

# Metode Setter dan Getter
- Setter -> Metode yang digunakan untuk mengatur nilai dari atribut privat.
- Getter -> Metode yang digunakan untuk mengambil nilai dari atribut privat.
# Manfaat penggunaan setter dan getter
1. Enkapsulasi: Menjaga atribut tetap privat dan hanya dapat diakses melalui metode yang ditentukan.
2. Validasi: Memungkinkan untuk melakukan validasi pada nilai yang diatur melalui setter.
3. Fleksibilitas: Memudahkan perubahan implementasi tanpa mempengaruhi kode yang menggunakan kelas tersebut.
# Berikut contoh source code penggunan setter dan getter
<pre>
  public class Hewan extends MakhlukHidup {
     private int JumlahKaki;
     private String CaraBergerak;
     private String Makanan;
//metode getter untuk JumlahKaki
    public int getJumlahKaki() {
        return JumlahKaki;
    }
//metode setter untuk jumlahKaki 
    public void setJumlahKaki(int JumlahKaki) {
        this.JumlahKaki = JumlahKaki;
    }
//metode getter untuk caraBergerak
    public String getCaraBergerak() {
        return CaraBergerak;
    }
//metode setter untuk caraBergerak
    public void setCaraBergerak(String CaraBergerak) {
        this.CaraBergerak = CaraBergerak;
    }
//metode getter untuk makanan
    public String getMakanan() {
        return Makanan;
    }
//metode setter untuk makanan
    public void setMakanan(String Makanan) {
        this.Makanan = Makanan;
    }
}
</pre>
Metode getter untuk jumlahKaki digunakan untuk mengambil nilai dari atribut jumlahKaki. Metode setter untuk jumlahKaki digunakan untuk mengatur nilai dari atribut jumlahKaki.<br>
Metode getter untuk caraBergerak digunakan untuk mengambil nilai dari atribut caraBergerak. Metode setter untuk caraBergerak digunakan untuk mengatur nilai dari atribut caraBergerak.<br>
Metode getter untuk makanan digunakan untuk mengambil nilai dari atribut makanan. Metode setter untuk makanan digunakan untuk mengatur nilai dari atribut makanan.
<pre>
  //kelas utama untuk menjalankan program
  public static void main(String[] args) {
  Aves BurungDara = new Aves();
  //mengatur atribut menggunakan setter
  BurungDara.setJumlahKaki(2);
  BurungDara.setCaraBergerak("berjalan dan terbang");
  BurungDara.setMakanan("karnivora");
  //mengambil dan menampilkan nilai atribut menggunakan getter
  System.out.println("Jumlah kaki burung dara ada " + BurungDara.getJumlahKaki());
  System.out.println("Cara bergerak burung dara dengan "+ BurungDara.getCaraBergerak());
  System.out.println("Makanan burung dara "+ BurungDara.getMakanan());
</pre>
Di sini, kita membuat objek baru bernama BurungDara dari kelas Aves. Ini berarti BurungDara adalah burung yang memiliki semua sifat dari kelas Aves dan kelas induknya, yaitu Hewan.
<br><br>
Pada file github ini terjadinya pewarisan dari kelas induk yaitu kelas MakhlukHidup, lalu kelas induk menurunkan pada kelas Hewan dan Tumbuhan. Pada kelas Hewan juga memiliki
turunan yaitu kelas Aves, Amfibi, Reptil, Pisces, Mamalia dan Kelas Tumbuhan memiliki turunan yaitu kelas Monokotil dan Dikotil. Oleh karena itu, semua kelas turunan akan mewarisi atribut 
dari kelas induk / super class yaitu dari MakhlukHidup lalu ke kelas Hewan atau Tumbuhan. Namun, pada penjelasan kali ini hanya contoh source code dari kelas Aves yang merupakan turunan 
dari kelas Hewan dan Hewan yang merupakan turunan dari kelas MakhlukHidup, tapi pada dasarnya semua kelas memiliki source code yang sama hanya saja beda atribut yang dimiliki oleh setiap kelas.
