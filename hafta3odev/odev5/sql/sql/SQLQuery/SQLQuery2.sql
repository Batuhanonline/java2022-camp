--Select

Select ContactName Adi,CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City = 'London'

Select * from Products where CategoryID = 1 or CategoryID = 3

Select * from Products where CategoryID = 1 and UnitPrice >= 10



Select * from Products order by UnitPrice asc  --ascending artan sırayla

Select * from Products where CategoryID = 1 order by UnitPrice desc  --descending azalan sırayla



Select count(*) from Products --tüm satırları say

Select count(*) from Products where CategoryID = 1



Select CategoryID, count(*) from Products group by CategoryID

Select CategoryID, count(*) from Products group by CategoryID having count(*)<10

Select CategoryID, count(*) from Products where UnitPrice > 20 group by CategoryID having count(*)<10




Select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.UnitPrice > 10

-- DTO Data Transformation Object

-- inner join sadece iki tabloda eşleşen data varsa getirme işlemi yapar


Select * from Products p left join [Order Details] od on p.ProductID = od.ProductID

Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

--birden fazla tabloyu join etme

Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID

