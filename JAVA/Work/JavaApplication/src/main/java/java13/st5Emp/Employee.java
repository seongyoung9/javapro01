package java13.st5Emp;

public class Employee 
{
    
    private String name;
    private String addr;
    private int salary = 0;
    private int rnn = 0;
    
 //---------------------------------------------------------------\\
    //getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getRnn() {
        return rnn;
    }
    public void setRnn(int rnn) {
        this.rnn = rnn;
    }
  //---------------------------------------------------------------\\
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", addr=" + addr + ", salary="
                + salary + ", rnn=" + rnn + "]";
    }    
  
    //---------------------------------------------------------------\\
    
    public Employee() {
        super();
    }
    public Employee(String name, String addr, int salary, int rnn) {
        super();
        this.name = name;
        this.addr = addr;
        this.salary = salary;
        this.rnn = rnn;
    }
          
    
}
