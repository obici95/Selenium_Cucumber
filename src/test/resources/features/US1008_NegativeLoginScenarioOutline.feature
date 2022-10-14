Feature: US1008 kullanici yanlis sifre ve kullanici adiyla giris yapamaz

  @negative
  Scenario Outline: Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz
    
    Given kullanici "brcUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
    |username   |password|
    |a@gmail.com|12346|
    |b@gmail.com|13246|
    |c@gmail.com|78974|
    |d@gmail.com|78564|
    |e@gmail.com|41454|


