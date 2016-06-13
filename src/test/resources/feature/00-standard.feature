Feature: Standard documentation

  @standard
  Scenario: OD standard

    Given an standard OD
    Then the OD should have the following specifics
      | Departure | Arrival   | Comfort Class |
      | Paris     | Marseille | 2nd           |
