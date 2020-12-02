import Mypack.Balance;
import Mypack.B;
class AccountBalance{
public static void main(String args[]){
 Balance current[]=new Balance[3];
 B b1=new B();
 current[0]=new Balance("k. j. Fielding",123.23);
 current[1]=new Balance("Will Tell",157.02);
 current[2]=new Balance("Tom Jackson",-12.33);
 for(int i=0;i<3;i++)
   current[i].show();
b1.display();
}
}