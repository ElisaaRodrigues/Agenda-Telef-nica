import org.junit.Test;
import poo.Telefone;

import static junit.framework.TestCase.assertEquals;

public class TesteTelefone {

    @Test
    public void testaTelefone(){
        Telefone cel = new Telefone();

        assertEquals("numero valido, deveria add", true, cel.add("celular", "48996707463"));
        assertEquals("chave existente, nao deveria add", false, cel.add("celular", "48984995787"));
        assertEquals("numero valido, deveria add", true, cel.add("celular2", "48984995787"));
        assertEquals("chave valida, deveria remover", true, cel.remover("celular"));
        assertEquals("chave invalida, nao deveria remover", false, cel.remover("fixo"));
        assertEquals("numero invalido, nao deveria add", false, cel.add("fixo", ""));
        assertEquals("chave invalida, nao deveria remover", false, cel.add("", "48999999999"));
        assertEquals("numero valido e chave valida, deveria atualizar", true, cel.update("celular2", "48996707463"));
        assertEquals("chave invalida, nao deveria atualizar", false, cel.update("celular3", "486652354"));


    }


























































}