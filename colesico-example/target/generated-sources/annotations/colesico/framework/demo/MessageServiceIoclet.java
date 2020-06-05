// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.LazySingleton;
import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.ioclet.AdvancedIoc;
import colesico.framework.ioc.ioclet.Catalog;
import colesico.framework.ioc.ioclet.Factory;
import colesico.framework.ioc.ioclet.Ioclet;
import colesico.framework.ioc.ioclet.SingletonFactory;
import colesico.framework.ioc.key.TypeKey;
import colesico.framework.ioc.production.InstanceProducingException;

@Genstamp(
        generator = "colesico.framework.ioc.codegen.generator.IocletGenerator",
        timestamp = "2020-06-05T14:42:12.902Z",
        hashId = "2bcd1bd0-f2f2-4ad9-91a8-e1db9dbdc12f",
        comments = "Producer: ClassElement{originElement=colesico.framework.demo.MessageServiceProducer}"
)
public final class MessageServiceIoclet implements Ioclet {
    private final LazySingleton<MessageServiceProducer> producer = new LazySingleton<MessageServiceProducer>() {
        @Override
        public final MessageServiceProducer create() {
            return new MessageServiceProducer();
        }
    };

    @Override
    public final String getId() {
        return "colesico.framework.demo.MessageServiceProducer";
    }

    /**
     * Factory to produce colesico.framework.demo.MessageService class instance
     * Scope: SINGLETON; Custom: null
     */
    public Factory<MessageService> getMessageServiceFactory0() {
        return new SingletonFactory<MessageService>() {
            private Factory<MessageServiceProxy> implFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.MessageService
                this.implFac = ioc.factory(new TypeKey(MessageServiceProxy.class));
            }

            @Override
            public final MessageService create(final Object message) {
                try {
                    // Perform instance producing
                    MessageService instance = producer.get().getMessageService(this.implFac.get(message));
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, MessageService.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.demo.MessageServiceProxy class instance
     * Scope: UNSCOPED; Custom: null
     */
    public Factory<MessageServiceProxy> getMessageServiceProxyFactory1() {
        return new Factory<MessageServiceProxy>() {
            private Factory<MessageServiceConfig> paramConfigFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.MessageServiceProxy
                this.paramConfigFac = ioc.factory(new TypeKey(MessageServiceConfig.class));
            }

            @Override
            public final MessageServiceProxy get(final Object message) {
                try {
                    // Perform instance producing
                    MessageServiceProxy instance = new MessageServiceProxy(this.paramConfigFac.get(message));
                    // Post construct listeners invocations:
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, MessageServiceProxy.class);
                }
            }
        };
    }

    @Override
    public final void addFactories(final Catalog catalog) {
        if(catalog.accept(new TypeKey("colesico.framework.demo.MessageService"), null, null, false)){
            catalog.add(getMessageServiceFactory0());
        }

        if(catalog.accept(new TypeKey("colesico.framework.demo.MessageServiceProxy"), null, null, false)){
            catalog.add(getMessageServiceProxyFactory1());
        }

    }
}
