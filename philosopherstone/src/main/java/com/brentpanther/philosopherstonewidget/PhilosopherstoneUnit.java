package com.brentpanther.philosopherstonewidget;

import com.brentpanther.cryptowidget.Unit;

/**
 * Created by brentpanther on 5/10/17.
 */

public enum PhilosopherstoneUnit implements Unit {

    PHS;

    @Override
    public double adjust(String amount) {
        return Double.valueOf(amount);
    }
}
