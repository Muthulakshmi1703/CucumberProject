Feature: Sample tags feature file

@smoke @regression
Scenario: Sample One
Given Sample test one

@sanity @smoke @regression
Scenario: Sample Two
Given Sample test two

@regression @skip
Scenario: Sample Three
Given Sample test three

@sanity @regression
Scenario: Sample Four
Given Sample test four

@sanity @smoke @skip
Scenario: Sample Five
Given Sample test five

