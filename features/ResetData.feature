Feature: Reset Data

  Background: Below are the common steps for each scenario (Reset Data steps)
    Given User launch chrome browser
    When User opens URL "https://conxillium.github.io/AddressManager/login"

  #Test case 13
  @ClearFormData
  Scenario Outline: Vefify that the should be able to clear entered data to the form

    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    When User clicks on Add New Button
    When Enter User details
      | fullName | age | address | birthday | country | expertise | gender |
      | Hanz Peter | 29 | Rognervegen 104, Trondheim | 2012-08-19 | Norway | JAVA | MALE |
      |              |    |                              |            |        | C#   |      |

    And Click on Reset button
    Then Check that the entered form data cleared
    And Filter data by full name with filter type 'Contains'
    # This steps will be failed since, when the user clicks on Reset button, Country field selected to the country as
    # United Arab Emirates instead of resetting


    Examples:
      | username | password |
      | admin | admin@123 |

