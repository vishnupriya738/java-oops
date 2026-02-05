import java.util.*;
class shapes
{
public void area(float radius)
{
double areas=Math.PI*radius*radius;
System.out.println("area of circle is:"+areas);
}
public void area (int side)
{
int areas=side*side;
System.out.println("area of square is:"+areas);
}
public void area(int length,int breadth)
{
int areas=length*breadth;
System.out.println("area of rectangle is:"+areas);
}
}
class areas 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
shapes sh=new shapes();
System.out.println("enter the choice:1.circle,2.square,3.rectangle\n");
System.out.println("enter your choice");
int n=sc.nextInt();
switch(n)
{
case 1:System.out.println("enter the radius:");
float r=sc.nextFloat();
sh.area(r);
break;
case 2:System.out.println("enter the sides:");
int s=sc.nextInt();
sh.area(s);
break;
case 3:System.out.println("enter the length&breadth:");
int l=sc.nextInt();
int b=sc.nextInt();
sh.area(l,b);
break;
default:System.out.println("invalid choice");
}
}
}

