Feature: US1001 Kullanici database e baglanip bilgileri okuyabilir
@db
  Scenario: TC01 kullanic databse baglanip istedigi bilgileri okuyabilmeli

    Given kullanici HMC veri tabanina baglanir
    #database e baglanacagiz
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    # select price from tHotelRoom
    And kullanici "Price" sutunundaki verileri okur
    # 3.adimda database sorgusu sonunda bize dondurulen bilgiyi nasil kullanabilecegimizi gorecegiz
