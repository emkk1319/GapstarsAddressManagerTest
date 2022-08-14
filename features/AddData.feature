Feature: Add Data

  Background: Below are the common steps for each scenario (Add Data steps)
    Given User launch chrome browser
    When User opens URL "https://conxillium.github.io/AddressManager/login"

  #Test case 5, Test case 7
  @AddNewData
  Scenario Outline: Verify that the user should be able to add a new record
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    When User clicks on Add New Button
    Then User navigated to Add Data page
      | pageTitle |
      | Add Data |

    When Enter User details
      | fullName | age | address | birthday | country | expertise | gender |
      | Koshila Edirisooriya | 29 | 4/2, Sawmill road, Jamburaliya, Madapatha | 2015-Aug-19 | Sri Lanka | JAVA | FEMALE |
      |                      |    |                                           |            |           | GIT  |      |

    And Click on Submit button
    Then User redirected to the View Data page
      | pageTitle |
      | View Data |

    # Verify added record is  displaying
    Then Check that the New record Successfully added to the system
      | fullName | country |
      | Koshila Edirisooriya | Sri Lanka |

    Examples:
      | username | password |
      | admin | admin@123 |


    #Test case 6
    @MandatoryFieldCheck
    Scenario Outline: Verify that the Address field is mandatory
      And User enters Username as "<username>" and Password as "<password>"
      And Click on Login
      When User clicks on Add New Button
      And Click on Submit button
      Then Check that the address field is mandatory

      Examples:
        | username | password |
        | admin | admin@123 |