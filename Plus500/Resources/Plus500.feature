Feature: Plus500 Application

Scenario Outline: Validate The Price Range
Given User on LoginPage
When "<Username>" and "<Password>" entered 
Then Login
Given User is on Homepage
When Search for "<Currency Pair>" 
Then Assert Buy Sell Prices within "<X>" and "<Y>"


Examples:
|Username|Password|Currency Pair|
|cm.jnanesh@gmail.com|plus500_jna|GBP/USD|1.2|1.4|

