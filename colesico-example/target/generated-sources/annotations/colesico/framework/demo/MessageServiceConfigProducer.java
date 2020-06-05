// This is automatically generated file. Do not modify!
package colesico.framework.demo;

import colesico.framework.assist.codegen.Genstamp;
import colesico.framework.config.ConfigSource;
import colesico.framework.ioc.listener.PostProduce;
import colesico.framework.ioc.message.Message;
import colesico.framework.ioc.production.Produce;
import colesico.framework.ioc.production.Producer;
import java.util.Map;

@Genstamp(
        generator = "colesico.framework.config.codegen.IocGenerator",
        timestamp = "2020-06-05T14:42:12.650Z",
        hashId = "2f22b8af-a542-4a52-bd16-42fc3681fb16"
)
@Producer
@Produce(
        value = MessageServiceConfig.class,
        postProduce = true
)
public class MessageServiceConfigProducer {
    @PostProduce
    public MessageServiceConfig initMessageServiceConfig(@Message final MessageServiceConfig config,
            final ConfigSource configSource) {
        final ConfigSource.Connection conn = configSource.connect(Map.of("file","message-service.properties"));
        final MessageServiceConfigBag configBag = conn.getValue(MessageServiceConfigBag.class);
        if ( configBag == null ){ return config; };
        if ( configBag.getMessage() != null ){ config.setMessage(configBag.getMessage()); };
        conn.close();
        return config;
    }
}
