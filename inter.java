import java.io.*;
import java.util.*;
interface shape
{
void area();
void perimeter();
}
class circle implements shape
{
int r;
Scanner sc= new Scanner(System.in);
public void area(){
System.out.println("enter the radius:");
int r=sc.nextInt();
double area=Math.PI*r*r;
System.out.println("area of the circle="+area);
}
public void perimeter(){
System.out.println("enter the radius:");
int r=sc.nextInt();
double perimeter=2*Math.PI*r;
System.out.println("perimeter of the circle="+perimeter);
}
}
class rectangle implements shape
{
int l;
int b;
Scanner sc =new Scanner(System.in);
public void area(){
System.out.println("enter the length:");
int l=sc.nextInt();
System.out.println("enter the breadth:");
int b=sc.nextInt();
double area=l*b;
System.out.println("area of the rectangle="+area);
}
public void perimeter(){
System.out.println("enter the length:");
int l=sc.nextInt();
System.out.println("enter the breadth:");
int b=sc.nextInt();
double perimeter=2*(l+b);
System.out.println("perimeter of the rectangle="+perimeter);
}
}
class inter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
circle fg=new circle();
rectangle df=new rectangle();
System.out.println("enter the choice: 1.circle,2.rectangle");
int n=sc.nextInt();
switch(n)
{
case 1:fg.area();
fg.perimeter();
case 2:df.area();
df.perimeter();
break;
default:System.out.println("Invalid choice");
}
}
}

