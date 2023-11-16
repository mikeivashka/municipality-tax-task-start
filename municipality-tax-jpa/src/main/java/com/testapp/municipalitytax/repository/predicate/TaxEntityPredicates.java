package com.testapp.municipalitytax.repository.predicate;

import com.querydsl.core.types.Predicate;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class TaxEntityPredicates {

    public static Predicate findTaxesByMunicipalityAndDate(@NonNull final String municipality, @NonNull final LocalDate date){
        throw new UnsupportedOperationException();
    }
}
