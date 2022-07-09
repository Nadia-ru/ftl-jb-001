package tasks.task030;

public class MyThread  implements  Runnable{

    @Override
    public void run() {

        Thread thread = new Thread();
        System.out.println("состояние потока перед запуском");
        System.out.println( thread.getState());
        thread.start();
        System.out.println("Состояние потока в процессе");
        System.out.println( thread.getState());
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();}
            System.out.println("Состояние потока по завершению");
        System.out.println(thread.getState());

    }
}
