package test;
import esercizio3.Context;
import esercizio3.Monitor;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class ObserverStrategy {

	@Test
	void observerStrategyTest() {
		Context context = new Context();
		Monitor monitor = new Monitor();
		monitor.addObserver(context);
		Assert.assertEquals(monitor.getState(), 0);
		context.setStrategy(1);
		
	}
	
	@Test
	void changeSubjectStateChangeStrategy() {
		Context context = new Context();
		Monitor monitor = new Monitor();
		monitor.addObserver(context);
		monitor.setState(0);
		Assert.assertEquals(monitor.getState(), 0);
		Assert.assertEquals("Strategy 1", context.op());
		monitor.setState(1);
		Assert.assertEquals(monitor.getState(), 1);
		Assert.assertEquals("Strategy 2", context.op());
	}

}
