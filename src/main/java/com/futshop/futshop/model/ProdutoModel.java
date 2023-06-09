package com.futshop.futshop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nomeProduto;

    @Column
    private String imagem;

    @Column(length = 400, nullable = false)
    private String descricao;

    @Column(length = 50, nullable = false)
    private String tipo;

    @Column(length = 3, nullable = false)
    private Integer promocao;

    @Column(length = 5, nullable = false)
    private Integer quantidadeEstoque;

    @Column(length = 5, nullable = false)
    private String tamanho;

    @Column(length = 10, nullable = false)
    private Double valorBase;

    @Column(length = 10, nullable = false)
    private Double valorComDesconto;

    @Column(length = 50, nullable = false)
    private String dataPostagem;
}
