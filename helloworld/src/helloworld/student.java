package helloworld;

public class student 
{
int rollno;
String name;  
static String college ="ITS";  
//constructor  
 void Student(int r, String n)
 {  
rollno = r;  
name = n;  
}  
//method to display the values  
void display ()
{
	System.out.println(rollno+" "+name+" "+college);
}  
}
