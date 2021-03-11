package org.bf2.cos.fleetshard.api.connector;

import java.util.List;

import org.bf2.cos.fleetshard.api.connector.support.Condition;

import io.sundr.builder.annotations.Buildable;

@Buildable(builderPackage = "io.fabric8.kubernetes.api.builder")
public abstract class ConnectorStatus {
    private List<Condition> conditions;

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public enum ConditionType {
        Installing,
        Validating,
        Augmenting,
        Running,
        Paused,
        Deleted,
        Error;
    }
}