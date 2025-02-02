package com.dtflys.forest.http.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ForestModel {

    private final List<Object> models = new LinkedList<>();

    private final Map<String, ForestModelProperty> properties = new HashMap<>();

    public List<Object> getModels() {
        return models;
    }

    public Map<String, ForestModelProperty> getProperties() {
        return properties;
    }
}
