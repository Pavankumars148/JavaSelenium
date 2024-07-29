Feature: Nopcommerce

  @ama43
  Scenario Outline: Nc_01 User validate all the components in home page
    Given user login to the application:"<username>"
    Then user validate all the components

    Examples:
      | username |
      | pavan148 |

  @ama4353
  Scenario: Nc_02 User validate all the components in home page
    Given user login to the application:"<username>"
    Then user validate all the components

