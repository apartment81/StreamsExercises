package ro.mirodone;

public class Challenge1 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String mySting = "one two three four five six";
                String[] parts = mySting.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }

            }
        };
        new Thread(runnable).start();


        Runnable run = () -> {
            String mySting = "one two three four five six";
            String[] parts = mySting.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        new Thread(run).start();
    }

}

