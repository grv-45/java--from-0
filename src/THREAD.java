

    class A extends Thread{
        public void run(){
            for (int i =0;i<=9;i++ ){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    class B extends Thread{
        public void run(){
            for (int i =0;i<=9;i++ ){
                System.out.println("ho");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public class THREAD {
        public static void main(String[] args) {
            A obj = new A();
            B obj2= new B();
          //  System.out.println(obj.getPriority());
           // obj2.setPriority(Thread.MAX_PRIORITY);

            obj.start();
            obj2.start();
        }
}
