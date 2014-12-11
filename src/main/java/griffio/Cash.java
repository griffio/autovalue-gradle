package griffio;

import com.google.auto.value.AutoValue;

import java.math.BigDecimal;
import java.util.Currency;

@AutoValue
public abstract class Cash {

    public abstract Currency currency();
    public abstract BigDecimal value();

    public static Cash create(Currency currency, BigDecimal value) {
        return null;
    }

}
