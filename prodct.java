import java.io.*;
import java.util.*;
public class prodct  {
int pcode;
String pname;
double price;
void stock(int a,String b,double c){
pcode=a;
pname=b;
price=c;
}
void display()
{
System.out.println(pname+","+price+","+pcode);
}
static void lowestprice(double p1,double p2,double p3){
if(p1<=p2&&p1<=p3){
System.out.println("p1 is the lowest");
} else if(p2<=p1&&p2<=p3){
System.out.println("p2 is the lowest");
} else{
System.out.println("p3 is the lowest");
}
}
public static void main(String[]args)
{
prodct obj1=new prodct();
prodct obj2=new prodct();
prodct obj3=new prodct();
obj1.stock(101,"bmw",3265);
obj2.stock(101,"suv",324567);
obj3.stock(101,"tesla",56765);
obj1.display();
obj2.display();
obj3.display();
prodct.lowestprice(obj1.price,obj2.price,obj3.price);
}
}



