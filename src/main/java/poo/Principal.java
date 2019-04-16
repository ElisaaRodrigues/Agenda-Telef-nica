package poo;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa stefanie = new Pessoa("Stefanie", "Martins", LocalDate.of(1997,7,14));
        stefanie.addTelefone("celular", "48996948370");
        stefanie.addEmail("aluno.ifsc", "stefanie.m@aluno.ifsc.edu.br");
        agenda.addPessoa(stefanie);
        System.out.println(agenda.toString());

        agenda.removePessoa("Stefanie", "Martins");
        System.out.println(agenda.toString() + "agenda vazia");


    }
}
