// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.LazySingleton;
import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.config.ConfigSource;
import colesico.framework.ioc.ioclet.AdvancedIoc;
import colesico.framework.ioc.ioclet.Catalog;
import colesico.framework.ioc.ioclet.Factory;
import colesico.framework.ioc.ioclet.Ioclet;
import colesico.framework.ioc.ioclet.SingletonFactory;
import colesico.framework.ioc.key.PPLKey;
import colesico.framework.ioc.key.TypeKey;
import colesico.framework.ioc.production.InstanceProducingException;

@Genstamp(
        generator = "colesico.framework.ioc.codegen.generator.IocletGenerator",
        timestamp = "2020-06-05T14:42:12.873Z",
        hashId = "b4ce7bf1-3bf3-441e-9450-50536941f79d",
        comments = "Producer: ClassElement{originElement=colesico.framework.demo.MessageServiceConfigProducer}"
)
public final class MessageServiceConfigIoclet implements Ioclet {
    private final LazySingleton<MessageServiceConfigProducer> producer = new LazySingleton<MessageServiceConfigProducer>() {
        @Override
        public final MessageServiceConfigProducer create() {
            return new MessageServiceConfigProducer();
        }
    };

    @Override
    public final String getId() {
        return "colesico.framework.demo.MessageServiceConfigProducer";
    }

    /**
     * Factory of post produce listener for class colesico.framework.demo.MessageServiceConfig
     * WithNamed: null
     * WithClassed: null
     */
    public Factory<MessageServiceConfig> initMessageServiceConfigFactory0() {
        return new SingletonFactory<MessageServiceConfig>() {
            private Factory<ConfigSource> configSourceFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.MessageServiceConfig
                this.configSourceFac = ioc.factory(new TypeKey(ConfigSource.class));
            }

            @Override
            public final MessageServiceConfig create(final Object message) {
                try {
                    // Perform instance producing
                    MessageServiceConfig instance = producer.get().initMessageServiceConfig((MessageServiceConfig)message,this.configSourceFac.get(message));
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, MessageServiceConfig.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.demo.MessageServiceConfig class instance
     * Scope: UNSCOPED; Custom: null
     */
    public Factory<MessageServiceConfig> getMessageServiceConfigFactory1() {
        return new Factory<MessageServiceConfig>() {
            private Factory<MessageServiceConfig> postProduceFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.demo.MessageServiceConfig
                // Obtain post produce listener factory:
                this.postProduceFac = ioc.factory(new PPLKey(MessageServiceConfig.class,null,null));
            }

            @Override
            public final MessageServiceConfig get(final Object message) {
                try {
                    // Perform instance producing
                    MessageServiceConfig instance = new MessageServiceConfig();
                    // Post produce listener invocation:
                    instance = postProduceFac.get(instance);
                    // Post construct listeners invocations:
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, MessageServiceConfig.class);
                }
            }
        };
    }

    @Override
    public final void addFactories(final Catalog catalog) {
        if(catalog.accept(new PPLKey("colesico.framework.demo.MessageServiceConfig",null,null), null, null, false)){
            catalog.add(initMessageServiceConfigFactory0());
        }

        if(catalog.accept(new TypeKey("colesico.framework.demo.MessageServiceConfig"), null, null, false)){
            catalog.add(getMessageServiceConfigFactory1());
        }

    }
}
