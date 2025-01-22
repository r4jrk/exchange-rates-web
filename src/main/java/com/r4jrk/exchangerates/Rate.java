package com.r4jrk.exchangerates;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Rate(String no, String effectiveDate, double mid) { }