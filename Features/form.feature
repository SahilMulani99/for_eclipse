Feature: Exam Registration form

  
  Scenario: To verify exam form should get submitted successfully
    Given exam registration website should be launched
    When enter first name and last name of student
    And enter registration number and registered course of student
    And select exam start & exam end date
    And enter comment if any & click on submit button
    Then exam form should be submit
    And browser should be closed


