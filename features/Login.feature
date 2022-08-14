Feature: Login

  Background: Below are the common steps for each scenario (login steps)
    Given User launch chrome browser
    When User opens URL "https://conxillium.github.io/AddressManager/login"

    #Test case 1
  @Login
  Scenario Outline: Verify that the user able to login to the system successfully with correct username and correct password
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    Then Check Login is success
    |PageTitleOfThePageAfterLogin|
    |  View Data |

    Examples:
      | username | password |
      | admin | admin@123 |


  #Following negative scenarios will 'fail'

    #Test case 2
  @LoginWithIncorrectUsernameAndIncorrectPassword
  Scenario Outline: Verify that the user not able to login to the system with incorrect username and incorrect password
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    And Verify Error in login
    Examples:
      | username | password |
      | abc | abc1234 |


  #Test case 3
  @LoginWithIncorrectUsernameCorrectPassword
  Scenario Outline: Verify that the user not able to login to the system with incorrect username and correct password
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    And Verify Error in login

    Examples:
      | username | password |
      | abc | admin@123 |


  #Test case 4
  @LoginWithCorrectUsernameIncorrectPassword
  Scenario Outline: Verify that the user not able to login to the system with incorrect username and incorrect password
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    And Verify Error in login

    Examples:
      | username | password |
      | admin | abc1234|