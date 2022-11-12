package multithreading;

//Creating thread by extending Thread class ---Thread Class present in Lang Package
 class MythreadDemo extends  Thread{

    public void run(){
        try {
            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getThreadGroup());
        }
        catch (Exception e){
            System.out.println(e);
        }
        }
}

public class MyThreadTest{
    public static void main(String[] args) {


        for (int i=0;i<8;i++){
            MythreadDemo mythreadDemo=new MythreadDemo();
            mythreadDemo.start();
          //  mythreadDemo.run();
        }

    }
}