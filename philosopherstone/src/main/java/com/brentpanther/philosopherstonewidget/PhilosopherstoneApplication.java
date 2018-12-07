package com.brentpanther.philosopherstonewidget;

import com.brentpanther.cryptowidget.Ids;
import com.brentpanther.cryptowidget.Prefs;
import com.brentpanther.cryptowidget.WidgetApplication;

/**
 * Created by brentpanther on 5/10/17.
 */

public class PhilosopherstoneApplication extends WidgetApplication {

    private PhilosopherstoneIds ids;

    @Override
    public void onCreate() {
        super.onCreate();
        ids = new PhilosopherstoneIds();
    }

    @Override
    public Ids getIds() {
        return ids;
    }

    @Override
    public Prefs getPrefs(int widgetId) {
        return new PhilosopherstonePrefs(this, widgetId);
    }
}
