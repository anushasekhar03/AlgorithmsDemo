package Strings;

public class SingleThread {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Main thread is executing" + i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e ){
                System.out.println("Main thread interrupted.");
                e.printStackTrace();
            }
        }
        System.out.println("Main thread finished");
    }
}
