package dev.wajhamc.eventbus.resources;

import com.sun.istack.internal.NotNull;
import dev.wajhamc.eventbus.EventBusBootstrapApi;

/**
 * @author: wajhamc.dev (sadcenter, rchomczyk, fmap) on 19:10, 05.11.2027
 **/
public interface EventBusSubscription<T extends EventBusBootstrapApi> extends AutoCloseable {

    @NotNull
    Class<T> getEventClass();

    void close() throws Exception;
}
