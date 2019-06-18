Feature: HomePage Test


Background: Open Browser
Given Open Browser and Enter URL
@SomkeTest
Scenario: Going To Home Page
Then Enter Home Page

@End2ENDTest
Scenario: Going To Login Page
Then Enter Login Page

@SomkeTest
Scenario: Going To Companies Page
Then Enter Companies Page

@SomkeTest@End2ENDTest
Scenario: Going To Delias Page
Then Enter Delias Page


Scenario: Going To Logout Page
Then Enter Logout Page


