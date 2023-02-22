/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 18587
 */
public class Main {
    public static void main(String[] args) {
        Medico med1 = new Medico("Bob", "Marley", "MRLBBO80A01L781G", "Ononcologia");
        Medico med2 = new Medico("Larry", "Dabney", "DBNLRY80A01L103F");

        Paziente paz1 = new Paziente("1Axe", "Igne", "37125", "XAEGNI80A01F205H");
        Paziente paz2 = new Paziente("2Axe", "Igne", "37125", "XAEGNI80A01F205H");
        Paziente paz3 = new Paziente("3Axe", "Igne", "37125", "XAEGNI80A01F205H");
        Paziente paz4 = new Paziente("4Axe", "Igne", "37125", "XAEGNI80A01F205H");
        Paziente paz5 = new Paziente("5Axe", "Igne", "37125", "XAEGNI80A01F205H");
        paz1.setMedicoFamigliaById(2L);
        paz4.setMedicoFamigliaById(2L);
        paz3.setMedicoFamigliaById(2L);
        paz2.setMedicoFamigliaById(1L);
        paz5.setMedicoFamigliaById(1L);
        System.out.println(paz1.toString());
        System.out.println(paz1.toStringPazienteMedico());
    }


}
