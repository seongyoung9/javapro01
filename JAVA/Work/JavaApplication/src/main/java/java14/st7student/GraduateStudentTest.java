package java14.st7student;

public class GraduateStudentTest 
{
    
    public static void main(String[] args)
    {
        
        GraduateStudent gra1 = new GraduateStudent();
        
        gra1.lab = "gra lab";
        gra1.name = "public name";
        gra1.phone = "protected phone";
        gra1.setNumber(22965348);
        
        System.out.println(gra1.toString());
        
        GraduateStudent gra2 = new GraduateStudent();
        
        gra2.setLab("set lab");
        gra2.setName("set name");
        gra2.setPhone("set phone");
        gra2.setNumber(121100);
        
        System.out.println(gra2.toString());
        
        GraduateStudent gra3 = new GraduateStudent(8520, "con name", "conphone", "con lab");
        
        System.out.println(gra3.toString());
    }
    
    
}
