package com.bulain.activiti.pojo;

import com.bulain.activiti.model.Category;

public class CategoryView extends Category{
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
