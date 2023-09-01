package de.postadress.ars;

import org.mapstruct.Mapper;

@Mapper
public abstract class Converter {

    public abstract ValueObject convert(ValueEntity valueEntity);

}
