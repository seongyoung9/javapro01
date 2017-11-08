package 박성영;

public class Oper {

    private int firstNum = 0;
    private int secondNum = 0;
    
    
    public int getFirstNum() {
        return firstNum;
    }
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }
    public int getSecondNum() {
        return secondNum;
    }
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
    
    
    @Override
    public String toString() {
        return "Oper [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
    }
    
    
    public Oper() {
        super();
    }
    
    public Oper(int firstNum, int secondNum) {
        super();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    
    
    public int add(){
        return this.firstNum + this.secondNum;
    }
    
    public int minus(){
        return this.firstNum - this.secondNum;
    }
    
    public int mul(){
        return this.firstNum * this.secondNum;
    }
    
    public double div(){
        return (double)this.firstNum / (double)this.secondNum;
    }

    
}
