package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(
        value = {"meta.condition2"},
        havingValue = "true"
)
public @interface MetaAnnotationCondition2 {
}
