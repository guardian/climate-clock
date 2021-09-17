package com.gu.climateclock.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gu.climateclock.model.serialization.DeadlineDeserializer;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

@JsonDeserialize(using = DeadlineDeserializer.class)
public class Deadline {

    private final Date deadline;

    public Deadline(Date deadline) {
        this.deadline = deadline;
    }

    public Duration timeUntil() {
        return Duration.between(Instant.now(), deadline.toInstant());
    }

    public int getTotalDays() {
        return (int) timeUntil().toDaysPart();
    }

    public int getYearsPart() {
        return (int) timeUntil().toDaysPart() / 365;
    }

    public int getDaysPart() {
        return (int) timeUntil().toDaysPart() % 365;
    }

    public int getHoursPart() {
        return timeUntil().toHoursPart();
    }

    public int getMinutesPart() {
        return timeUntil().toMinutesPart();
    }

    public int getSecondsPart() {
        return timeUntil().toSecondsPart();
    }
}
