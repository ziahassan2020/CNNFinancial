Feature: CNN Business Check hypertext link Automation

Description: Automate the CNN Business Website Top Hypertext Links

Background: User is on CNN Business Website
Given User setup the browser
And User on CNN Business Website

Scenario: Check the Market hypertext links
When User Clicks on Market Link
Then User is on Market Webpage

Scenario: Check the Tech hypertext links
When User Clicks on Tech Link
Then User is on Tech Webpage

Scenario: Check the Media hypertext links
When User Clicks on Media Link
Then User is on Media Webpage

Scenario: Check the Success hypertext links
When User Clicks on Success Link
Then User is on Success Webpage

Scenario: Check the Perspective hypertext links
When User Clicks on Perspective Link
Then User is on Perspective Webpage

Scenario: Check the Video hypertext links
When User Clicks on Video Link
Then User is on Video Webpage