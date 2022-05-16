package com.example.demo;

import com.example.demo.dto.Animal;
import com.example.demo.dto.Dog;
import com.example.demo.dto.Snake;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class PayloadDeserializer extends StdDeserializer<Animal> {
    protected PayloadDeserializer() {
        this(null);
    }

    protected PayloadDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Animal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        final JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        if (node.has("legs")) {
            Integer legs = (Integer) (node.get("legs")).numberValue();
            String furColor = node.get("furColor").asText();

            return new Dog(legs, furColor);
        } else {
            Boolean isLethal = Boolean.valueOf(node.get("isLethal").textValue());
            return new Snake(isLethal);
        }
    }

}
