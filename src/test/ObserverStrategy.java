package test;
import esercizio3.ConcreteStrategy1;
import esercizio3.ConcreteStrategy2;
import esercizio3.Context;
import esercizio3.Monitor;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class ObserverStrategy {
	

	@Test
	void testStrategy() {
		Context context = new Context();
		context.setStrategy(0);
		String strategy = ((ConcreteStrategy1)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 1");
		context.setStrategy(1);
		strategy = ((ConcreteStrategy2)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 2");
		context.setStrategy(0);
		strategy = ((ConcreteStrategy1)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 1");
	}
	
	@Test
	void testObserverReceiveNotification() {
		Monitor monitor = new Monitor();
		Context context = new Context();
		monitor.addObserver(context);
		Assert.assertEquals(context.getStrategy(), null);
		monitor.setState(0);
		String strategy = ((ConcreteStrategy1)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 1");
		monitor.setState(1);
		strategy = ((ConcreteStrategy2)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 2");
		monitor.setState(0);
		strategy = ((ConcreteStrategy1)context.getStrategy()).getName();
		Assert.assertEquals(strategy, "Strategy 1");
	}
	
	@Test
	void testNotificationAdaptContextStrategy() {
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
