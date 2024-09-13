package com.softelse.src.heranca.test;

import com.softelse.src.heranca.domain.Endereco;
import com.softelse.src.heranca.domain.Funcionario;
import com.softelse.src.heranca.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-607");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("asdfaalskjflaks");
        pessoa.setCpf("12342344");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("lkasdfjkasdf");
        funcionario.setCpf("12323");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1250.00);

        funcionario.imprime();


    }
}
