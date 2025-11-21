package com.saurabhshcs.adtech.designpatterns.structural.decorator;

import com.saurabhshcs.adtech.designpatterns.structural.decorator.common.BidStrategyType;

import java.math.BigDecimal;

public class AuditedBidCalculator implements BidCalculator{
    private final BidCalculator delegate;

    public AuditedBidCalculator(BidCalculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public BigDecimal calculate(BigDecimal budget, BidStrategyType strategy) {
        BigDecimal bid = delegate.calculate(budget, strategy);
        // audit side-effect (e.g., log to monitoring system)
        return bid;
    }}
