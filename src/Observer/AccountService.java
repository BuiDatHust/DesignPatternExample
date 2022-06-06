package Observer;

import java.util.ArrayList;
import java.util.List;

enum LoginStatus {
	SUCCESS, FAILURE, EXPIRED 
}

public class AccountService implements Subject {
	private User user ;
	private List<Observe> observers =new ArrayList<>() ; 
	
	@Override()
	public void subscribe(Observe obs) {
		if( !observers.contains(obs) ) {
			this.observers.add(obs) ;
		}
	}
	
	@Override()
	public void unsubscribe(Observe obs) {
		if( observers.contains(obs) ) {
			this.observers.remove(obs) ;
		}
	}
	
	@Override()
	public void notifyAllObserver() {
		for(Observe obs : observers) {
			obs.update(user);
		}
	}
	
	public void changeStatus(LoginStatus status) {
		user.setStatus(status);
		System.out.println("Status is changed");
		notifyAllObserver();
	}
	
	public void login(String username,String userIp ) {
		if( username!=user.getName() || userIp!=user.getIP()  ) {
			this.changeStatus(LoginStatus.FAILURE);
		}else {
			this.changeStatus(LoginStatus.SUCCESS);
		}
	}
}
