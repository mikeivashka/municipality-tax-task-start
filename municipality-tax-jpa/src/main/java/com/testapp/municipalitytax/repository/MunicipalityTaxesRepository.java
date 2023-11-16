package com.testapp.municipalitytax.repository;

import com.testapp.municipalitytax.domain.MunicipalityTax;
import com.testapp.municipalitytax.domain.TaxesRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class MunicipalityTaxesRepository implements TaxesRepository {

    private final TaxesJpaRepository taxesJpaRepository;
    private final ConversionService conversionService;

    public MunicipalityTaxesRepository(TaxesJpaRepository taxesJpaRepository, ConversionService conversionService) {
        this.taxesJpaRepository = taxesJpaRepository;
        this.conversionService = conversionService;
    }

    @Override
    public MunicipalityTax save(MunicipalityTax municipalityTax) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MunicipalityTax> findByMunicipalityAndDate(String municipality, LocalDate date) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MunicipalityTax> getAllMunicipalityTaxes() {
        throw new UnsupportedOperationException();
    }
}
