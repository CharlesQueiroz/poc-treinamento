package br.com.ifce.poc.interceptor;


import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Interceptor
public class LogInterceptor {

    @Inject
    private Logger logger;

    @Inject
    private Event<String> logDeEntradaEscrito;

    @AroundInvoke
    public Object logMetodo(InvocationContext ic) throws Exception {
        logger.info("Entrando no método: " + ic.getMethod().getName());
        logDeEntradaEscrito.fire("KKKKKKKKKKK");
        try {
            return ic.proceed();
        } finally {
            logger.info("Saindo do método: " + ic.getMethod().getName());
        }
    }
}
