
  Feature: US1012 web tablosundaki istenen sutunu yazdirma

    @guru
    Scenario: TC16 kullanici sutun basligi ile liste alabilmeli

      Given kullanici "guruUrl" anasayfasinda
      And "% Change", sutunundaki tum degerleri yazdirir
      Then sayfayi kapatir