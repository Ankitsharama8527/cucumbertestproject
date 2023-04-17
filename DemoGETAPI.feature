  Feature: verify the get calls in posts API

    Scenario Outline: Get Call verify all post
      Given Get all posts '<url>'
      Then Response Code should be '<code>'

      Examples:
      | url | code |
      | /posts | 200|
