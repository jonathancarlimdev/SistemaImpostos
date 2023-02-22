package entities;

public class PessoaFisica extends Contribuinte{

    private Double gastosComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double pagarImposto(){
        Double totalImposto = 0.0;
        if(rendaAnual < 20000){
            totalImposto = (double)15/100 * rendaAnual - (double)50/100 * gastosComSaude;
        } else if(rendaAnual > 20000){
            totalImposto = (double)25/100 * rendaAnual - (double)50/100 * gastosComSaude;
        }
        return totalImposto;
    }
}
