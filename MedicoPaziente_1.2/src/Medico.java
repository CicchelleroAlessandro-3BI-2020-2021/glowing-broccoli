/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author 18587
 */

public class Medico {
    private static Long count = 0L;
    private Long id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String specializzazioneAggiuntiva;
    private static Map<Long, Medico> listaMedici = new HashMap<>();
    //private ArrayList<Long> listaIdPazienti = new ArrayList<>();


    /**
     * @param nome
     * @param cognome
     * @param codiceFiscale
     * @param specializzazioneAggiuntiva
     */
    public Medico(String nome, String cognome, String codiceFiscale, String specializzazioneAggiuntiva){
        this.id = ++count;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.specializzazioneAggiuntiva = specializzazioneAggiuntiva;
        listaMedici.put(this.id, this);
    }

    /**
     * @param nome
     * @param cognome
     * @param codiceFiscale
     */
    public Medico(String nome, String cognome, String codiceFiscale){
        this.id = ++count;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.specializzazioneAggiuntiva = "N/A";
        listaMedici.put(this.id, this);
    }

    /**
     *
     */
    public Medico(){
        this.id = ++id;
        this.nome = "Jhon";
        this.cognome = "Doe";
        this.codiceFiscale = "DOEJHN80A01L781V";
        this.specializzazioneAggiuntiva = "N/A";
        listaMedici.put(id, this);
    }

    /**
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * @param codiceFiscale
     */
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    /**
     * @return
     */
    public String getSpecializzazioneAggiuntiva() {
        return specializzazioneAggiuntiva;
    }

    /**
     * @param specializzazioneAggiuntiva
     */
    public void setSpecializzazioneAggiuntiva(String specializzazioneAggiuntiva) {
        this.specializzazioneAggiuntiva = specializzazioneAggiuntiva;
    }
    /*
        /**
         * @param p
         *-/
    public void addPaziente(Paziente p){

        listaIdPazienti.add(p.getId());
    }

    /**
     * @param p
     *-/
    public void removePaziente(Paziente p){
        listaIdPazienti.remove(p);
    }

    /**
     * @param id
     * @return
     *-/*/
    public static Medico getMedicoById(long id){
        return listaMedici.get(id);
    }

    /**
     * @param id
     */
    public static void removeMedico(long id){
        listaMedici.remove(id);
    }

    /**
     * @return
     */
    public List<Paziente> getPazienti(){
        List<Paziente> l = new ArrayList<>();
        for ( Paziente i : Paziente.getListaPazienti().values() ){
            if(i.getMedicoFamigliaById() == this.id){
                l.add(i);
            }
        }

        return l;
    }

    /**
     *
     * @return
     */
    public String toStringPazienti(){

        String fin = "";
        for (Paziente i : this.getPazienti()) {
            fin +="\n" + "    " + i.toString();
        }
        return fin + "\n";
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return nome + " " + cognome + ", id=" + id + ", codiceFiscale=" + codiceFiscale + ", specializzazioneAggiuntiva=" + specializzazioneAggiuntiva;
    }

    /**
     * @return
     */
   /* public String toStringMedicoPazienti(){
        String fin = "";
        //for (Long i = 1L; i <= this.listaIdPazienti.size() ; i++) {
            for (Long i : this.listaIdPazienti) {
            fin += "    " + Paziente.getPazienteById(i).toString() + "\n";
        }
        return nome + " " + cognome + ", id=" + id + ", codiceFiscale=" + codiceFiscale + ", specializzazioneAggiuntiva=" + specializzazioneAggiuntiva + "\n    Pazienti:\n" +  fin;
    }*/

}