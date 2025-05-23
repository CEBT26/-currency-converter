package com.cebtAlura.currencyConverter;

/* Record that received the external objects:
    result only to determine if was a correct connection
    conversion_rates Kinds on currencies
 */
public record exchangeApiInformation(String result, converter conversion_rates) {
}
