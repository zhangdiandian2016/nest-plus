package com.zhaofujun.nest.demo;

import org.springframework.context.annotation.Configuration;


@Configuration
public class DemoConfiguration {

//    @Bean
//    public EventConfiguration testEventConfiguration() {
//        EventConfiguration eventConfiguration = new EventConfiguration();
//        eventConfiguration.setCode(TestEventData.Code);
//        eventConfiguration.setMessageChannelCode(RabbitMQMessageChannel.CHANNEL_CODE);
//        return eventConfiguration;
//    }

//    @Bean
//    public CacheConfiguration messageStoreConfiguration() {
//        CacheConfiguration cacheConfiguration = new CacheConfiguration();
//        cacheConfiguration.setCacheCode(DefaultMessageStore.CACHE_CODE);
//        cacheConfiguration.setName("事件消息存储策略");
//        cacheConfiguration.setProviderCode(RedisCacheProvider.CODE);
//        return cacheConfiguration;
//    }

//    @Bean
//    public CacheConfiguration entityCacheConfiguration() {
//        CacheConfiguration cacheConfiguration = new CacheConfiguration();
//        cacheConfiguration.setCacheCode(EntityCacheUtils.getCacheCode());
//        cacheConfiguration.setName("实体缓存策略");
//        cacheConfiguration.setProviderCode(RedisCacheProvider.CODE);
//        return cacheConfiguration;
//    }

//    @Bean
//    public ClassMapping UserDmo2Do() {
//        return new ClassMappingBuilder(UserDmo.class, User.class, true)
//                .field("id", "id")
//                .builder();
//    }
//
//

}

