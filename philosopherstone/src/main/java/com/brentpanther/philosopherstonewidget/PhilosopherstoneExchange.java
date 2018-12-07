package com.brentpanther.philosopherstonewidget;

import com.brentpanther.cryptowidget.Exchange;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.brentpanther.cryptowidget.ExchangeHelper.getJSONObject;


/**
 * Created by brentpanther on 5/10/17.
 */

enum PhilosopherstoneExchange implements Exchange {

    FREIEXCHANGE(R.array.currencies_freiexchange, "freiexchange") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject("https://freiexchange.com/api/public/PHS");
            return obj.getJSONObject("public").getString("last");
            /*return obj.getString("last");*/
            /*return obj.getJSONObject("Data").getString("LastPrice");*/
        }
    },
/*
    BITBAY(R.array.currencies_bitbay, "bitbay") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = String.format("https://bitbay.net/API/Public/PHS%s/ticker.json", currencyCode);
            return getJSONObject(url).getString("last");
        }
    },
    BITFINEX(R.array.currencies_bitfinex, "bitfinex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject("https://api.bitfinex.com/v1/ticker/ethusd");
            return obj.getString("last_price");
        }
    },
    BITSO(R.array.currencies_bitso, "bitso") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONArray payload = getJSONObject("https://api.bitso.com/v3/ticker/").getJSONArray("payload");
            for (int i = 0; i < payload.length(); i++) {
                JSONObject obj = payload.getJSONObject(i);
                if (obj.getString("book").equals("eth_mxn")) {
                    return obj.getString("last");
                }
            }
            return null;
        }
    },
    BITSTAMP(R.array.currencies_bitstamp, "bitstamp") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = String.format("https://www.bitstamp.net/api/v2/ticker/phs%s", currencyCode.toLowerCase());
            return getJSONObject(url).getString("last");
        }
    },
    BITTREX(R.array.currencies_bittrex, "bittrex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = "https://bittrex.com/api/v1.1/public/getticker?market=USDT-PHS";
            return getJSONObject(url).getJSONObject("result").getString("Last");
        }
    },
    BRAZILIEX(R.array.currencies_braziliex, "braziliex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = "https://braziliex.com/api/v1/public/ticker/eth_brl";
            return getJSONObject(url).getString("last");
        }
    },
    BTER(R.array.currencies_bter, "bter") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = "https://data.bter.com/api2/1/ticker/eth_cny";
            return getJSONObject(url).getString("last");
        }
    },
    CEXIO(R.array.currencies_cexio, "cexio") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            return getJSONObject(String.format("https://cex.io/api/last_price/PHS/%s", currencyCode)).getString("lprice");
        }
    },
    COINBASE(R.array.currencies_coinbase, "coinbase") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject(String.format("https://api.coinbase.com/v2/prices/PHS-%s/spot", currencyCode));
            return obj.getJSONObject("data").getString("amount");
        }
    },
    COINNEST(R.array.currencies_coinnest, "coinnest") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = "https://api.coinnest.co.kr/api/pub/ticker?coin=phs";
            return getJSONObject(url).getString("last");
        }
    },
    ETHEXINDIA(R.array.currencies_phsexindia, "ethex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject("https://api.ethexindia.com/ticker");
            return obj.getString("last_price");
        }
    },
    GATECOIN(R.array.currencies_gatecoin, "gate") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONArray tickers = getJSONObject("https://api.gatecoin.com/Public/LiveTickers").getJSONArray("tickers");
            String code = "PHS" + currencyCode;
            for (int i = 0; i < tickers.length(); i++) {
                JSONObject obj = tickers.getJSONObject(i);
                if (obj.getString("currencyPair").equals(code)) {
                    return obj.getString("last");
                }
            }
            return null;
        }
    },
    GEMINI(R.array.currencies_gemini, "gemini") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            return getJSONObject("https://api.gemini.com/v1/pubticker/ethusd").getString("last");
        }
    },
    HITBTC(R.array.currencies_hitbtc, "hitbtc") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            return getJSONObject(String.format("https://api.hitbtc.com/api/1/public/PHS%s/ticker", currencyCode)).getString("last");
        }
    },
    INDEPENDENT_RESERVE(R.array.currencies_independentreserve, "ind. reserve") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = "https://api.independentreserve.com/Public/GetMarketSummary?primaryCurrencyCode=phs&secondaryCurrencyCode=%s";
            return getJSONObject(String.format(url, currencyCode)).getString("LastPrice");
        }
    },
    KRAKEN(R.array.currencies_kraken, "kraken") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject(String.format("https://api.kraken.com/0/public/Ticker?pair=PHS%s", currencyCode));
            JSONObject obj2 = obj.getJSONObject("result").getJSONObject("XETHZ" + currencyCode);
            return (String)obj2.getJSONArray("c").get(0);
        }
    },
    */
    /*
    POLONIEX(R.array.currencies_poloniex, "poloniex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject("https://poloniex.com/public?command=returnTicker");
            return obj.getJSONObject("USDT_phs").getString("last");
        }
    },
    */
    POLONIEX(R.array.currencies_poloniex, "poloniex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            JSONObject obj = getJSONObject("https://freiexchange.com/api/public/PHS");
            return obj.getJSONObject("public").getString("last");
            /*return obj.getString("last");*/
            /*return obj.getJSONObject("Data").getString("LastPrice");*/
        }
    },
    /*
    QUIONE(R.array.currencies_quione, "quione") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = String.format("https://api.quoine.com/products/code/CASH/PHS%s", currencyCode);
            return getJSONObject(url).getString("last_traded_price");
        }
    },
    THEROCK(R.array.currencies_therock, "therock") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String url = String.format("https://api.therocktrading.com/v1/funds/PHS%s/ticker", currencyCode);
            return getJSONObject(url).getString("last");
        }
    },
    WEX(R.array.currencies_wex, "wex") {
        @Override
        public String getValue(String currencyCode) throws Exception {
            String pair = String.format("eth_%s", currencyCode.toLowerCase());
            String url = String.format("https://wex.nz/api/3/ticker/%s", pair);
            return getJSONObject(url).getJSONObject(pair).getString("last");
        }
    }*/;

    private final int currencyArrayID;
    private String label;

    PhilosopherstoneExchange(int currencyArrayID, String label) {
        this.currencyArrayID = currencyArrayID;
        this.label = label;
    }

    @Override
    public String getValue(String currencyCode) throws Exception {
        return null;
    }

    @Override
    public int getCurrencies() {
        return currencyArrayID;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
