package tasks.task031;

import static java.lang.Thread.sleep;

public class Task031 implements Runnable{

        @Override
        public  synchronized void run() {

            for (int i=0;i<100;i++)
                try {
                    System.out.println(i+":" +Thread.currentThread().getName() );
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

}
