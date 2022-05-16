package com.example.demo.dto;

import com.example.demo.PayloadDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = PayloadDeserializer.class)
public abstract class Animal {
}
