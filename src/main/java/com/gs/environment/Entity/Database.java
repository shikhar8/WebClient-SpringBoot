package com.gs.environment.Entity;




public class Database {

    String service;
    String db;
    String schema;

    public Database(String service, String db, String schema) {
        this.service = service;
        this.db = db;
        this.schema = schema;
    }

    public Database() {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
