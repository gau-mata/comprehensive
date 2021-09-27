Feature: Urban Ladder

Scenario: Home page default login
Given User is on "https://www.urbanladder.com/"
When User hover on login and click on login
Then Login page popup is populated
And User enter username as "dumpofr@gmail.com" and password as "comprehensive"
And User clicks on login button

Scenario: searching
When User clicks on searchbox area
Then User enters "dining table"
And User clicks on searchbox icon
And dining table page is displayed

Scenario: sale
When User hovers over sale icon
Then Sale dropdown is displayed
Then User clicks on getsale
And It is verified whether sale page is displayed

Scenario: living
When User hovers over living icon
Then Living dropdown is displayed
Then User clicks on sofaset
And It is verified whether living page is displayed

Scenario: bedroom
When User hovers over bedroom icon
Then bedroom dropdown is displayed
Then User clicks on mattress
And It is verified whether bedroom page is displayed

Scenario: storage
When User hovers over storage icon
Then storage dropdown is displayed
Then User clicks on shopbyrange
And It is verified whether storage page is displayed

Scenario: study
When User hovers over study icon
Then study dropdown is displayed
Then User clicks on studylamps
And It is verified whether study page is displayed

Scenario: kids room
When User hovers over kidsroom icon
Then kidsroom dropdown is displayed
Then User clicks on kidsdecor
And The page title is verified

Scenario: gift cards
When User clicks on gift card
Then gift card page is opened
And gift card title is verified

Scenario: bulk orders
When User clicks on bulk orders
Then bulk order page is opened
And bulk order title is verified