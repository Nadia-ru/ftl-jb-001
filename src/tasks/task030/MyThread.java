package tasks.task030;

public class MyThread  implements  Runnable{

    @Override
    public void run() {

        Thread thread = new Thread();
        System.out.println("��������� ������ ����� ��������");
        System.out.println( thread.getState());
        thread.start();
        System.out.println("��������� ������ � ��������");
        System.out.println( thread.getState());
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();}
            System.out.println("��������� ������ �� ����������");
        System.out.println(thread.getState());

    }
}
