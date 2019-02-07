package com.zfh.auth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;


/**
 * JWT配置
 * @author  zfh
 * @since 2019/2/7
 */
@Configuration
public class JwtTokenConfig {

    private final Logger logger = LoggerFactory.getLogger(JwtTokenConfig.class);


    public JwtTokenConfig() {logger.info("Loading JwtTokenConfig ...");}

    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    // 用来生成jwt(JwtTokenStore需要这个类来解码转码)
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();

        //生成签名的key
        //秘签
        jwtAccessTokenConverter.setSigningKey("zfh");
        return jwtAccessTokenConverter;
    }
}
