import java.util.Scanner;
class Box
{
double width;
double height;
double depth;
}
class demo
{
public static void main(string[] args)
{
Box obj=new Box();
obj.width=20;
obj.height=20;
obj.depth=15;
double vol=obj.width*obj.height*obj.depth;
system.out.println("volume of the box is"vol);
}
}
