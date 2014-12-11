package griffio;

import com.google.auto.value.AutoValue;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Cash value with scaling of 2 rounded up for input values.
 * package private constructor
 */
@AutoValue
public abstract class Cash {

    Cash() {}

    public abstract Currency currency();
    public abstract BigDecimal value();

    public static Cash create(Currency currency, BigDecimal value) {
        return new AutoValue_Cash(currency, value.setScale(2, BigDecimal.ROUND_HALF_UP));
    }

}
