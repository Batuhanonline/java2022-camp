# Kurumsal Mimariler İçin Etkili Veritbanı Tasarımı

- Örnek üzerinden gidilecektir. Senaryonun tanıtımı;

## Gereksinim :ABC Bankasi olarak müsterilerimizin takibini yapabilmeliyiz.

### Kabul Kriterleri:

- İki tip müsterimiz mevcut. Gerçek Müsteriler, Tüzel Müsteriler.
- Gerçek müsteri; MüsteriNo, Ad,Soyad, TcKimlikNo alanlarina sahiptir.
- Tüzel Müsteri; MüsteriNo, Unvan, VergiNo alanlarina sahiptir.
- Müsterilerin adreslerini takip edebilmeliyiz.
- Tüzel Müsterilerin her 6 aylik dönemde bilanço bilgilerini kaydetmeliyiz. Örnegin 3 yillik bir tüzel müsterinin her 6 aya denk gelen 6 adet bilanço kaydi olmalidir. Bilanço bilgisi olarak bilanço tutari ve bilanço tarihi bilgisini tutmak yeterlidir.
- Gerçek müsterilerin bazilari Ticari Faaliyet gerçeklestirmektedir. Bu tip müsterilerimiz için de bilanço takibi yapabilmeliyiz.
- Bir kişinin veya kurumun bankamizin müsterisi olabilmesi için çesitli kanallar mevcuttur. (internet, Șube vb.) Müsterinin hangi kanaldan bankamıza ilk kez katıldığı bilgisini de tutmak istiyoruz.


## Genelde yapılan hatalar
- İki benzer tabloyu yani örnekte belirtdiğimiz gerçek müşteriler, tüzel müşteriler aynı tablo içerisinde tutulmaya çalışıldığında ilk başta sorgu yazarken kolaylık sağlansa da ileri ve komples sorgularda işimizi zorlaştıracaktır. Veri kaçakları oluşturacaktır.

- Veri bütünlüğünü ilişkileri koparmak zorunda kalarak kaybetmek

-Primary key ile Unique key alanlarının  birbirleri ile karıştırılması. Bir tabloda bir tane primary key olması o tablo için yeterli olmalıdır. Benzerinin olmamasını istediğimiz kolonu unique key yaparak veri bozulmalarından kaçınabiliriz.

## Teknikler ve Proje Adımları
---
#### Soyutlama odaklı tasarım tekniği
- Aynı OOP teknikleri ve SOLID yapısında olduğu gibi iki tabloda ortak olacak sütunları base bir tablo içerisinde oluşturulmalıdır. Bu sayede kendimizi tekrar etmemekle beraber yeni bir tip ekleme durumunda rahatlıkla diğer tablolara ya da koda müdahale etmeden ekleyebilmeliyiz.

#### Miras odaklı tasarım tekniği
- Oluşturmuş olduğumuz base tablodan türeteceğimiz tablolar bağlamanın yolu base tablomuzda oluşturduğumuz id sütununu türettiğimiz tablonun primary key sütununa ilişkilendiriyoruz.

- Bu teknikle beraber base tablomuzdan istediğimiz kadar yeni müşteri tipi oluşturabiliriz.

- Base tablodan istek üzerine türettiğimiz müşteri tipleri be ilişkilendirilmesi;  
<br>

![](/images/mirastablo.png)

<br>

#### Bire çok ilişki yapısı
- İsteklerden birisi de adres tablosuydu, base tablodaki bir müşterinin birden çok adresi olabileceğini hesaba kattığımızda, adres tablosunun primary keyi ile base tablonun primary keyini ilişkilendirmemeliyiz. 
- Bunun yerine adres tablosunda bir foreign key oluşturup MusteriId ile ilişkilendirmeliyiz.
<br>

![](/images/birecokiliiski.png)

<br>

#### Primary Key tablo Foreign Key tablo hakkında bilgi tutmaz
- Primary key tabloya yazılacak sorguda foreign key tablo var mı yok mu sorusu sorulması bir hata olur. Bunun yerine daha kompleks sorgu hazırlansa bile tasarım olarak en doğru olanı yeni bir foreign key tablo türetmek olacaktır.

<br>

![](/images/primaryforeigntutmaz.png)

<br>

- Burada GercekMusteriler tablosu altında yeni bir foreign tablo oluşturarak primary key tabloda oluşacak karmaşıkların önüne geçilmektedir.

#### Open Closed prensibinin uygulanması
- Veritabanı tasarımımızı düzgün yaptığımız sürece yeni bir müşteri türü eklediğimizde diğer yazdığımız tablolar hiç bir değişiklik yapmadan yeni oluşturmuş olduğumuz tablo tarafından da kullanılabilir halde olmaktadır. Resimde görüldüğü üzere Sendikalar adlı müşteri türü eklendiği ve base tablomuzla ilişkilendirildiği anda base tabloyla ilişkili tüm tablolar kullanılabilir olmalıdır.

<br>

![](/images/openClosedPrensibi.png)

<br>



---

### Not
- Bir kolon ya null dır ya da değildir.
- MüsteriNo, TcKimlikNo gibi değerleri primary key olarak kullanılmaması gerekiyor.
- Kolay sorgu yapmak için veritabanı tasarımı yapılmamalıdır.