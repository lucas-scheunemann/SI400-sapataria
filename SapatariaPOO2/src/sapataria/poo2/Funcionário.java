package sapataria.poo2;

public class Funcionário extends Pessoa{
    //atributos
    private String data_nasc;
    private int hora_entrada;
    private int hora_saida;
    private String carteira_trabalho;
    //métodos
    
    
    //getters e setters
    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(int hora_saida) {
        this.hora_saida = hora_saida;
    }

    public String getCarteira_trabalho() {
        return carteira_trabalho;
    }

    public void setCarteira_trabalho(String carteira_trabalho) {
        this.carteira_trabalho = carteira_trabalho;
    }
    
        
    
}
