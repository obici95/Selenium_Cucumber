Feature: US1010 herokuapp Delete Testi

  Scenario: TC15 heroapp'dan delete butonu calismali

    Given kullanici "herokuappUrl" anasayfasinda
    And Add Element butonuna basar
    Then "Delete" butonu gorunur oluncaya kadar bekler
    And "Delete" butonu gorunur oldugunu test eder
    Then "Delete" butonuna basar
    And "Delete" butonunun gorunmedigini test eder
    And sayfayi kapatir


