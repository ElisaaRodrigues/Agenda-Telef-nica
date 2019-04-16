package poo;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> contatos = new ArrayList<>();

    public Agenda(){

    }
    public void addPessoa(Pessoa p){
        if(!contatos.contains(p)) contatos.add(p);

    }
    public boolean removePessoa(String n, String s){
        Pessoa p;
        for(int i = 0; i < contatos.size(); i++){
            p = contatos.get(i);
            if(p!=null) {
                if (p.getNome() == n) {
                    if (p.getSobrenome() == s) {
                        contatos.remove(i);
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public boolean addTelefone(String r, String n, int pIndex) {
        Pessoa p;
        p = contatos.get(pIndex);
        if (p!=null){
            p.addTelefone(r, n);
            return true;
        }
        else return false;

    }
    public boolean addEmail(String r, String e, int pIndex){
        Pessoa p;
        p = contatos.get(pIndex);
        if (p!=null){
            p.addEmail(r, e);
            return true;
        }
        else return false;
    }
    public boolean removeTelefone(String r, int pIndex){
        Pessoa p;
        p = contatos.get(pIndex);
        if (p!=null){
            p.removeTelefone(r);
            return true;
        }
        else return false;
    }
    public boolean removeEmail(String r, int pIndex){
        Pessoa p;
        p = contatos.get(pIndex);
        if (p!=null){
            p.removeEmail(r);
            return true;
        }
        else return false;
    }
    public boolean updateTelefone(String r, String n, int pIndex){
        Pessoa p;
        p = contatos.get(pIndex);
        if (p != null){
            p.updateTelefone(r, n);
            return true;
        }
        else return false;
    }
    public boolean updateEmail(String r, String e, int pIndex){
        Pessoa p;
        p = contatos.get(pIndex);
        if (p!=null){
            p.updateEmail(r, e);
            return true;
        }
        else return false;
    }
    public String toString(){
        Pessoa p;
        StringBuilder retorno = new StringBuilder();
        contatos.forEach((item)-> retorno.append(item.toString()));
        return retorno.toString();
    }
}
