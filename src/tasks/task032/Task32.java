package tasks.task032;

import com.company.L027.ThreadExample;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Task32 {
    public static void run(){
        ConcurrentLinkedQueue<Long> buffer = new ConcurrentLinkedQueue<>();
        final int MAX = 4;
        Random random = new Random();

        // producer
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (buffer.size() < MAX) {
                            long value = System.currentTimeMillis();
                            buffer.add(value);
                            System.out.println("Producer: added " + value);
                        } else {
                            System.out.println("Producer: waiting...");
                        }

                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();

        // consumer
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (buffer.size() > 0) {
                            long value = buffer.poll();
                            System.out.println("Consumer: polled " + value);
                        } else {
                            System.out.println("Consumer: waiting...");
                        }

                        Thread.sleep(550 + random.nextInt(4)*100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (buffer.size() == 0) System.out.println("  |");
                        if (buffer.size() == 1) System.out.println("  |*");
                        if (buffer.size() == 2) System.out.println("  |**");
                        if (buffer.size() == 3) System.out.println("  |***");
                        if (buffer.size() == 4) System.out.println("  |****");

                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
    }
}
