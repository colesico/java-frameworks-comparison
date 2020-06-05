// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.ioc.production.Produce;
import colesico.framework.ioc.production.Producer;
import javax.inject.Singleton;

@Genstamp(
        generator = "colesico.framework.service.codegen.generator.IocGenerator",
        timestamp = "2020-06-05T14:42:12.727Z",
        hashId = "2e92a45e-f4f2-4332-a1f6-ac09ed6e37b9"
)
@Producer
@Produce(MessageServiceProxy.class)
public class MessageServiceProducer {
    @Singleton
    public MessageService getMessageService(MessageServiceProxy impl) {
        return impl;
    }
}
