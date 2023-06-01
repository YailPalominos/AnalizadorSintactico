public class TablaSimbolos {

    public String simbolo;
    public String lexema;
    public int linea;
    public int posInicioSimbolo;
    public int posFinalSimbolo;

    public TablaSimbolos() {
    }

    public TablaSimbolos(String simbolo, String lexema, int linea, int posInicioSimbolo, int posFinalSimbolo) {
        this.simbolo = simbolo;
        this.lexema = lexema;
        this.linea = linea;
        this.posInicioSimbolo = posInicioSimbolo;
        this.posFinalSimbolo = posFinalSimbolo;
    }
}