package br.com.ifce.poc.producer;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public final class LoggerProducer {

    private LoggerProducer() {
    }

    @Default
    @Produces
    public static Logger createLogger(InjectionPoint ip) {
        return getLogger(ip.getMember().getDeclaringClass().getName());
    }
}
