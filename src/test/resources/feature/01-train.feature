Feature: Train

  @devis
  Scenario: Devis 1

    Given an standard OD
    When I create the devis
    Then I should receive a ticket reference


  @devis
  Scenario: Devis

    Given a standard OD with the following specifics:
      | Departure | Comfort Class | when         |
      | Lille     | 2nd           | <today + 7d> |
    And a standard passenger
    When I create the devis
    Then I should receive a ticket reference