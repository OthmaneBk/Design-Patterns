package designPattern.Proxy;

import java.io.File;
import java.util.function.Predicate;

import designPattern.Builder.RessourceManager;

public class AccessControlProxy {
	
	private User user;
	private RessourceManager ressourceManager;
	
	public AccessControlProxy(RessourceManager ressourceManager ,User user) {
		this.user=user;
		this.ressourceManager=ressourceManager;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
	public Object construct(Predicate<File> fileCondition, String extension) {
		if(check(user)) {
			return ressourceManager.construct(fileCondition, extension);
		}
		return null;
	}
		
	private boolean check(User user) {
		if(user.getGmail().equals("designPattern@gmail.com") && user.getPwd().equals("123")) {
			return true;
		}else {
			error();
			return false;
		}
	}
	
	
	private void error() {
		System.out.println("### ACCESS CONTROL ERROR: you haven't the permission to use the ressources");
	}
}
