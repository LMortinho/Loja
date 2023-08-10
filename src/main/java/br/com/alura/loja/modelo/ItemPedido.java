package br.com.alura.loja.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedido")
@Getter
@Setter
@NoArgsConstructor
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;
    private int quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produtoId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedidoId;

    public ItemPedido(int quantidade, Pedido pedidoId, Produto produtoId) {
        this.quantidade = quantidade;
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.precoUnitario = produtoId.getPreco();
    }

    public BigDecimal getValor() {
        return precoUnitario.multiply(new BigDecimal(quantidade));
    }
}
