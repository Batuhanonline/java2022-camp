# SQL 
### RDBMS (relational database management system)
- Oracle
- SqlServer
- MySql
- Postgresql
- Access
ANSI SQL standartı ile yazılmaları gerekir. Düzgün yazılmış ise birine yazılmış sql kodu diğerinde de çalışır. 
Diğer sql eklentileri ise PlSql ve T-Sql dir.
### NoSql
- MongoDb
- Firebase
- DynamoDb

## Sorgu blokları

### Select
- ``Select * from Customers``
<br>
Select ifadesi seç ve getir anlamında kullanılmakta olup, select den sonra gelen ifadenin ise neleri seçeyim demektir. * buarada her şey anlamında kullanılmaktadır. from ise nereden seçeceğimizi belirler.
<br>

- ``Select ContactTitle,ContactName from Customers``
<br>
Bu sorgumuz ise, Customers adlı tablodan ContactTitle ve ContactName sütunlarını getirmektedir.
<br>

- ``Select ContactTitle Adi,ContactName SirketAdi, City Sehir from Customers``
<br>
Yaptığımız sorgularda bellekte yeni bir tablo oluştuğundan, bu oluşan tabloların sütunlarına yazdığımız sorgularda isimler verebilmekteyiz.
<br>

### Where
- ``Select * from Customers where City = 'London'``
<br>
Sorgularda gelecek olan yanıtlar arasında bir filtre görevi görmektedir. Yazdığımız sorguda Customers adlı tablodan City sütunundaki değeri "London" olan satırların gelmesini sağlamaktadır.
<br>

- ``Select * from Products where CategoryID = 1 or CategoryID = 3``
<br>
Where koşuluyla or(ya da) parametresini kullanabilmekteyiz. Koşullardan her hangi birinin karşılandığı durumlardaki satırları getirir.
<br>

- ``Select * from Products where CategoryID = 1 and UnitPrice >= 10``
<br>
Where koşuluyla and(ve) parametresini kullanabilmekteyiz. Koşulların her ikisininde karşılanması halinde olan satırları getirir.
<br>

### Order by
- ``Select * from Products order by UnitPrice asc``
<br>
Order by parametresiyle yazdıracağımız değerleri sıraya sokabiliriz. Sonuna eklemiş olduğumuz "asc" ifadesiyle artan sırayla sıralar.
<br>

- ``Select * from Products where CategoryID = 1 order by UnitPrice desc``
<br>
Sonuna eklemiş olduğumuz "desc" ifadesiyle azalan sırayla sıralar. Ve aynı zamanda diğer sorgu parametreleriyle beraber kullanabiliriz.
<br>

### count()
- ``Select count(*) from Products``
<br>
count() ile satır sayma işlemi yapabiliriz. Yazmış olduğumuz tabloda kaç satır veri olduğunu bize geri dönecektir.
<br>

- ``Select count(*) from Products where CategoryID = 1``
<br>
Aynı zamanda where sorgusu kullanılabilir. Products tablosunda CategoryID si 1 olan kaç satır veri olduğunu geri dönecektir.
<br>

### Group by
- ``Select CategoryID, count(*) from Products group by CategoryID``
<br>
Group by komutu ile aynı değerlere sahip verileri gruplayabiliriz. Yazdığımız komut ile kategori id ve yanına o kategoride kaç ürün olduğunu yazdıracaktır.
<br>

- ``Select CategoryID, count(*) from Products group by CategoryID having count(*)<10``
<br>
Having komutu gruplandırılan veriler üzerinde fonksiyonlar ile yazılacak koşul ifadelerininn gerçekleştirilmesi için kullanılır. Group by komutu ile birlikte kullanılabilir.
<br>

- ``Select CategoryID, count(*) from Products where UnitPrice > 20 group by CategoryID having count(*)<10``
<br>
Having komutu where komutu ile kullanıldığı zamanlarda ilk önce where komutu çalışır.
<br>

### Inner join
- ``Select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID``
<br>
İki ilişkili tabloyu birleştirme işlemini inner join ile yapmaktayız. 
<br>

- ``Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID``
<br>
Çağıralacak olan sütunları seçebiliriz.
<br>

- ``Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.UnitPrice > 10``
<br>
Where komutu ile birlikte kullanılabilirler.
<br>

- Birden fazla tabloyu join etme

- ``Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID``
<br>
Yukarıdaki sorgu komutunda olduğu gibi 3 farklı ilişkili tabloyu birbirine bağlayıp yeni tablo oluşturabiliriz.
<br>

- DTO Data Transformation Object

- inner join sadece iki tabloda eşleşen data varsa getirme işlemi yapar

### Left join
- ``Select * from Products p left join [Order Details] od on p.ProductID = od.ProductID``
<br>
İki tabloyu birleştirmenin diğer bir yolu ise left joindir. Sol tablonun hepsini alıp sağ ile birleştirir.
<br>

- ``Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null``
<br>
Where komutu yine aynı çalışır. Örnek sorgu komutunda bütün müşterileri alıp orders tablosunda olmayanları yazdırmaktayız.
<br>

### Right join
-  left join ile right join birbirlerine benzerler, sadece biri soldaki, diğeri sağdaki tablonun tamamını alır.
