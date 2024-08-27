/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanpertama.pkg1;

/**
 *
 * @author Lenovo
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here;
        Hewan kukuruyuk = new Hewan();
        System.out.println("Nama saya kukuruyuk");
        kukuruyuk.setJumlahKaki(2);
        kukuruyuk.setCaraBergerak("berjalan");
        kukuruyuk.bernafas();
        kukuruyuk.tumbuh();
        System.out.println("Jumlah kaki saya ada " + kukuruyuk.getJumlahKaki());
        System.out.println("kukuruyuk bergerak dengan cara "+ kukuruyuk.getCaraBergerak());
        
       Tumbuhan Stroberi = new Tumbuhan();
       System.out.println("");
       System.out.println("Nama saya stroberi");
       Stroberi.setWarnaDaun("Hijau");
       Stroberi.setArahDaun("Barat");
       Stroberi.bernafas();
       Stroberi.tumbuh();
       System.out.println("Arah daun di sore hari ke "+ Stroberi.getArahDaun());
       System.out.println("Warna daun " + Stroberi.getWarnaDaun());
        
        System.out.println("");
        Aves BurungDara = new Aves();
        BurungDara.setJumlahSayap(2);
        BurungDara.setJumlahKaki(2);
        BurungDara.setCaraBergerak("berjalan dan terbang");
        BurungDara.setBentukTubuh("gemuk dan bulat");
        BurungDara.setMakanan("karnivora");
        System.out.println("Jenis aves ini adalah Burung Dara");
        BurungDara.bernafas();
        BurungDara.tumbuh();
        BurungDara.berkembangbiak();
        System.out.println("Jumlah kaki burung dara ada " + BurungDara.getJumlahKaki());
        System.out.println("Cara bergerak burung dara dengan "+ BurungDara.getCaraBergerak());
        System.out.println("Makanan burung dara "+ BurungDara.getMakanan());
        System.out.println("Jumlah sayap burung dara ada "+ BurungDara.getJumlahSayap());
        System.out.println("Bentuk tubuh burung dara adalah "+ BurungDara.getBentukTubuh());   
        
        System.out.println("");
        Amfibi Katak = new Amfibi();
        Katak.setJumlahKaki(2);
        Katak.setCaraBergerak("melompat");
        Katak.setMakanan("omnivora");
        Katak.setJenisKulit("berlendir");
        Katak.setBernafas("kombinasi antara paru - paru, kulit, mulut");
        Katak.setHabitat("di dua alam");
        System.out.println("Jenis amfibi ini adalah Katak");
        Katak.bernafas();
        Katak.tumbuh();
        Katak.berkembangbiak();
        System.out.println("Jumlah kaki katak ada "+ Katak.getJumlahKaki());
        System.out.println("Cara bergerak katak dengan "+ Katak.getCaraBergerak());
        System.out.println("Makanan katak "+ Katak.getMakanan());
        System.out.println("Jenis kulit katak adalah "+ Katak.getJenisKulit());
        System.out.println("Katak bernafas dengan "+ Katak.getBernafas());
        System.out.println("Habitat "+ Katak.getHabitat());
        
        System.out.println("");
        Reptil Buaya = new Reptil();
        Buaya.setJumlahKaki(4);
        Buaya.setCaraBergerak("berjalan");
        Buaya.setMakanan("karnivora");
        Buaya.setReproduksi("bertelur");
        Buaya.setBerkulit("sisik tebal dan keras");
        Buaya.setBentukKaki("pendek, lebar, berotot");
        System.out.println("Jenis reptil ini adalah Buaya");
        Buaya.bernafas();
        Buaya.tumbuh();
        Buaya.berkembangbiak();
        System.out.println("Jumlah kaki buaya ada "+ Buaya.getJumlahKaki());
        System.out.println("Cara bergerak buaya dengan "+ Buaya.getCaraBergerak());
        System.out.println("Makanan buaya adalah "+ Buaya.getMakanan());
        System.out.println("Buaya bereproduksi dengan cara "+ Buaya.getReproduksi());
        System.out.println("Buaya berkulit "+ Buaya.getBerkulit());
        System.out.println("Bentuk kaki buaya adalah "+ Buaya.getBentukKaki());
        
        System.out.println("");
        Pisces IkanPari = new Pisces();
        IkanPari.setCaraBergerak("berenang");
        IkanPari.setMakanan("karnivora");
        IkanPari.setJumlahSirip(5);
        IkanPari.setBentukSirip("besar dan melebar");
        System.out.println("Jenis pisces ini adalah Ikan Pari");
        IkanPari.bernafas();
        IkanPari.tumbuh();
        IkanPari.berkembangbiak();
        System.out.println("Cara bergerak ikan pari dengan "+ IkanPari.getCaraBergerak());
        System.out.println("Jenis makanan ikan pari adalah "+ IkanPari.getMakanan());
        System.out.println("Jumlah sirip ikan pari yaitu "+ IkanPari.getJumlahSirip());
        System.out.println("Ikan pari memiliki bentuk sirip yang "+ IkanPari.getBentukSirip());
        
        System.out.println("");
        Mamalia Sapi = new Mamalia();
        Sapi.setJumlahKaki(4);
        Sapi.setCaraBergerak("berjalan");
        Sapi.setMakanan("herbivora");
        Sapi.setReproduksi("beranak");
        System.out.println("Jenis mamalia ini adalah sapi");
        Sapi.bernafas();
        Sapi.tumbuh();
        Sapi.berkembangbiak();
        System.out.println("Sapi memiliki jumlah kaki "+ Sapi.getJumlahKaki());
        System.out.println("Cara bergerak sapi dengan "+ Sapi.getCaraBergerak());
        System.out.println("Jenis makanan sapi adalah "+ Sapi.getMakanan());
        System.out.println("Sapi bereproduksi dengan cara "+ Sapi.getReproduksi());
        Sapi.setMenyusui("");
        System.out.println(Sapi.getMenyusui());
        
        System.out.println("");
        Dikotil Tomat = new Dikotil();
        Tomat.setArahDaun("cenderung mengarah ke atas");
        Tomat.setWarnaDaun("hijau");
        Tomat.setJenisAkar("tunggang");
        Tomat.setJenisBiji("berbiji dua");
        Tomat.setBentukBatang("silindris dan ditumbuhi trikoma");
        Tomat.setBentukBiji("bulat");
        Tomat.setTulangDaun("menyirip");
        System.out.println("Jenis dikotil ini adalah tomat");
        Tomat.bernafas();
        Tomat.tumbuh();
        Tomat.berkembangbiak();
        System.out.println("Arah daun tomat saat pagi "+ Tomat.getArahDaun());
        System.out.println("Warna daun tomat "+ Tomat.getWarnaDaun());
        System.out.println("Jenis akar tomat yaitu berakar "+ Tomat.getJenisAkar());
        System.out.println("Tomat termasuk kedalam tumbuhan "+ Tomat.getJenisBiji());
        System.out.println("Batang tomat berbentuk "+ Tomat.getBentukBatang());
        System.out.println("Biji tomat berbentuk "+ Tomat.getBentukBiji());
        System.out.println("Tomat memiliki tulang daun yang berbentuk "+ Tomat.getTulangDaun());
        
        System.out.println("");
        Monokotil Kelapa = new Monokotil();
        Kelapa.setArahDaun("melengkung");
        Kelapa.setWarnaDaun("hijau tua");
        Kelapa.setJenisAkar("serabut");
        Kelapa.setJenisBiji("berbiji tunggal");
        Kelapa.setBentukBuah("biji tunggal besar dan berair");
        Kelapa.setSistemPerakaran("kuat dan mampu beradaptasi");
        Kelapa.setHabitat("pesisir pantai");
        System.out.println("Jenis mokotil ini adalah kelapa");
        Kelapa.bernafas();
        Kelapa.tumbuh();
        Kelapa.berkembangbiak();
        System.out.println("Arah daun kelapa saat siang hari "+ Kelapa.getArahDaun());
        System.out.println("Warna daun kelapa yaitu "+ Kelapa.getWarnaDaun());
        System.out.println("Kelapa memiliki jenis akar "+ Kelapa.getJenisAkar());
        System.out.println("Kelapa termasuk kedalam tumbuhan "+ Kelapa.getJenisBiji());
        System.out.println("Buah kelapa berbentuk "+ Kelapa.getBentukBuah());
        System.out.println("kelapa memiliki sistem perakaran yang "+ Kelapa.getSistemPerakaran());
        System.out.println("Kelapa biasa di temui di "+ Kelapa.getHabitat());
        
    }
    
}
