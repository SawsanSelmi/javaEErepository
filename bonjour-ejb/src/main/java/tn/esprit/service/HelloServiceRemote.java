	package tn.esprit.service;
	import javax.ejb.Remote;
	
	@Remote
	public interface HelloServiceRemote {
		String sayHello(String msg); 
	}