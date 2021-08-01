package g2b.utils;

import Interna.DivHelper;
import Interna.MulHelper;
import Interna.SubHelper;
import Interna.SumHelper;

public class Calculadora {
    private DivHelper div;
    private MulHelper mult;
    private SubHelper sub;
    private SumHelper sum;

    public Calculadora(){
        div = new DivHelper();
        mult = new MulHelper();
        sub = new SubHelper();
        sum = new SumHelper();
    }

    public double sum(double a, double b){
        return sum.execute(a,b);
    }
    public double sub(double a, double b){
        return sub.execute(a,b);
    }
    public double mult(double a, double b){
        return mult.execute(a,b);
    }
    public double div(double a, double b){
        return div.execute(a,b);
    }
}
