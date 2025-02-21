public class MainThread1 {
    public static void main(String[] args) {
        ChildThread1 ct1=new ChildThread1();
        ct1.start();
        System.out.println(ct1.getState());
        System.out.println(ct1.getName());
        Thread.yield();//waiting
        ct1.interrupt();//interrupt the sleep
        
        for(int i=1;i<=5;i++){
            System.out.println("mainthread"+i);
        }

    }
    
}
class ChildThread1 extends Thread{
    @Override
    public void run(){
        //Thread.yield();
        for(int i=1;i<=5;i++){
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println("interruped by sleep");
            }
            System.out.println("ChildThread"+i);
        }

    }

}