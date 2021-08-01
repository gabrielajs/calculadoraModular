package g2b.core;

import g2b.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //soma
        System.out.println(calculadora.sum(9.5,10));
        //divisao
        System.out.println(calculadora.div(8,4));
        //multiplicacao
        System.out.println(calculadora.mult(8,7));
        //subtracao
        System.out.println(calculadora.sub(150,5));
    }
}
