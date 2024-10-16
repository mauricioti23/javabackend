package programaSoma;

public class MetodosEVariaveis {
	
//Entrada das variáveis.
	
    private int primeiroNumero;
    private int segundoNumero;
    private int terceiroNumero;

    public void setNumeros(int primeiro, int segundo, int terceiro) {
        this.primeiroNumero = primeiro;
        this.segundoNumero = segundo;
        this.terceiroNumero = terceiro;
    }
//Método da soma.
    
    public int soma() {
        return primeiroNumero + segundoNumero + terceiroNumero;
    }
//Método da média.
    
    public double media() {
        return soma() / 3.0;
    }
}
