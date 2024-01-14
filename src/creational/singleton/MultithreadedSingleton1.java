package creational.singleton;

public class MultithreadedSingleton1 {
    
    private static MultithreadedSingleton1 multithreadedSingleton1 = null;
    
    private MultithreadedSingleton1(){};
    
    public static MultithreadedSingleton1 getInstance(){
        
        if(multithreadedSingleton1 == null){
            synchronized (MultithreadedSingleton1.class){
                if(multithreadedSingleton1 == null){
                    multithreadedSingleton1 = new MultithreadedSingleton1();
                }

            }

        }
        
        return multithreadedSingleton1;
    }
}
