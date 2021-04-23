package business.aiconsult.decisorium.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "venda", schema = "public")
public class VendaEntity  {

    @JsonIgnore
//    @Id
    private Long id;

    @JsonIgnore
//    @Column(name = "idempresa")
    private Integer idEmpresa;

//    @Column(name = "codigoProduto")
    private String codigoProduto;

//    @Column(name = "descricaoProduto")
    private String descricaoProduto;

//    @Column(name = "idNota")
    private Integer idNota;

//    @Column(name = "CFOP")
    private String CFOP;

//    @Column(name = "quantidade")
    private BigDecimal quantidade;

//    @Column(name = "valorItem")
    private BigDecimal valorItem;

//    @Column(name = "valorDesconto")
    private BigDecimal valorDesconto;

//    @Column(name = "valorTotalItem")
    private BigDecimal valorTotalItem;

//    @Column(name = "dataEmissao")
    private LocalDateTime dataEmissao;

//    @Column(name = "descricao")
    private String descricao;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public String getCFOP() {
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorItem() {
        return valorItem;
    }

    public void setValorItem(BigDecimal valorItem) {
        this.valorItem = valorItem;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(BigDecimal valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
