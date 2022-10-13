
@practiceClick
Feature: Cucumber Java manipulation

  Scenario: Practice

    Given "https://testpages.herokuapp.com/styled/key-click-display-test.html" adresine gidin
    Then  50 defa click me ye tiklayin
    When  50 defa Space dugmesine basin
    When  Down yazisindaki iki basamakli sayilarin hepsini toplayin
    Then  Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin
    And  sonucun 1100 oldugunu dogrulayin