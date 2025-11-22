import java.io.*;

class Test5
{
public static void main(String args[])
{
File file=new File("C:\\Users\\DELL\\Downloads");
File[] list=file.listFiles();
for(File list1:list)
{
	if(list1.isDirectory())
		
		if(list1.list().length==0)
		{
			File f=new File(list1.getAbsolutePath());
			f.delete();
		}

}
}
}
