package com.testapp.municipalitytax.converter.domainToEntity;

import com.testapp.municipalitytax.domain.MunicipalityTax;
import com.testapp.municipalitytax.domain.Schedule;
import com.testapp.municipalitytax.entity.TaxEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MunicipalityTaxToTaxEntityConverter implements Converter<MunicipalityTax, TaxEntity> {
    @Override
    public TaxEntity convert(MunicipalityTax source) {
        throw new UnsupportedOperationException();
    }

    private LocalDate scheduleToDate(LocalDate startDate, Schedule schedule){
        return switch (schedule) {
            case YEARLY -> startDate.plusYears(1).minusDays(1);
            case MONTHLY -> startDate.plusMonths(1).minusDays(1);
            case WEEKLY -> startDate.plusWeeks(1).minusDays(1);
            case DAILY -> startDate;
        };
    }
}
