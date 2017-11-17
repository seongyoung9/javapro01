package java14.st6manager;

public class Manager extends Employee
{
    
    private int bonus = 0;

    //------------------------------------------------------------------
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
//-------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", toString()=" + super.toString()
                + "]";
    }

    public Manager() {
        super();
    }
    
    
    public void test()
    {
        
        String info = "name : " + super.getName();
        info = info + ", address : " + super.getAddress();
        info = info + ", salary : " + super.salary;
        info = info + ", rrn : " + super.getRrn();
        System.out.println(info);
        
    }
        
}
