package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;

    public Gincana(String nome, Double premio) {
        this.nome = nome;
        this.premio = premio;
        this.qtdInscrito = 0;
        this.ativa = true;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPremio() {
        return this.premio;
    }

    public Integer getQtdInscrito() {
        return this.qtdInscrito;
    }

    public Boolean getAtiva() {
        return this.ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscrever(Integer qtd) {
        if(qtd != null && qtd > 0 && this.ativa) {
            this.qtdInscrito += qtd;
        }
    }

    public Integer remover(Integer qtd) {
        if(qtd != null && qtd <= this.qtdInscrito && this.ativa && qtd > 0) {
            this.qtdInscrito -= qtd;
            return qtd;
        }

        return null;
    }

    public Integer desativar() {
        if(this.ativa) {
            this.ativa = false;

            Integer qtdInscritaAnteriormente = this.qtdInscrito;
            this.qtdInscrito = 0;

            return qtdInscritaAnteriormente;
        }

        return null;
    }

    public void transferir(Gincana destino, Integer qtdATransferir) {
        if(this.ativa && destino != null && destino.ativa && qtdATransferir != null && qtdATransferir > 0 && qtdATransferir <= this.qtdInscrito) {
            this.qtdInscrito -= qtdATransferir;
            destino.qtdInscrito += qtdATransferir;
        }
    }

    public Boolean reajustarPremio(Double reajuste) {
        if(reajuste != null && reajuste > 0) {
            this.premio = premio + (premio * reajuste);
            return true;
        }

        return false;
    }

    // adicionando RA e nome    
}
