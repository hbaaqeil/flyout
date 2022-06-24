# flyout

[TestNG](http://testng.org) Integration with BrowserStack.

## Setup

* Clone the repo
* Install dependencies `mvn compile`
* Update `*.conf.json` files inside the `src/test/resources/conf` directory with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)

## Running your tests

- To run a single test, run `mvn test -P single`
- To run parallel tests, run `mvn test -P parallel`


#Purpose
This test access web cloud hosted (private)  site and test form filling with predefined data. Three assertions are tested.

## Notes
* You can view your test results on the [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
* To test on a different set of browsers, check out our [platform configurator](https://www.browserstack.com/automate/java#setting-os-and-browser)
* You can export the environment variables for the Username and Access Key of your BrowserStack account

  ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```
