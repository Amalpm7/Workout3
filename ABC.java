class Faculty {

    int facultyid;
    double salary;
    Faculty(int id){
        facultyid = id ;
    }
    void display(){
        System.out.println("!!!!!!!!!!!");
        System.out.println("Id : "+ facultyid);
        System.out.println("Salary : "+ salary);
    }

}
class FullTimeFaculty extends Faculty{

    double basic,allowance;
    FullTimeFaculty(int id,double basic,double allowance) {
        super(id);
        this.basic = basic;
        this.allowance = allowance;
    }
    void calcSalary(){
        this.salary = basic + allowance;
    }

}
class PartTimeFaculty extends Faculty{

    double hour,rate;
    PartTimeFaculty(int id,double hour,double rate) {
        super(id);
        this.hour = hour;
        this.rate = rate;
    }
    void calcSalary(){
        this.salary = hour * rate;
    }

}
public class ABC {

    public static void main(String[] args) {
        
        FullTimeFaculty f1 = new FullTimeFaculty(8,4500,255.4);
        FullTimeFaculty f2 = new FullTimeFaculty(7,4500,325.75);
        PartTimeFaculty p1 = new PartTimeFaculty(76,6.5,450);
        PartTimeFaculty p2 = new PartTimeFaculty(454, 15, 250);
        f1.calcSalary();
        f1.display();
        f2.calcSalary();
        f2.display();
        p1.calcSalary();
        p1.display();
        p2.calcSalary();
        p2.display();

    }

}