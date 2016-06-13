Feature: Standard documentation

  @standard
  Scenario: OD standard

    Given an standard OD
    Then the OD should have the following specifics
      | Property      | Value      |
      | Departure     |  Paris     |
      | Arrival       |  Marseille |
      | Comfort Class | 1st        |
