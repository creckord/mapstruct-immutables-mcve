package de.postadress.ars;

import java.time.LocalDate;

import org.immutables.value.Value;

@Value.Immutable
public abstract class ValueObject {
    public abstract String getFoo();
    public abstract Long getId();

    public static class Builder extends ImmutableValueObject.Builder {

    }
}
