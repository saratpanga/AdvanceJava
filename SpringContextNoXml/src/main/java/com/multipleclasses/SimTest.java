package com.multipleclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimTest {

	@Autowired
	//@Qualifier("jio")
	Sim sim;
	//Jio jio; Dyinamic method dispatcher
	@Autowired
	@Qualifier("jio")
	Sim sim2;
	
	void test() {
		sim.call();
		sim2.call();
	}
}
