package com.saurabhshcs.adtech.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType.CPC;
import static com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType.CPM;

class BaseBidCalculatorTest {

    @Test
    void cpmProducesLowerBidThanCpc() {
        BidCalculator calc = new BaseBidCalculator();
        BigDecimal cpcBid = calc.calculate(BigDecimal.valueOf(1000), CPC);
        BigDecimal cpmBid = calc.calculate(BigDecimal.valueOf(1000), CPM);
    }

}