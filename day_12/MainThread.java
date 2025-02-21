public class MainThread {
    public static void main(String[] args) {
        ChildThread ct=new ChildThread();
        System.out.println(ct.getState());
        //ct.run();
        ct.start();//new thread created
        System.out.println(ct.getState());
        System.out.println(ct.getName());

        for(int i=1;i<=5;i++){
            System.out.println("MainThread"+i);
        }
    }

    
}
class ChildThread extends Thread{
    //start
    //run
    @Override
    public void run(){
        
        for(int i=1;i<=5;i++){
            
            System.out.println("Childthread"+i);
        }
    }

}