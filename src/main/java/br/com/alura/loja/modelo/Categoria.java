package br.com.alura.loja.modelo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
@Getter
@Setter
@NoArgsConstructor
public class Categoria{

    @EmbeddedId
    private CategoriaId id;

    public Categoria(String nome) {
        this.id = new CategoriaId(nome, "xpto");
    }

    public String getNome( ) {
        return this.id.getNome();
    }
}
