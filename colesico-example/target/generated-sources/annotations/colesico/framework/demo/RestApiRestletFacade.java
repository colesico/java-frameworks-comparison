// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.restlet.teleapi.RestletDataPort;
import colesico.framework.restlet.teleapi.RestletTeleDriver;
import colesico.framework.router.RoutingLigature;
import colesico.framework.teleapi.TeleDriver;
import colesico.framework.teleapi.TeleFacade;
import colesico.framework.weblet.teleapi.OriginFacade;
import colesico.framework.weblet.teleapi.WebletTDRContext;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Genstamp(
        generator = "colesico.framework.service.codegen.generator.TeleFacadesGenerator",
        timestamp = "2020-06-05T14:42:12.713Z",
        hashId = "aa88e3f8-711a-40d1-a5cc-3f2a3ced318b",
        comments = "Service: colesico.framework.demo.RestApi"
)
@Singleton
public final class RestApiRestletFacade extends TeleFacade<RestApi, RestletTeleDriver, RoutingLigature> {
    @Inject
    public RestApiRestletFacade(final Provider<RestApi> targetProv,
            final RestletTeleDriver teleDriver) {
        super(targetProv,teleDriver);
    }

    public final void hello() {
        final TeleDriver.Binder<RestApi, RestletDataPort> binder=(target,dataPort)->{

            // Assign tele-method parameter value from remote client
            String nameArg = dataPort.read(String.class,new WebletTDRContext("name",OriginFacade.DEFAULT));

             // Invoke target service method
            String result = target.hello(nameArg);

            // Send result to remote client
            dataPort.write(String.class, result, null);
        };
        RestApi target=targetProv.get();
        teleDriver.invoke(target,binder,null);
    }

    public final RoutingLigature getLigature() {
        RoutingLigature ligature = new RoutingLigature(RestApi.class);
        ligature.add("GET/hello/:name",this::hello,"hello",Map.of("NON_BLOCKING","true"));
        return ligature;
    }
}
