
Java 11 ile derlenmiştir.
Testleri maven üzerinden direk mvn komutlari ile calistirabilirsiniz.

```
mvn install
```

diger bir yöntem ise testng.xml dosyasını TestNG frameworkü üzerinden çalıştırdığınızda

src/test/resources/features altında bulunan

integrationCase ve testCase BDD senaryoları çalıştırılacaktır.

Testler sonrasında target/cucumber-reports/cucumber-pretty/index.html adresinden testlere ait rapora ulaşabilirsiniz.
Testler sonrasında target/cucumber-reports/cucumber-html-reports/overview-features.html adresinden testlere ait rapora ulaşabilirsiniz.

Testlerde eğer hata olusursa hata test-output klasörü altında ekran görüntüsü alınarak tutulmaktadır.