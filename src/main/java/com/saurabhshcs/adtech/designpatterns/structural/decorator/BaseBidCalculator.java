package com.saurabhshcs.adtech.designpatterns.structural.decorator;

import com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType;

import java.math.BigDecimal;
import java.util.Objects;

public class BaseBidCalculator implements BidCalculator {
    @Override
    public BigDecimal calculate(BigDecimal budget, BidStrategyType strategy) {
        return strategy == BidStrategyType.CPC
                ? budget.divide(BigDecimal.valueOf(20))
                : budget.divide(BigDecimal.valueOf(20));
    }
}
