Feature: Kayak Application 

Scenario Outline: Check Origin and Destination Details
Given User On Kayak Website "<TestName>"
When "<Origin>" and "<Destination>" cities are entered
When "<Nearby Origin>" and "<Nearby Destination>" airports are selected
And "<Departure>" and "<Return>" dates are selected
Then Click Search And Validate SearchPage
When Search Result "<N>" is selected
Then Validate Origin and Destination 

Examples:
|TestName|Origin|Destination|Nearby Origin|Nearby Destination|Departure|Return|N|
|Test1|MIA|NYC|FLL|HPN|10/20/2020|10/30/2020|3|
