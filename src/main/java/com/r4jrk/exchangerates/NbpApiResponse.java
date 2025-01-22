package com.r4jrk.exchangerates;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NbpApiResponse(String table, String currency, String code, List<Rate> rates) { }


//    private static final String NBP_API_LINK = "http://api.nbp.pl/api/exchangerates/rates/a/";
// + sCurrencyInput + "/" + formattedDate + "/?format=json");

//    private static final String NBP_API_LINK = "http://api.nbp.pl/api/exchangerates/rates/a/EUR/2025-01-15/?format=json";
// + sCurrencyInput + "/" + formattedDate + "/?format=json");

// {
//     "table": "A",
//     "currency": "euro",
//     "code": "EUR",
//     "rates": [
//       {
//         "no": "009/A/NBP/2025",
//         "effectiveDate": "2025-01-15",
//         "mid": 4.2611
//       }
//     ]
//   }