package sapataria.poo2;

public class Mercadoria {
    //atributos
    private String código_mercadoria;
    private String marca;
    private String modelo;
    private String categoria;
    private int tamanho;
    private String cor;
    private float preço_venda;
    //métodos
    public void cadastroMercadoria(){
        
    }
    //getters e setters
    public String getCódigo_mercadoria() {
        return código_mercadoria;
    }

    public void setCódigo_mercadoria(String código_mercadoria) {
        this.código_mercadoria = código_mercadoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreço_venda() {
        return preço_venda;
    }

    public void setPreço_venda(float preço_venda) {
        this.preço_venda = preço_venda;
    }
    
    
}
