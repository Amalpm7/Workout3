package p1;

public class Students {
    
    int semster;
    int rollNo;
    public Students(int sem,int roll){
        semster = sem;
        rollNo = roll;
    }
    public void getStudent(){
        System.out.println("In package 1");
        System.out.println("I am a student and my semster is "+ semster +" and my roll no is "+rollNo);
    }
}
