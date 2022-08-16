package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeProxy extends ConcreteLogic{

	private ConcreteLogic target;

	public TimeProxy(ConcreteLogic target) {
		this.target = target;
	}

	@Override
	public String operation() {
		log.info("TimeDecorator 실행");
		long startTime = System.currentTimeMillis();
		String operation = target.operation();
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		log.info("타임데코레이터 종료 reslutTime = {}ms", resultTime);
		return operation;
	}


}
