package polymorphism;


import java.util.*;
class Calories
{
  public static void main(String args[])
  {
   Scanner s=new Scanner (System.in);
    System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter\nEnter the choice");
    int n=s.nextInt();
    fuji a=new fuji();
    switch (n)
    {
    
    case 1:
    System.out.println("Enter the number of Slice of bread");
    int brd=s.nextInt();
    
    a.cal(brd);
    break;
    case 2:
    	System.out.println("Enter the number of Slice of bread");
        int brd1=s.nextInt();
        System.out.println("Enter the number of teaspoon of Jam");
        int jam1=s.nextInt();
       
       
        a.cal(brd1,jam1);
        break;
    case 3:
    	System.out.println("Enter the number of Slice of bread");
        int brd2=s.nextInt();
        System.out.println("Enter the number of teaspoon of Jam");
        int jam2=s.nextInt();
        System.out.println("Enter the number of teaspoon of Butter");
        int butter=s.nextInt();
        
      
        a.cal(brd2,jam2,butter);
        break;
    }
  }
}
class fuji
{
	double bk=0,jk=0,buk=0;
	double b=0,j=0,bu=0;

  void cal(int brd)
  {
   b=brd*74;
    bk=b*4.1868;
    System.out.printf("%.3f kJ of energy generated from %.1f calories",bk,b);
  
  }
  public void cal(int brd2, int jam2, int butter) {
	  b=brd2*74;
	    bk=b*4.1868;
	    j=jam2*26;
	    jk=j*4.1868;
	    bu=butter*102;
	    buk=bu*4.1868;
	    System.out.printf("%.3f kJ of energy generated from %.1f calories",(bk+jk+buk),(b+j+bu));
  }
public void cal(int brd1, int jam) {
	  b=brd1*74;
	    bk=b*4.1868;
	    j=jam*26;
	    jk=j*4.1868;
	    System.out.printf("%.3f kJ of energy generated from %.1f calories",(bk+jk),(b+j));
}


  
}