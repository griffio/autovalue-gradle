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
    public abstract BigDecimal amount();

    public static Cash create(Currency currency, BigDecimal amount) {
        return new AutoValue_Cash.Builder()
            .currency(currency)
            .amount(amount.setScale(2, BigDecimal.ROUND_HALF_UP))
            .build();
    }

    public static Builder builder() {
        return new AutoValue_Cash.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder currency(Currency currency);
        abstract Builder amount(BigDecimal amount);
        abstract Cash build();
    }

}
