/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanpertama.pkg1;

/**
 *
 * @author Lenovo
 */
public class Mamalia extends Hewan {
    private String JenisGigi;
    private String Reproduksi;
    private String Menyusui;

    /**
     * @return the JenisGigi
     */
    public String getJenisGigi() {
        return JenisGigi;
    }

    /**
     * @param JenisGigi the JenisGigi to set
     */
    public void setJenisGigi(String JenisGigi) {
        this.JenisGigi = JenisGigi;
    }

    /**
     * @return the Reproduksi
     */
    public String getReproduksi() {
        return Reproduksi;
    }

    /**
     * @param Reproduksi the Reproduksi to set
     */
    public void setReproduksi(String Reproduksi) {
        this.Reproduksi = Reproduksi;
    }
    

    /**
     * @return the Menyusui
     */
    public String getMenyusui() {
        return Menyusui;
    }

    /**
     * @param Menyusui the Menyusui to set
     */
    public void setMenyusui(String Menyusui) {
        System.out.print("Mamalia adalah hewan menyusui");
        this.Menyusui = Menyusui;
    }
}