package Exercicios;

import java.util.HashSet;
import java.util.Set;

public class Lista2 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<Integer>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        System.out.println(conjunto);
        System.out.println("------------------------");
    }
}
//Quando usamos um conjunto ele não permite elementos duplicados, e no exemplo acima, os elementos duplicados são 5 e 8, e eles foram removidos