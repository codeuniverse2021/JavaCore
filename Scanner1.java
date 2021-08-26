import java.util.Scanner;
public class Scanner1{
public static void main(String[] args) {
    
    Scanner objsc=new Scanner(System.in);
    int a=objsc.nextInt();
    float f=objsc.nextFloat();
    double d=objsc.nextDouble();
    char ch=objsc.next().charAt(0);
    String str=objsc.next();
    String str2=objsc.nextLine();
    byte b=objsc.nextByte();
    boolean bool=objsc.nextBoolean();
    short s=objsc.nextShort();
    long l=objsc.nextLong();
}  
}
