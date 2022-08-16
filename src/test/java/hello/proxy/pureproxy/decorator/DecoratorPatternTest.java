package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.Message;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator () throws Exception {

        Component realComponent = new RealComponent();
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(realComponent);
        decoratorPatternClient.execute();
    }
    @Test
    void messageDecorator () throws Exception {

        Component realComponent = new RealComponent();
        Component decorator = new MessageDecorator(realComponent);
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(decorator);
        decoratorPatternClient.execute();
    }
    @Test
    void decorator2 () throws Exception {

        Component realComponent = new RealComponent();
        Component decorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(decorator);
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(timeDecorator);
        decoratorPatternClient.execute();
    }
}
