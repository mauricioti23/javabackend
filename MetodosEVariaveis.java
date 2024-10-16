package programaSoma;

public class MetodosEVariaveis {
	
//Entrada das vari�veis.
	
    private int primeiroNumero;
    private int segundoNumero;
    private int terceiroNumero;

    public void setNumeros(int primeiro, int segundo, int terceiro) {
        this.primeiroNumero = primeiro;
        this.segundoNumero = segundo;
        this.terceiroNumero = terceiro;
    }
//M�todo da soma.
    
    public int soma() {
        return primeiroNumero + segundoNumero + terceiroNumero;
    }
//M�todo da m�dia.
    
    public double media() {
        return soma() / 3.0;
    }
}
