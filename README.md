# Konsep Pemrograman Berorientasi Objek - Pertemuan Pertama

## 🗂️ Table Of Contents
- [INHERITANCE](https://github.com/adeliafhr/Tugas-Pertemuan-Pertama/blob/main/MakhlukHidup.java)
- [EXTENDS](https://github.com/adeliafhr/Tugas-Pertemuan-Pertama/blob/main/Hewan.java)
- [METODE SET](https://github.com/adeliafhr/Tugas-Pertemuan-Pertama/blob/main/Hewan.java)
- [METODE GET](https://github.com/adeliafhr/Tugas-Pertemuan-Pertama/blob/main/Hewan.java)
---

## 🔗 Inheritance (Pewarisan)
Inheritance (pewarisan) adalah konsep dalam pemrograman berorientasi objek (OOP) di mana sebuah kelas baru dapat mewarisi sifat-sifat dan perilaku dari kelas yang sudah ada. 
Class yang akan diturunkan bisa disebut sebagai class induk (parent class). Sedangkan class yang menerima penurunan bisa disebut sebagai class anak (child class).
Inheritance memungkinkan kelas anak untuk mengakses dan menggunakan atribut serta metode dari kelas induk.
### ➡️ Extends
Menggunakan kata kunci extends dalam definisi kelas menunjukkan bahwa kelas tersebut adalah turunan dari kelas lain. Kelas anak dapat mengakses metode dan atribut dari kelas induk. Untuk menurunkan sebuah class di bahasa pemrograman Java, tulis nama kelas anak, lalu perintah *Extends* dan baru tulis nama kelas induk. 
### 💻 Berikut contoh source code penggunaan inheritance dan extends
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
---
## ⚙️ Metode Setter dan Getter
- Setter -> Metode yang digunakan untuk mengatur nilai dari atribut privat. Biasanya nama method ini dimulai dengan kata *set*
- Getter -> Metode yang digunakan untuk mengambil nilai dari atribut privat. Biasanya nama method ini dimulai dengan kata *get*

### 💻 Berikut contoh source code penggunan setter dan getter
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

---
##  📝 Kesimpulan
- Inheritance menjadikan kelas baru mewarisi sifat dari kelas induk melalui kata kunci *extends* 
- Metode *set* dan *get* berguna untuk mengatur dan mengambil nilai atribut dan berfungsi untuk menjaga enkapsulasi data
