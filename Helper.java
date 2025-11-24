public class Helper {
    class Message
{
int responds;
String message;

static class Respond
{
static final int NOTFound=404;
static final int Found=300;
static final int OK=200;
}

Message(int responds,String message)
{
this.responds=responds;
this.message=message;
}
public String toString()
{
return "Respond:"+responds+"\nMessage:"+message;
}
}
}
class HelperClass
{
public static void main(String args[])
{
Message obj=new Message(Message.Respond.NOTFound,"NOTFound");
System.out.println(obj);
}
}

