package com.saurabhshcs.adtech.designpatterns.structural.adapter;

import com.saurabhshcs.adtech.designpatterns.structural.adapter.common.PaymentProvider;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AdyenAdapterTest {

    @Test
    void shouldAdyenAdapterAcceptAdyen() {
        PaymentGatewayIfc paymentGateway = new AdyenAdapter();

        assertTrue(paymentGateway.charge(UUID.randomUUID(), BigDecimal.TEN, PaymentProvider.PROVIDER_ADYEN));
    }

    @Test
    void shouldAdyenAdapterNotAcceptStripe() {
        PaymentGatewayIfc paymentGateway = new AdyenAdapter();

        assertFalse(paymentGateway.charge(UUID.randomUUID(), BigDecimal.TEN, PaymentProvider.PROVIDER_STRIPE));
    }
}