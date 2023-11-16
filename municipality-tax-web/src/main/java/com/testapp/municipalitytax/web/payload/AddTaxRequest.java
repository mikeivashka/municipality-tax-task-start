package com.testapp.municipalitytax.web.payload;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record AddTaxRequest(
        @NotBlank @Size(max = 50) String municipality,
        @Min(0) @Max(1) @Digits(integer = 1, fraction = 2) Double tax,
        String startDate,
        String schedule) {
}
