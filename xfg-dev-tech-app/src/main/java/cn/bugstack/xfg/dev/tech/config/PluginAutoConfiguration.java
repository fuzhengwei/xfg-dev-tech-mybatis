package cn.bugstack.xfg.dev.tech.config;

import cn.bugstack.xfg.dev.tech.plugin.FieldEncryptionAndDecryptionMybatisPlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PluginAutoConfiguration {

    @Bean
    public Interceptor plugin() {
        return new FieldEncryptionAndDecryptionMybatisPlugin();
    }

}
