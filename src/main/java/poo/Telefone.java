package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    HashMap<String, String> tabTelefone = new HashMap<>();
    MaskFormatter mask;

    public Telefone(){

        try {
            mask = new MaskFormatter("(##) #####-####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');

    }
    public boolean add(String r, String n){

        int aux = n.length();
        if("".equals(r)){
            return false;
        }
        else if(tabTelefone.containsKey(r)){
            return false;
        }
        else if((aux >= 10) && (aux <= 11)){

            try {
                n = mask.valueToString(n);
            } catch (ParseException e) {
                //e.printStackTrace();
                return false;
            }
            tabTelefone.put(r,n);
            return true;
        }
        else return false;
    }
    public boolean remover(String r){
        if(tabTelefone.containsKey(r)){
            tabTelefone.remove(r);
            return true;
        }
        else return false;
    }
    public boolean update(String r, String n){
        if(tabTelefone.containsKey(r)){
            tabTelefone.put(r, n);
            return true;
        }
        else return false;
    }
    public String toString(){

        StringBuilder aux = new StringBuilder();
        tabTelefone.forEach((chave,valor)-> aux.append(chave+":"+valor+"\n"));
        return aux.toString();

    }
}
