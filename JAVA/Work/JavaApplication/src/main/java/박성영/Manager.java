package 박성영;

public class Manager extends Employee{
    
    private int bonus = 0;

    
    
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    
    
    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", toString()=" + super.toString()
                + "]";
    }

    public Manager() {
        super();
    }

    public Manager(String name, String addr, int salary, String rnn,
            int bonus) {
        super(name, addr, salary, rnn);
        this.bonus = bonus;
    }
    
    
    
    
}
