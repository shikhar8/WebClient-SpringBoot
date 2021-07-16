package com.gs.environment.Entity;




public class Dependency {

    String name;
    String version;
    String classifier;
    String extention;
    String scope;

    public Dependency() {
    }

    public Dependency(String name, String version, String classifier, String extention, String scope) {
        this.name = name;
        this.version = version;
        this.classifier = classifier;
        this.extention = extention;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "name='" + name + '\'' +
                ", classifier='" + classifier + '\'' +
                ", version='" + version + '\'' +
                ", scope='" + scope + '\'' +
                ", extention='" + extention + '\'' +
                '}';
    }
}
