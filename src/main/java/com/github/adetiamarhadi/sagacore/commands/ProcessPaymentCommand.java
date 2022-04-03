package com.github.adetiamarhadi.sagacore.commands;

import com.github.adetiamarhadi.sagacore.model.PaymentDetails;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProcessPaymentCommand {

    private final String paymentId;
    private final String orderId;
    private final PaymentDetails paymentDetails;
}
