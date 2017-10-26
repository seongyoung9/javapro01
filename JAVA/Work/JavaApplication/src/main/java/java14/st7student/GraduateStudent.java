package java14.st7student;

public class GraduateStudent extends Student
{
    
    public String lab = "";
    
    
//---------------------------------------------------
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
//---------------------------------------------------
    @Override
    public String toString() {
        return "GraduateStudent [lab=" + lab + ", toString()="
                + super.toString() + "]";
    }
//-----------------------------------------------------
    public GraduateStudent() {
        
        super();
        System.out.println("dkssudgktpdy");
    }

    public GraduateStudent(int number, String name, String phone, String lab) {
        super(number, name, phone);
        this.lab = lab;
    }
    
    
    
}
