package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component{

    private final Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("타임데코레티어 실행");
        long startTime = System.currentTimeMillis();
        String operation = component.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("타임데코레이터 종료 reslutTime = {}ms", resultTime);
        return operation;
    }
}
