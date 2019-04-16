package poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String n, String s, LocalDate dn){
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dn;
        this.telefones= new Telefone();
        this.emails = new Email();

    }
    public boolean addTelefone(String r, String n){

        if(telefones.add(r,n)){
            return true;
        }
        else return false;

    }
    public boolean addEmail(String r, String e){
        if(emails.add(r, e)){
        return true;
        }
        else return false;
    }
    public boolean removeTelefone(String r){
        if(telefones.remover(r)) {
            return true;
        }
        else return false;
    }
    public boolean removeEmail(String r){
        if (emails.remover(r)) {
            return true;
        }else return false;
    }
    public boolean updateTelefone(String r, String n){
        if (telefones.update(r, n)) {
            return true;
        }else return false;
    }
    public boolean updateEmail(String r, String e){
        if(emails.update(r, e)) {
            return true;
        }else return false;
    }
    public String toString(){
        return "Nome: "+ nome+" "+sobrenome+"\n Data Nascimento: "+dataNasc+"\n"+ telefones.toString()+emails.toString();
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }

}
