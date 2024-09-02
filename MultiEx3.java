
class Mythread2 extends Thread{
    public void run(){
        System.out.println("I am happy");
    }
}

class Mythread3 extends Thread{
    public void run(){
        System.out.println("I am sad");
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Very sad");
                Thread.sleep(2000);//Ham thread ko bol rahe hai ki 2 sec ke liye so jao
            }
        }
        catch(Exception e){
            System.out.println("Some problem");

        }

    }

}


public class MultiEx3 {

    public static void main(String[] args) {

        Mythread2 t2 = new Mythread2();
        Mythread3 t3 = new Mythread3();

        t2.start();
        t3.start();

    }
}
