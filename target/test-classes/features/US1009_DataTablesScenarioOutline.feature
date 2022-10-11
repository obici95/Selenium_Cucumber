Feature: US1009 Datatables sitesine 5 farkli 5 farkli kayit ekleyip giris yapalim

  @datatable
  Scenario Outline: TC13 5 farkli kayit girisi yapabilmeli
    
    Given kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<isim>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<soyisim>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And office bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<isim>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<isim>" oldugunu dogrular
    And kullanici 1 sn bekler
    And sayfayi kapatir

    Examples:
    |isim     |soyisim |position|office  |extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara  |UI       |2022-10-11 |100000|
    |Berk     |Can     |tester  |istanbul|api      |2022-05-05 |110000|
    |Huseyin  |Kacmaz  |BA      |berlin  |-        |2022-06-05 |99000 |
    |Fatih    |Sagin   |Po      |berlin  |-        |2022-03-12 |450000|
    |Ahmet    |Kaya    |Testrer |ankara  |database |2022-09-05 |150000 |

