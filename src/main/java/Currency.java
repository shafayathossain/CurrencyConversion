import com.tunyk.currencyconverter.BankUaCom;
import com.tunyk.currencyconverter.api.CurrencyConverter;
import com.tunyk.currencyconverter.api.CurrencyConverterException;

import static com.tunyk.currencyconverter.api.Currency.EUR;
import static com.tunyk.currencyconverter.api.Currency.USD;

public class Currency {

    public static void main(String[] args) throws CurrencyConverterException {
        CurrencyConverter currency = new BankUaCom(USD, EUR);

        System.out.println(currency.convertCurrency((float) 30));
    }
}
