
import java.io.*;
class Test2
{
	int id;
	String name;
public static void main(String [] args)throws IOException
{
Test2 obj=new Test2();
FileOutputStream file=new FileOutputStream("C:\\Users\\DELL\\Downloads\\hello\\mm.txt",true);
DataOutputStream distini=new DataOutputStream(file);
distini.writeInt(obj.id=123);
distini.writeUTF(obj.name="krishna");
FileInputStream source=new FileInputStream("C:\\Users\\DELL\\Downloads\\hello\\mm.txt");
DataInputStream source1=new DataInputStream(source);
System.out.println(source1.readInt());
System.out.println(source1.readUTF());
}
}