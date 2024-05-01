package com.Emp.Student;

//import com.Emp.Student.Studentinterface.Studentinfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Studentpojo st=new Studentpojo("194N1A04J4","MANOHAR VANTERU","APPLICATION DEVELOPER",1211,"17/05/2023");
//          System.out.println("**********************************Student details**********************************************");
//          System.out.println(st.getRollno()+" "+st.getName()+" "+st.getCource()+" "+st.getBatch()+" "+st.getDoj());
    	
//    	Studentinfo si=new Studentinfo("194N1A04J4","MANOHAR VANTERU",1211,"APPLICATION DEVELOPER","17/05/2023");
//    	System.out.println (si.getName());
    	
    	
    	Marks m=new Marks(88,98,78,89,99,100);
    	Student s=new Student("manohar",10,m);
    	School sc=new School("SSV Em high School",s);
    	sc.print();
    	
    }
}
