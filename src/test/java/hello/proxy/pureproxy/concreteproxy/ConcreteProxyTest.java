package hello.proxy.pureproxy.concreteproxy;

import org.junit.jupiter.api.Test;

import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;

public class ConcreteProxyTest {

	@Test
	void noProxy() throws Exception{
		ConcreteClient concreteClient = new ConcreteClient(new ConcreteLogic());
		concreteClient.execute();

	}

	@Test
	void proxy() throws Exception{
		ConcreteClient concreteClient = new ConcreteClient(new TimeProxy(new ConcreteLogic()));
		concreteClient.execute();

	}
}
