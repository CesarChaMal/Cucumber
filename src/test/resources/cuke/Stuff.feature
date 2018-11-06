Feature: It should do stuff
Scenario: Doing stuff in multiple steps files
    Given I start this with a count of 3
    When I ponder how many there are
    Then I find there are 3

Scenario: Doing more stuff
    Given I start this with a count of 7
    When I ponder how many there are
    Then I find there are 7

Scenario: Doing stuff that fails
    Given I start this with a count of 7
    When I ponder how many there are
    Then I find there are 7

Scenario: Building Objects
    Given I have these soldiers
    | name | rank     |
    | Rock | Sergeant |
    | Tom  | Major    |


