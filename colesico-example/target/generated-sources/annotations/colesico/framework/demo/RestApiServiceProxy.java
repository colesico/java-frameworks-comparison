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
        timestamp = "2020-06-05T14:42:12.707Z",
        hashId = "f2090fc4-99e1-4c72-97e3-be03a9220b63",
        comments = "Origin: colesico.framework.demo.RestApi"
)
@Unscoped
@ServiceOrigin(RestApi.class)
public final class RestApiServiceProxy extends RestApi implements ServiceProxy {
    @Inject
    public RestApiServiceProxy(final MessageService paramMessageService) {
        super(paramMessageService);
    }

    @Override
    public String hello(final String paramName) {
        final InterceptorsChain interceptors= new InterceptorsChain();
        interceptors.add(ctx->{
            Object[] p=ctx.getParameters();
            return super.hello((String)p[0]);
        },null);
        final InvocationContext ctx=new InvocationContext(this,"hello",new Object[]{paramName},interceptors);
        return (String)ctx.proceed();
    }

    @Override
    public Class<?> getServiceOrigin() {
        return RestApi.class;
    }
}
