package com.github.adetiamarhadi.sagacore.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FetchUserPaymentDetailsQuery {

    private String userId;
}
