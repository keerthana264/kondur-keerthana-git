import java.util.Scanner;
class Bitwise{
int a,b,c;
int option;
void Bitwisecompute(){
Scanner s3=new Scanner(System.in);
System.out.println("1.&operation\n2.>>operation\n3.<<operation\n4.^operation\n5.|operation\n6.~operation");
System.out.println("enter choice");
option=s3.nextInt();
if(option>=1&&option<=5)
{
System.out.println("enter a,bvalues");
a=s3.nextInt();
b=s3.nextInt();
switch(option){
case 1:
c=(a&b);
break;
case 2:
c=(a>>b);
break;
case 3:
c=(a<<b);
break;
case 4:
c=(a^b);
break;
case 5:
c=(a|b);
break;
}
System.out.println("the value of c is:"+c);
}
else
{
System.out.println("enter a value:");
a=s3.nextInt();
a=(~a);
System.out.println("the value is:"+(a));
}
}
}