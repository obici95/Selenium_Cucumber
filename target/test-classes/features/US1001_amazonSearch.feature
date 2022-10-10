
@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar


  @nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And souclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java
  Scenario: TC02 kullanici amazonda Java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And souclarin Java icerdigini test eder
    And sayfayi kapatir

   @iphone @ikisi
  Scenario: TC03 kullanici amazonda iphone aratir
    When kullanici amazon anasayfasinda
    And kullanici iphone icin arama yapar
    Then souclarin iphone icerdigini test eder
     And dryRun'i dener
     And dryRun'i dener1
     And dryRun'i dener2
    And sayfayi kapatir
