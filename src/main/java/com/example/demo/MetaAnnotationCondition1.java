package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(
        value = {"meta.condition1"},
        havingValue = "true"
)
public @interface MetaAnnotationCondition1 {
}
