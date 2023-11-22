# Selenium

Selenium is a open-source framework and a suite of tools designed for automating web browsers. It allows you to control a web browser programmatically, perform various tasks on web applications, and automate the testing of web application.

Selenium is commonly used for web testing but can also be used for web scraping, data extraction, and automating repetitive tasks involving web browsers.



The core component of Selenium is the WebDriver, which acts as a bridge between your code and web browser.

You can use WebDriver to simulate user interactions like clicking buttons, filling forms, navigating between pages, and extracting data from web pages.



## Selector

- XPath
  - //tagname[(expression)]
  - @ Select an attribute - //p[@class="substitute"]
  - ( ) Grouping an XPath expression - //p[(@class="script-1" or @class="script-2") and @class="script-3"]
  - [n] Indicates that a node with index "n" should be selected - //p[1]