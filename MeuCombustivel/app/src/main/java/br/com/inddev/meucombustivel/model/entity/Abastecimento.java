package br.com.inddev.meucombustivel.model.entity;

import java.security.Timestamp;

/**
 * Created by marca on 16/11/2017.
 */

public class Abastecimento {

    private Long id;
    private Long quantidadeLitros;
    private Double precoPorLitro;
    private Long quilometragemAtual;
    private String posto;
    private Timestamp dataHora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(Long quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public Double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(Double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public Long getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(Long quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }
}
