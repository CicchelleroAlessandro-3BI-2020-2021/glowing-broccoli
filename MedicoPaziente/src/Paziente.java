/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author 18587
 */
public class Paziente {
    private static Long count = 0L;
    private Long id;
    private String nome;
    private String cognome;
    private String domicilio;
    private String codiceFiscale;
    private Long idMedicoFamiglia;
    private static Map<Long, Paziente> listaPazienti = new HashMap<>();

    /**
     * @param nome
     * @param cognome
     * @param domicilio
     * @param codiceFiscale
     */
    public Paziente(String nome, String cognome, String domicilio, String codiceFiscale){
        this.id = ++count;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.domicilio = domicilio;
        this.idMedicoFamiglia = 0L;
        listaPazienti.put(this.id, this);
    }

    /**
     *
     */
    public Paziente(){
        this.id = ++id;
        this.nome = "Mary";
        this.cognome = "Sue";
        this.codiceFiscale = "SUEMRY80A01F839X";
        this.domicilio = "80100";
        this.idMedicoFamiglia = 0L;
        listaPazienti.put(this.id, this);
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
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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
     * @param id
     */
    public void setMedicoFamigliaById(Long id){
        this.idMedicoFamiglia = id;
        Medico.getMedicoById(id).addPaziente(this);
    }

    /**
     * @return
     */
    public Long getMedicoFamigliaById(){
        if(this.idMedicoFamiglia != null){
            return idMedicoFamiglia;
        }
        return -100L;
    }

    /**
     * @param id
     * @return
     */
public static Paziente getPazienteById(Long id){
        return listaPazienti.get(id);
    }

    /**
     * @param id
     */
    public static void removePaziente(long id){
        listaPazienti.remove(id);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return nome + " " + cognome + ", id=" + id + ", domicilio=" + domicilio + ", codiceFiscale=" + codiceFiscale;
    }

    /**
     * @return
     */
    public String toStringPazienteMedico(){
        return nome + " " + cognome + ", id=" + id + ", domicilio=" + domicilio + ", codiceFiscale=" + codiceFiscale + "\n" + "    " + "Medico:\n    " + Medico.getMedicoById(idMedicoFamiglia);


    }




}
