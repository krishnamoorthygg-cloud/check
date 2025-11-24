public class BuilderPatten {
    class outer
{
private int id;
private String name;
private int age;
private String loc;
 public String toString()
 {
	 return "id:"+id+" \nc name:"+name+" \nage:"+age+ "  \nLocation:"+loc;
 }
static class inner
{
private int id;
private String name;
private int age;
private String loc;

public inner setId(int id)
{
	this.id=id;
return this;
}
public inner setName(String  name)
{
	this.name=name;
return  this;
}
public inner setAge(int age)
{
	this.age=age;
return this;
}
public inner setloc(String loc)
{
	this.loc=loc;
return this;
}
public outer  build()
{
outer obj=new outer();
obj.id=this.id;
obj.name=this.name;
obj.age=this.age;
obj.loc=this.loc;
return obj;
}

}
}

public class BuilderPatten
{
public static void main(String args[])
{
outer obj =new outer.inner()
            .setId(3211)
			.setName("krishna")
			.setAge(27)
			.setloc("chennai")
			.build();
			System.out.println(obj);
}
}
}
