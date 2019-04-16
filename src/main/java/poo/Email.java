package poo;

import java.util.HashMap;

public class Email {

    HashMap<String, String> tabEmail = new HashMap<>();
    String emailER;

    public Email(){
        emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    }
    public boolean add(String r, String e){
        if("".equals(r)){
            return false;
        }
        else if(tabEmail.containsKey(r)){
            return false;
        }
        else if(e.matches(emailER)){
            tabEmail.put(r, e);
            return true;
        }
        else return false;
    }
    public boolean remover(String r){
        if(tabEmail.containsKey(r)){
            tabEmail.remove(r);
            return true;
        }else return false;
    }
    public boolean update(String r, String e){
        if (tabEmail.containsKey(r)){
            tabEmail.put(r, e);
            return true;
        }
        else return false;
    }
    public String toString(){
        StringBuilder aux = new StringBuilder();
        tabEmail.forEach((chave, email)-> aux.append(chave+": "+email));
        return aux.toString();
    }

}
