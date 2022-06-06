package cl.instituto.java;

import javax.validation.constraints.Min;

public class Suma {
    
    @Min(1)
    private int num1;
    @Min(1)
    private int num2;
    
    public Suma(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2; 
    }
    
    public Suma(){
        
    }
    
    public int calculoSuma(){
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
