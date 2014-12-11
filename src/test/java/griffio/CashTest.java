package griffio;

import com.google.common.testing.EqualsTester;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class CashTest {

    @Test
    public void hashcode_equals_by_value() {

        new EqualsTester()
                .addEqualityGroup(
                        Cash.create(Currency.getInstance(Locale.UK), BigDecimal.ZERO),
                        Cash.create(Currency.getInstance(Locale.UK), new BigDecimal("0")))
                .addEqualityGroup(
                        Cash.create(Currency.getInstance(Locale.UK), new BigDecimal("10.50")),
                        Cash.create(Currency.getInstance(Locale.UK), new BigDecimal("10.5012")))
                .addEqualityGroup(
                        Cash.create(Currency.getInstance(Locale.US), new BigDecimal("10.50")),
                        Cash.create(Currency.getInstance(Locale.US), new BigDecimal("10.5012")))
                .testEquals();
    }

}
