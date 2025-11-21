package com.saurabhshcs.adtech.designpatterns.structural.decorator;

import com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuditedBidCalculatorTest {

    @Test
    void auditedBidMatchesBaseCalculation() {
        BidCalculator calc = new AuditedBidCalculator(new BaseBidCalculator());
        assertEquals(BigDecimal.valueOf(50), calc.calculate(BigDecimal.valueOf(1000), BidStrategyType.CPC));
    }
}