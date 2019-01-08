 
 class MyThread extends Thread {
    
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    
    }
    
}
public class test1
{
    public static void main(String...args)
    {
        MyThread t1=new MyThread();
        t1.run();
    }
}
