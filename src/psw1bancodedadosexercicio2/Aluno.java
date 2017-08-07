/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psw1bancodedadosexercicio2;

/**
 *
 * @author Alexandre.Torres
 */
public class Aluno {
    private int id;
    private int RA;
    private String nome;

    public Aluno(int id, int ra, String nome){
        this(ra, nome);
        this.id = id;
    }
    
    public Aluno( int ra, String nome){        
        this.RA = ra;
        this.nome = nome;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the RA
     */
    public int getRA() {
        return RA;
    }

    /**
     * @param RA the RA to set
     */
    public void setRA(int RA) {
        this.RA = RA;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
