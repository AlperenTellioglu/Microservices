package com.microservices.account_service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spcloud.cassandra.keyspace.name}")
    private String keyspaceName;
    
    @Value("${spcloud.cassandra.port}")
    private int port;
    
    @Value("${spring.data.cassandra.contact-points}")
    private String contactPoint;

    @Override
    protected String getKeyspaceName() {
        // Keyspace adını çift tırnak içine almak için kaçış karakterleri ekleyin
        return "\"" + keyspaceName + "\"";
    }
    
    @Override
    protected int getPort() {
        return port;
    }
    
    @Override
    protected String getContactPoints() {
        return contactPoint;
    }
    
    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

}
