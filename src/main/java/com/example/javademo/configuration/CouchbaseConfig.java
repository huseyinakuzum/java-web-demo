package com.example.javademo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    private final CouchbaseProperty couchbaseProperty;

    public CouchbaseConfig(CouchbaseProperty couchbaseProperty) {
        this.couchbaseProperty = couchbaseProperty;
    }


    @Override
    public String getConnectionString() {
        return couchbaseProperty.getHost();
    }

    @Override
    public String getBucketName() {
        return couchbaseProperty.getBucket().getName();
    }

    @Override
    public String getUserName() {
        return couchbaseProperty.getBucket().getName();
    }

    @Override
    public String getPassword() {
        return couchbaseProperty.getBucket().getPassword();
    }


}
