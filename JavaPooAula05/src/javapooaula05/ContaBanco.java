/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapooaula05;

/**
 *
 * @author vxvit
 */
public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

   

    //METODOS
    public void abrirConta() {

    }

    public void fecharConta() {

    }

    public void depositar() {

    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

    //Metodos especiais↓
    
    //CONSTRUTOR
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(!true);
    }

    //GETTERS
    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
    //SETTERS

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void status(){
        System.out.println(this.saldo);
        System.out.println(this.status);
    }
    
}
