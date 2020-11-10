Feature: Redfin Application

Scenario Outline: Verify Redfin Search
Given User is on Redfin Homepage for "<TestName>"
Then Validate Homepage with "<PageTitle>"
And Enter "<City>" In Search Box and press Enter
Then Validate Popup 
When On Popup select "<PopupCity>"
Then Validate Real Estate Page as "<RealEstatePage>"
And asserto Search Box has "<cityname>"
When "<MinPrice>" and "<MaxPrice>" are selected
Then Verify all homes are from "<SearchResult>"

Examples:
|TestName|PageTitle|City|PopupCity|RealEstatePage|cityname|MinPrice|MaxPrice|SearchResult|
|Test1|Real Estate, Homes for Sale, MLS Listings, Agents|Sunnyvale|https://www.redfin.com/city/19457/CA/Sunnyvale|Sunnyvale Homes for Sale: Sunnyvale, CA Real Estate|Sunnyvale|$800k|$950k|/CA/Sunnyvale/|
|Test2|Real Estate, Homes for Sale, MLS Listings, Agents|Sunnyvale|https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale|Sunnyvale, Dallas, TX Homes for Sale & Real Estate|Sunnyvale|$600k|$800k|/TX/Dallas|