class outer
{
 int httpStatusCode;
 String StatusCodeName;
 
static class inner 
{
static  final int OK=200;
static  final int FOUND=302;
static  final int NOTFOUND=404;
static  final int GET_TIMEOUT=504;

}
outer(int httpStatusCode,String StatusCodeName)
{
this.httpStatusCode=httpStatusCode;
this.StatusCodeName=StatusCodeName;
}
void display()
{
	System.out.println("HTTPSTATUS CODE:"+httpStatusCode);
	System.out.println("STATUSCODENAME:"+StatusCodeName);
}
}
class StaticClassPractice
{
public static void main(String []args)
{
System.out.println(outer.inner.OK);
outer obj=new outer(outer.inner.FOUND,"FOUND");
obj.display();
}
} 