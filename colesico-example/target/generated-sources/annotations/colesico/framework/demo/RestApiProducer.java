// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.production.Classed;
import colesico.framework.ioc.production.Polyproduce;
import colesico.framework.ioc.production.Produce;
import colesico.framework.ioc.production.Producer;
import colesico.framework.router.Router;
import colesico.framework.teleapi.TeleFacade;
import javax.inject.Singleton;

@Genstamp(
        generator = "colesico.framework.service.codegen.generator.IocGenerator",
        timestamp = "2020-06-05T14:42:12.724Z",
        hashId = "22b08264-9b7f-433f-920b-3a1dac4771d8"
)
@Producer
@Produce(RestApiServiceProxy.class)
@Produce(RestApiRestletFacade.class)
public class RestApiProducer {
    @Singleton
    public RestApi getRestApi(RestApiServiceProxy impl) {
        return impl;
    }

    @Polyproduce
    @Classed(Router.class)
    public TeleFacade getTeleFacadeRestlet(final RestApiRestletFacade impl) {
        return impl;
    }
}
