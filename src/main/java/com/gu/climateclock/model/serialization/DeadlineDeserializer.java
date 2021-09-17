package com.gu.climateclock.model.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.gu.climateclock.model.Deadline;

import java.io.IOException;
import java.util.Date;

public class DeadlineDeserializer extends StdDeserializer<Deadline> {

    public DeadlineDeserializer() {
        this(null);
    }

    protected DeadlineDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Deadline deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return new Deadline(jsonParser.readValueAs(Date.class));
    }
}
