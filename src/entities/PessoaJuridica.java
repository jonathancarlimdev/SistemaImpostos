package entities;

public class PessoaJuridica extends Contribuinte{

    private Integer numDeFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numDeFuncionarios) {
        super(nome, rendaAnual);
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public Double pagarImposto(){
        Double totalImposto = 0.0;
        if(numDeFuncionarios > 10){
            totalImposto = (double)14/100 * rendaAnual;
        } else{
            totalImposto = (double)16/100 * rendaAnual;
        }
        return totalImposto;
    }
}
