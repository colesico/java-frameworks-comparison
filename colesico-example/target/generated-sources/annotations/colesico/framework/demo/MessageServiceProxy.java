// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.scope.Unscoped;
import colesico.framework.service.InterceptorsChain;
import colesico.framework.service.InvocationContext;
import colesico.framework.service.ServiceOrigin;
import colesico.framework.service.ServiceProxy;
import javax.inject.Inject;

@Genstamp(
        generator = "colesico.framework.service.codegen.generator.ServiceProxyGenerator",
        timestamp = "2020-06-05T14:42:12.675Z",
        hashId = "c8b33cac-adc3-4404-8e1a-b2de0a751fb1",
        comments = "Origin: colesico.framework.demo.MessageService"
)
@Unscoped
@ServiceOrigin(MessageService.class)
public final class MessageServiceProxy extends MessageService implements ServiceProxy {
    @Inject
    public MessageServiceProxy(final MessageServiceConfig paramConfig) {
        super(paramConfig);
    }

    @Override
    public String sayHello(final String paramName) {
        final InterceptorsChain interceptors= new InterceptorsChain();
        interceptors.add(ctx->{
            Object[] p=ctx.getParameters();
            return super.sayHello((String)p[0]);
        },null);
        final InvocationContext ctx=new InvocationContext(this,"sayHello",new Object[]{paramName},interceptors);
        return (String)ctx.proceed();
    }

    @Override
    public Class<?> getServiceOrigin() {
        return MessageService.class;
    }
}
