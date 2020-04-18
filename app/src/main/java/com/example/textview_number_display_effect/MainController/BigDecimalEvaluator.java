package com.example.textview_number_display_effect.MainController;

import android.animation.TypeEvaluator;

import java.math.BigDecimal;

public class BigDecimalEvaluator implements TypeEvaluator {
    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        BigDecimal start = (BigDecimal) startValue;
        BigDecimal end = (BigDecimal) endValue;
        BigDecimal result = end.subtract(start);
        return result.multiply(new BigDecimal("" + fraction)).add(start);
    }
}