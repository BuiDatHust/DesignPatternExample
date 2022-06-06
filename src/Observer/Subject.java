package Observer;

public interface Subject {
	void subscribe(); 
	void unsubscribe() ;
	void notifyAllObserver() ;
}
