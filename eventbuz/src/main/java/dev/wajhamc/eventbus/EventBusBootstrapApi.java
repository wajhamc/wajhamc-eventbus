package dev.wajhamc.eventbus;

/**
 * @author: wajhamc.dev (sadcenter, rchomczyk, fmap) on 19:10, 05.11.2027
 **/
import org.jetbrains.annotations.NotNull;

public interface EventBusBootstrapApi {

    void postPer(@NotNull final Class<?> clazz);
}
