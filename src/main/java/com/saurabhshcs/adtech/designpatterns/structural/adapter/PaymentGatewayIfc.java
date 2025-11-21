package com.saurabhshcs.adtech.designpatterns.structural.adapter;

import com.saurabhshcs.adtech.designpatterns.structural.adapter.common.PaymentProvider;

import java.math.BigDecimal;
import java.util.UUID;

public interface PaymentGatewayIfc {
    Boolean charge(UUID accountId, BigDecimal amount, PaymentProvider provider);
}
