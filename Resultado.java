public class Resultado {

        public Resultado() {
        }

        public void ImprimirTblaTokens(TablaSimbolos[] oSimbolos) {
                System.out.println();
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%70s", "Tabla de Tokens");
                System.out.println();
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%25s %25s %25s %10s %10s", "Token", "Lexema", "Linea", "Inicio", "Final");
                System.out.println();
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------");

                for (int x = 0; x < oSimbolos.length; x++) {
                        var Simbolo = oSimbolos[x];

                        System.out.format("%25s %25s %25s %10s %10s", Simbolo.simbolo, Simbolo.lexema, Simbolo.linea,
                                        Simbolo.posInicioSimbolo, Simbolo.posFinalSimbolo);
                        System.out.println();

                }
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------");

        }

}
