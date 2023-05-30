package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //HashMap para objetos e suas cores
        HashMap<String, List<String>> objetosCores = new HashMap<>();

        List<String> coresBola = new ArrayList<>();
        coresBola.add("azul");
        objetosCores.put("bola", coresBola);

        List<String> coresBoneca = new ArrayList<>();
        coresBoneca.add("amarela");
        objetosCores.put("boneca", coresBoneca);

        List<String> coresDado = new ArrayList<>();
        coresDado.add("rosa");
        objetosCores.put("dado", coresDado);

        //Imprime todas as chaves e seus valores associados

        for (String objeto : objetosCores.keySet()) {
            System.out.println(objeto + " -> " + objetosCores.get(objeto));
            System.out.println("-----------------------------------------------------");
        }

    }
}
