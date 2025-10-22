package model;

public class Comissionado extends Empregado{

    private float totalVendas;
    private float porcentagemComissao;

    public Comissionado(String cpf, String nome, float totalVendas,
                        float porcentagemComissao) {
        super(cpf, nome);
        this.totalVendas = totalVendas;
        this.porcentagemComissao = porcentagemComissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(float porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public float calcularPagamento(){
        return (totalVendas*porcentagemComissao)/100;
    }

}
