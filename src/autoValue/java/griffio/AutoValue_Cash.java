
package griffio;

import java.math.BigDecimal;
import java.util.Currency;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Cash extends Cash {

  private final Currency currency;
  private final BigDecimal value;

  AutoValue_Cash(
      Currency currency,
      BigDecimal value) {
    if (currency == null) {
      throw new NullPointerException("Null currency");
    }
    this.currency = currency;
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @Override
  public Currency currency() {
    return currency;
  }

  @Override
  public BigDecimal value() {
    return value;
  }

  @Override
  public String toString() {
    return "Cash{"
        + "currency=" + currency + ", "
        + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Cash) {
      Cash that = (Cash) o;
      return (this.currency.equals(that.currency()))
           && (this.value.equals(that.value()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= currency.hashCode();
    h *= 1000003;
    h ^= value.hashCode();
    return h;
  }

}
