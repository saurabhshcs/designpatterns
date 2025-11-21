package com.saurabhshcs.adtech.designpatterns.structural.decorator;

import com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType;

import java.math.BigDecimal;

public interface BidCalculator {
    BigDecimal calculate(BigDecimal budget, BidStrategyType strategy);
}
