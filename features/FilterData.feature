Feature: Filter Data

  Background: Below are the common steps for each scenario (Filter Data steps)
    Given User launch chrome browser
    When User opens URL "https://conxillium.github.io/AddressManager/login"

  #Test case 8
  @FilterDataByFullNameTableHeader
  Scenario Outline: Verify that the user should be able to filter data by Full Name from the Table header filter
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login

    Then Click on the filter from the Full Name column

    #User should be able to add the relevant data to test this as expected(incorrect values as well))
    And Filter data by Full Name
      | filterType | filterText | filterOperation | filterCondition | filterConditionText |
      | Equals |Queen Young| |         |                 |


    Examples:
      | username | password |
      | admin | admin@123 |


  #Test case 9
  @FilterDataByCountryTableHeader
  Scenario Outline: Verify that the user should be able to filter data by Country from the Table header filter
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    Then Click on the filter from the Country column

    #User should be able to add the relevant data to test this as expected (incorrect values as well))
    And Filter data by Country
      | filterType | filterText | filterOperation | filterCondition | filterConditionText |
      | Equals |Norway| |         |                 |

    Examples:
      | username | password |
      | admin | admin@123 |


  #Test case 10
  @FilterDataByFilterFullName
  Scenario Outline: Verify that the user should be able to filter data by Full Name master filter
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    When Enter Text to Filters
      |fullNamefilter|Countryfilter|
      | Queen Young |              |
    And Click on Filter button

    # Check the values should be available after the filter
    And Check filtered full name data by master filters
    |FullNameValueShouldAvailable|
    |Queen Young|

    Examples:
      | username | password |
      | admin | admin@123 |


  #Test case 11
  @FilterDataByFilterCountry
  Scenario Outline: Verify that the user should be able to filter data by Country master filter
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login
    When Enter Text to Filters
      |fullNamefilter|Countryfilter|
      |              |  Norway     |
    And Click on Filter button

       # Check the values should be available after the filter
    And Check filtered country by master filters
      |CountryValueShouldAvailable|
      |Norway|


    Examples:
      | username | password |
      | admin | admin@123 |


  #Test case 12
  @FilterDataByBothFullNameAndCountry
  Scenario Outline: User should be able to filter data by both Full Name and Country master filter
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Login

    #User should be able to add the relevant data to test this as expected (incorrect values as well)
    When Enter Text to Filters
      |fullNamefilter|Countryfilter|
      | Queen Young1111   |Russian Federation     |
    And Click on Filter button
     # Check the values should be available after the filter
    And Check filtered both full name and country by master filters
      |FullNameValueShouldAvailable |CountryValueShouldAvailable|
      |                             |                            |

    Examples:
      | username | password |
      | admin | admin@123 |

