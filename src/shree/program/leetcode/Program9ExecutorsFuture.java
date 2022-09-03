package shree.program.leetcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program9ExecutorsFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //Future1 Asynchronous
        Future future1 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous Task 2");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Future2 Asynchronous
        Future future2 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous Task 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        try{
            if(future1.get() == null && future2.get() == null){
                System.out.println("Asynchornous Task 1 and 2 completed successfully");
            }
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();

        }
        executorService.shutdown();
    }
}
