import java.io.*;
class Tast4
{
public static void main(String args[])
{
File file=new File("C:\\Users\\DELL\\Downloads");
File[] list=file.listFiles();
for(File list1:list)
{
if(list1.isFile())
{
String str=list1.getName();
int lastFile=str.lastIndexOf(".");
String str1=str.substring(lastFile+1);
if(str1.equals("jpg"))
 System.out.println(str);
}
}
}
