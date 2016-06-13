Feature: Train

  @devis
  Scenario: Devis

    Given an standard OD with the following specifics:
      | Departure | Comfort Class |
      | Lille     | 2nd           |
    When I create the devis
    Then I should receive a ticket reference