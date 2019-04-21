package com.yunxi.apollodemo.test.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-21
 * @Description:
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class DataSourceConfig {
    @Autowired
    ApplicationContext context;
    @Autowired
    private org.springframework.cloud.context.scope.refresh.RefreshScope refreshScope;

    @ApolloConfigChangeListener
    private void onChange(ConfigChangeEvent changeEvent) {
        DataSourceProperties dataSourceProperties = context.getBean(DataSourceProperties.class);
        changeEvent.changedKeys().stream().forEach(s -> {
            if (s.contains("spring.datasource.url")) {
                dataSourceProperties.setUrl(changeEvent.getChange(s).getNewValue());
            }
        });
        refreshScope.refresh("dataSource");
    }

    @RefreshScope
    @Bean
    public DataSource dataSource(DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
}
