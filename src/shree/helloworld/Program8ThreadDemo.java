package shree.helloworld;

public class Program8ThreadDemo {
    public static void main(String[] args) {
        //Child Thread-1
        new Thread(() ->{
            for(int i=1; i<=10; i++) {
                System.out.println("Child Thread-1 Even  "+ i*2);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Child Thread-2
        new Thread(() ->{
            for(int i=1; i<10; i++) {
                System.out.println("Child Thread-2 Odd "+ (i*2+1));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
