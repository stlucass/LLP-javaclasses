package exercicio2;

public class Main {
    public static void main(String[] args) {

        CorpoCeleste corpoceleste1 = new CorpoCeleste("Terra", "Esquerda da Lua", "3000 km/h");
        corpoceleste1.entrar_em_orbita();

        Lua lua1 = new Lua("Minguante", "Forte", "Fraca");
        lua1.exercer_influencia();

        Pele pele1 = new Pele("Sensivel", 28.5, "Aspera");
        pele1.sentir_toque();
    }
}