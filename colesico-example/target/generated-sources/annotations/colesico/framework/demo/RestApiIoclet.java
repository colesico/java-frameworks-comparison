// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.LazySingleton;
import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.ioclet.AdvancedIoc;
import colesico.framework.ioc.ioclet.Catalog;
import colesico.framework.ioc.ioclet.DefaultProvider;
import colesico.framework.ioc.ioclet.Factory;
import colesico.framework.ioc.ioclet.Ioclet;
import colesico.framework.ioc.ioclet.SingletonFactory;
import colesico.framework.ioc.key.ClassedKey;
import colesico.framework.ioc.key.TypeKey;
import colesico.framework.ioc.production.InstanceProducingException;
import colesico.framework.restlet.teleapi.RestletTeleDriver;
import colesico.framework.teleapi.TeleFacade;

@Genstamp(
        generator = "colesico.framework.ioc.codegen.generator.IocletGenerator",
        timestamp = "2020-06-05T14:42:12.890Z",
        hashId = "1f210966-d351-4caa-9696-16b4fd33e246",
        comments = "Producer: ClassElement{originElement=colesico.framework.demo.RestApiProducer}"
)
public final class RestApiIoclet implements Ioclet {
    private final LazySingleton<RestApiProducer> producer = new LazySingleton<RestApiProducer>() {
        @Override
        public final RestApiProducer create() {
            return new RestApiProducer();
        }
    };

    @Override
    public final String getId() {
        return "colesico.framework.demo.RestApiProducer";
    }

    /**
     * Factory to produce colesico.framework.demo.RestApi class instance
     * Scope: SINGLETON; Custom: null
     */
    public Factory<RestApi> getRestApiFactory0() {
        return new SingletonFactory<RestApi>() {
            private Factory<RestApiServiceProxy> implFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.RestApi
                this.implFac = ioc.factory(new TypeKey(RestApiServiceProxy.class));
            }

            @Override
            public final RestApi create(final Object message) {
                try {
                    // Perform instance producing
                    RestApi instance = producer.get().getRestApi(this.implFac.get(message));
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, RestApi.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.teleapi.TeleFacade class instance
     * Scope: UNSCOPED; Custom: null
     * Classed: colesico.framework.router.Router
     * Polyproduce: true
     */
    public Factory<TeleFacade> getTeleFacadeRestletFactory1() {
        return new Factory<TeleFacade>() {
            private Factory<RestApiRestletFacade> implFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.teleapi.TeleFacade
                this.implFac = ioc.factory(new TypeKey(RestApiRestletFacade.class));
            }

            @Override
            public final TeleFacade get(final Object message) {
                try {
                    // Perform instance producing
                    TeleFacade instance = producer.get().getTeleFacadeRestlet(this.implFac.get(message));
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, TeleFacade.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.demo.RestApiServiceProxy class instance
     * Scope: UNSCOPED; Custom: null
     */
    public Factory<RestApiServiceProxy> getRestApiServiceProxyFactory2() {
        return new Factory<RestApiServiceProxy>() {
            private Factory<MessageService> paramMessageServiceFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.RestApiServiceProxy
                this.paramMessageServiceFac = ioc.factory(new TypeKey(MessageService.class));
            }

            @Override
            public final RestApiServiceProxy get(final Object message) {
                try {
                    // Perform instance producing
                    RestApiServiceProxy instance = new RestApiServiceProxy(this.paramMessageServiceFac.get(message));
                    // Post construct listeners invocations:
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, RestApiServiceProxy.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.demo.RestApiRestletFacade class instance
     * Scope: SINGLETON; Custom: null
     */
    public Factory<RestApiRestletFacade> getRestApiRestletFacadeFactory3() {
        return new SingletonFactory<RestApiRestletFacade>() {
            private Factory<RestApi> targetProvFac;

            private Factory<RestletTeleDriver> teleDriverFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.RestApiRestletFacade
                this.targetProvFac = ioc.factory(new TypeKey(RestApi.class));
                this.teleDriverFac = ioc.factory(new TypeKey(RestletTeleDriver.class));
            }

            @Override
            public final RestApiRestletFacade create(final Object message) {
                try {
                    // Perform instance producing
                    RestApiRestletFacade instance = new RestApiRestletFacade(new DefaultProvider(this.targetProvFac,message),this.teleDriverFac.get(message));
                    // Post construct listeners invocations:
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, RestApiRestletFacade.class);
                }
            }
        };
    }

    @Override
    public final void addFactories(final Catalog catalog) {
        if(catalog.accept(new TypeKey("colesico.framework.demo.RestApi"), null, null, false)){
            catalog.add(getRestApiFactory0());
        }

        if(catalog.accept(new ClassedKey("colesico.framework.teleapi.TeleFacade","colesico.framework.router.Router"), null, null, true)){
            catalog.add(getTeleFacadeRestletFactory1());
        }

        if(catalog.accept(new TypeKey("colesico.framework.demo.RestApiServiceProxy"), null, null, false)){
            catalog.add(getRestApiServiceProxyFactory2());
        }

        if(catalog.accept(new TypeKey("colesico.framework.demo.RestApiRestletFacade"), null, null, false)){
            catalog.add(getRestApiRestletFacadeFactory3());
        }

    }
}
