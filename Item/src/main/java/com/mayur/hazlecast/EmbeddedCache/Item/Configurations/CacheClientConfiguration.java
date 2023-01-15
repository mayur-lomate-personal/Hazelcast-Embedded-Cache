package com.mayur.hazlecast.EmbeddedCache.Item.Configurations;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.NearCacheConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.HazelcastInstance;
import com.mayur.hazlecast.EmbeddedCache.Item.Serializer.ItemSerializer;
import org.springframework.context.annotation.Configuration;
import com.mayur.hazlecast.EmbeddedCache.Item.Entities.Item;
import org.springframework.stereotype.Component;

@Component
public class CacheClientConfiguration {

    private static final String ITEMS = "Item";

    private HazelcastInstance client = HazelcastClient.newHazelcastClient(creatClientConfig());

    private ClientConfig creatClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.addNearCacheConfig(createNearCacheConfig());
        clientConfig.getSerializationConfig().addSerializerConfig(serializerConfig());
        return clientConfig;
    }

    private SerializerConfig serializerConfig() {
        return  new SerializerConfig()
                .setImplementation(new ItemSerializer())
                .setTypeClass(Item.class);
    }

    private NearCacheConfig createNearCacheConfig() {
        NearCacheConfig nearCacheConfig = new NearCacheConfig();
        nearCacheConfig.setName(ITEMS);
        nearCacheConfig.setTimeToLiveSeconds(360);
        nearCacheConfig.setMaxIdleSeconds(60);
        return nearCacheConfig;
    }

}
