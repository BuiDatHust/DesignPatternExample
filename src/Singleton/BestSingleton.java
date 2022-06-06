package Singleton;

public class BestSingleton {
	public static int count =0 ;
	
	private BestSingleton() {
		this.count+=1;
    }
 
    public static BestSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
 
    private static class SingletonHelper {
        private static final BestSingleton INSTANCE = new BestSingleton();
    }
    
    public static void main(String[] args) {
//    	BestSingleton sgt1 =  BestSingleton.getInstance() ;
//    	System.out.println(sgt1.count);
//    	BestSingleton sgt2 =  BestSingleton.getInstance() ;
//    	System.out.println(sgt2.count);
    	
    	Thread thread = new Thread(){
    	    public void run(){
    	    	BestSingleton sgt1 =  BestSingleton.getInstance() ;
    	    	System.out.println(sgt1.count);
    	    }
    	 } ; 
    	 
    	 Thread thread1 = new Thread(){
     	    public void run(){
     	    	BestSingleton sgt1 =  BestSingleton.getInstance() ;
     	    	System.out.println(sgt1.count);
     	    }
     	 } ; 

    	 thread.start();
    	 thread1.start();
    }
}
