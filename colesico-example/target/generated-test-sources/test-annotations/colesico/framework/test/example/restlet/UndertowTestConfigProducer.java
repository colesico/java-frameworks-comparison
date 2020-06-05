// This is automatically generated file. Do not modify!
package colesico.framework.test.example.restlet;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.conditional.Requires;
import colesico.framework.ioc.conditional.Substitute;
import colesico.framework.ioc.conditional.TestCondition;
import colesico.framework.ioc.production.Produce;
import colesico.framework.ioc.production.Producer;
import colesico.framework.undertow.UndertowConfigPrototype;
import javax.inject.Singleton;

@Genstamp(
        generator = "colesico.framework.config.codegen.IocGenerator",
        timestamp = "2020-06-05T14:42:13.419Z",
        hashId = "ef224470-60e3-47d9-a0df-b8722255dbc0"
)
@Producer
@Requires(TestCondition.class)
@Substitute
@Produce(UndertowTestConfig.class)
public class UndertowTestConfigProducer {
    @Singleton
    public UndertowConfigPrototype getUndertowTestConfig(final UndertowTestConfig config) {
        return config;
    }
}
