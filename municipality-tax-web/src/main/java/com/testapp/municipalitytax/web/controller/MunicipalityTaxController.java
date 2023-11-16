package com.testapp.municipalitytax.web.controller;

import com.testapp.municipalitytax.web.TaxesService;
import com.testapp.municipalitytax.web.payload.AddTaxRequest;
import com.testapp.municipalitytax.web.payload.TaxListResponse;
import com.testapp.municipalitytax.web.payload.TaxResponse;
import com.testapp.municipalitytax.web.payload.UUIDResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/taxes")
@Validated
public class MunicipalityTaxController {

    private final TaxesService taxesService;

    public MunicipalityTaxController(TaxesService taxesService) {
        this.taxesService = taxesService;
    }

    /**
     *
     * Adds new municipality tax record
     *
     * @param addTaxRequest body
     *       municipality is case-sensitive
     *       schedule is case-insensitive
     *       date is accepted in format yyyy.mm.dd
     *       tax is between 0 and 1
     *
     * @return UUID of created record
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    UUIDResponse addMunicipalityTax(@Valid @RequestBody AddTaxRequest addTaxRequest){
        return taxesService.addTax(addTaxRequest);
    }

    /**
     *
     * Find municipality tax record by municipality and date
     *
     * @param municipality case-sensitive
     * @param date accepted in format yyyy.mm.dd
     *
     * @return TaxResponse list of taxes applied with chosen municipality and date
     */
    @GetMapping(value = "/{municipality}/{date}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    TaxResponse findMunicipalityTax(@PathVariable("municipality") String municipality,
                                    @PathVariable("date") String date){
        return taxesService.findTax(municipality, date);
    }

    /**
     *
     * Find all municipality taxes
     *
     * @return TaxResponse list of all taxes in all municipalities
     */
    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    TaxListResponse getAllMunicipalityTaxes(){
        return taxesService.getAllMunicipalityTaxes();
    }

}
