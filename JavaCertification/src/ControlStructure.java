
public class ControlStructure {
public static void main(String args[])
{
ControlStructure obj
=new ControlStructure();
obj.fn_ControlStructure();
}
void fn_ControlStructure()
{
int i_var1=4;
int i_var2=9;
//IF-Else Statement
//if(i_var1=9) //Not Valid in JAVA but valid in C
//{..........}
if(i_var1==i_var2)
{System.out.println("Inside IF statement");}
else

{System.out.println("In
side Else statement");}
//Switch Case
switch(i_var1)
{
case 1:
System.out.println
("Inside Switch statement:Case 1");
break;//to prevent Free Fall Property
case 4:
System.out.println
("Inside Switch statement:Case 4");
break;
default: //can write any where inside the switch statement
System.out.println("In
side Switch statement:Case Default");
}
//For Statement
for(;i_var1<10;i_var1++)
{System.out.println("value :"+i_var1);}
//do-while statement
do
{
System.out.println("Do-While value :"+i_var1);
i_var1++;
}while(i_var1<12);
i_var1=10;
while(i_var1<15)
{
System.out.println("While value :"+i_var1);
i_var1++;
}
}
}
Example to demonstrate Control Structures
public class EnhancedForLoop {
public static void main(String args[])
{
Infosys Demo Programs for
Java Programming Part 1
ER/CORP/CRS/
ERJEEML100/
018
Confidentiel
Version No. 0.1
4
EnhancedForLoop obj=new EnhancedForLoop();
obj.enhancedForLoop();
}
void enhancedForLoop()
{
String[] s_Arrayvar={"E&R","PLES","Facilities","CCD","SI"};
for(String s:s_Arrayvar)
{
System.out.println(s);
}
}
} 