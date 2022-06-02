# LayBuy Search Shops

Project Title – Validate the search output of shops

Description – The purpose of this project is to validate the rental search output and confirm the output meets the acceptance criteria.

Prerequisites

- Eclipse – Script Editor that can be download (the latest version) from internet.
- Cucumber plugins – Add as an external jar files to project so that BDD feature files and step definitions can be build. This can be downloaded from internet (the latest version).
- Selenium plugins – Add as a external jar files to integrate with cucumber. This can be downloaded from internet (the latest version).

Installing

- Install latest Eclipse version.
- Add cucumber pluigns as an external jars to build path.
- Add selenium plugins.
- Running the tests – Execute the LayBuyShopSearch.java test cases in Eclipse in order to validate the test results.

These test cases are verifying whether below acceptance criteria is met.

Acceptance Criteria

- I will navigate to laybuy.com
- I will search shops in LayBuy web site
- I will provide search details
- I will check the options given to me in LayBuy web site
- I will open one of the shop tile

Step 1 – Created feature file laybuysearch.feature to provide the BDD steps with cucumber. This will explain the steps that an end user will perform that meets the acceptance criteria.

Step 2 - Created step definition class LayBuyShopSearch.java with the step skelyton for each step defined in the feature file. Further, the selenium web driver is set up as the first thing in the script and laybuy is launched to perform the search.

Step 3 - Created the object repository ObjectRepo.java to keep all the web elements identifed within the web pages and the expected methods for each web element.

Step 4 - Updated LayBuyShopSearch.java skelyton to call the methods related to the the web elements and include the assertion to check the returned directory tiles count and new window is opening corresponding to the selected directory tile.

Special notes:

1. The user inputs are parametrized in the feature file so that those can be pass to methods to perform actions.
2. The menu link option is taken from the user input. Hence the dynamic xpath is set to this web element to use the user inputs.
3. Due to my machine state, I was unable to run the code and debug to validate any scripting errors. It'll be good to set this up in a machine with better resources and execute to fix any scripting errors.
4. Further improvments to this solution are listed below,
  - Have private methods for web elements so that those methods can be called in more secure manner.
  - This git repository is not set up to integrate with CI/CD pipeline. This can be enahnce to integrate with a CI/CD piepline and get the deployment pipeline kick off once the pull request approvals are in place. Further, merge to master branch from the feature branch can be done once the deployment is successful. So that this set up can be used with better version controlling when the repository is used/ updated by many users.

Author – Ayesha Jayawardena
