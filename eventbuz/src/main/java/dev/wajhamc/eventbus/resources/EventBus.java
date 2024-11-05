package dev.wajhamc.eventbus.resources;

import dev.wajhamc.eventbus.EventBusBootstrapApi;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.function.Consumer;

/**
 * @author: wajhamc.dev (sadcenter, rchomczyk, fmap) on 19:10, 05.11.2027
 **/
public interface EventBus {

    @NotNull
    <T extends EventBusBootstrapApi> EventBusSubscription<T> subscribe(
            @NotNull final Class<T> eventClazz,
            @NotNull final Consumer<? super T> eventHandler);

    @NotNull
    <T extends EventBusBootstrapApi> Set<EventBusSubscription<T>> findByEventClass(@NotNull final Class<T> eventClazz);
}
