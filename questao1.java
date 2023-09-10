package Ficha08;

public class questao1 {
    public class ContaBancaria{
        private String Titular, numero;
        private double saldo;

        //Construtores
        public ContaBancaria(String titular, String numero){
            this.Titular = titular;
            this.numero = numero;
            double saldo = 0;
        }

        //Metodos


        public String getTitular() {
            return Titular;
        }

        public void setTitular(String titular) {
            Titular = titular;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }
}
