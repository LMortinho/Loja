package br.com.alura.loja.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DadosPessoais {

    private String nome;
    private String cpf;
}
