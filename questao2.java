package Ficha08;

import java.util.Scanner;

public class questao2 {
    public class Carro{
        private String marca, modelo;
        private double velocidade;
        private int ano;

        //construtores

        public Carro(String marca, String modelo, double velocidade, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = velocidade;
            this.ano = ano;
        }

        //metoodos

        public void acelerar(double velocidade){
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            if ((this.velocidade = velocidade + x) >= 0){
                this.velocidade = velocidade + x;
            } else{
                System.out.println("Velocidade não pode ser negativa!");
                x = in.nextDouble();
                this.velocidade = velocidade + x;
            }
        }
        public void desacelerar(double velocidade){
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            if ((this.velocidade = velocidade - x) >= 0){
                this.velocidade = velocidade - x;
            } else{
                System.out.println("Velocidade não pode ser negativa!");
                x = in.nextDouble();
                this.velocidade = velocidade - x;
            }
        }
    }
}
