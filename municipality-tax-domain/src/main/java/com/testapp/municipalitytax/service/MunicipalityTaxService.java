package com.testapp.municipalitytax.service;

import com.testapp.municipalitytax.domain.TaxesRepository;
import com.testapp.municipalitytax.web.TaxesService;
import com.testapp.municipalitytax.web.payload.AddTaxRequest;
import com.testapp.municipalitytax.web.payload.TaxListResponse;
import com.testapp.municipalitytax.web.payload.TaxResponse;
import com.testapp.municipalitytax.web.payload.UUIDResponse;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class MunicipalityTaxService implements TaxesService {
    private final TaxesRepository taxesRepository;
    private final ConversionService conversionService;

    public MunicipalityTaxService(TaxesRepository taxesRepository, ConversionService conversionService) {
        this.taxesRepository = taxesRepository;
        this.conversionService = conversionService;
    }

    @Override
    public UUIDResponse addTax(AddTaxRequest addTaxRequest) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TaxResponse findTax(String municipality, String date) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TaxListResponse getAllMunicipalityTaxes() {
        throw new UnsupportedOperationException();
    }
}
