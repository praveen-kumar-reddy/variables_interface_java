package interfacepackage.com;
 

interface Student 
{
    public void data();
    
}
class avi implements Student
{
    public void data ()
    {
        String name="putta praveen kumar reddy";
        int rollno=68;
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class inter_face
{
    public static void main (String args [])
    {
        avi h= new avi();
        h.data();
    }
}

 


