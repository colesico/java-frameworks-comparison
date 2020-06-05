// This is automatically generated file. Do not modify!
package colesico.framework.test.example.restlet;

import colesico.framework.assist.LazySingleton;
import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.conditional.Substitution;
import colesico.framework.ioc.conditional.TestCondition;
import colesico.framework.ioc.ioclet.AdvancedIoc;
import colesico.framework.ioc.ioclet.Catalog;
import colesico.framework.ioc.ioclet.Factory;
import colesico.framework.ioc.ioclet.Ioclet;
import colesico.framework.ioc.ioclet.SingletonFactory;
import colesico.framework.ioc.key.TypeKey;
import colesico.framework.ioc.production.InstanceProducingException;
import colesico.framework.undertow.UndertowConfigPrototype;

@Genstamp(
        generator = "colesico.framework.ioc.codegen.generator.IocletGenerator",
        timestamp = "2020-06-05T14:42:13.485Z",
        hashId = "03f5fc6a-a09d-4612-b36f-484cd96ba07b",
        comments = "Producer: ClassElement{originElement=colesico.framework.test.example.restlet.UndertowTestConfigProducer}"
)
public final class UndertowTestConfigIoclet implements Ioclet {
    private final LazySingleton<UndertowTestConfigProducer> producer = new LazySingleton<UndertowTestConfigProducer>() {
        @Override
        public final UndertowTestConfigProducer create() {
            return new UndertowTestConfigProducer();
        }
    };

    @Override
    public final String getId() {
        return "colesico.framework.test.example.restlet.UndertowTestConfigProducer";
    }

    /**
     * Factory to produce colesico.framework.undertow.UndertowConfigPrototype class instance
     * Scope: SINGLETON; Custom: null
     */
    public Factory<UndertowConfigPrototype> getUndertowTestConfigFactory0() {
        return new SingletonFactory<UndertowConfigPrototype>() {
            private Factory<UndertowTestConfig> configFac;

            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.undertow.UndertowConfigPrototype
                this.configFac = ioc.factory(new TypeKey(UndertowTestConfig.class));
            }

            @Override
            public final UndertowConfigPrototype create(final Object message) {
                try {
                    // Perform instance producing
                    UndertowConfigPrototype instance = producer.get().getUndertowTestConfig(this.configFac.get(message));
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, UndertowConfigPrototype.class);
                }
            }
        };
    }

    /**
     * Factory to produce colesico.framework.test.example.restlet.UndertowTestConfig class instance
     * Scope: UNSCOPED; Custom: null
     */
    public Factory<UndertowTestConfig> getUndertowTestConfigFactory1() {
        return new Factory<UndertowTestConfig>() {
            @Override
            public final void setup(final AdvancedIoc ioc) {
                // Initialize dependencies for: colesico.framework.test.example.restlet.UndertowTestConfig
            }

            @Override
            public final UndertowTestConfig get(final Object message) {
                try {
                    // Perform instance producing
                    UndertowTestConfig instance = new UndertowTestConfig();
                    // Post construct listeners invocations:
                    return instance;
                } catch (InstanceProducingException ipe) {
                    throw ipe;
                } catch (Throwable t) {
                    throw new InstanceProducingException(t, UndertowTestConfig.class);
                }
            }
        };
    }

    @Override
    public final void addFactories(final Catalog catalog) {
        if(catalog.accept(new TypeKey("colesico.framework.undertow.UndertowConfigPrototype"), new TestCondition(), Substitution.DEFAULT, false)){
            catalog.add(getUndertowTestConfigFactory0());
        }

        if(catalog.accept(new TypeKey("colesico.framework.test.example.restlet.UndertowTestConfig"), new TestCondition(), null, false)){
            catalog.add(getUndertowTestConfigFactory1());
        }

    }
}
