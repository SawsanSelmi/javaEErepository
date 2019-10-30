
	package tn.esprit.service;

	import javax.ejb.Local;

	@Local
	public interface HelloServiceLocal {
		String sayHello(String msg); 
	}



