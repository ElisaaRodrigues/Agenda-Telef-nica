import org.junit.Test;
import poo.Email;

import static org.junit.Assert.assertEquals;

public class TesteEmail {

    @Test
    public void testaEmail(){
        Email e = new Email();

        assertEquals("email valido, deveria add", true, e.add("hotmail", "e@hotmail.com"));
        assertEquals("chave já existente, não deveria add", false, e.add("hotmail", "e@gmail.com"));
        assertEquals("email invalido, nao deveria add", false, e.add("gmail", "e.com"));
        assertEquals("email valido, deveria add", true, e.add("outlook", "e@outlook.com"));
        assertEquals("deveria remover chave existente", true, e.remover("outlook"));
        assertEquals("nao deveria remover, chava inesistente", false, e.remover("gmail"));
        assertEquals("deveria atualizar, chave correta e email correto", true, e.update("hotmail", "e@gmail.com"));
        assertEquals("nao deveria atualizar, chave inesistente", false, e.update("gmail", "e@gmail.com"));
        assertEquals("nao deveria add, chave invalida", false, e.add("", "e@gmail.com"));



    }
}
