/****** Script para el comando SelectTopNRows de SSMS  ******/
SELECT TOP (6) MAX(DISTINCT prod.cod) as Maximo
FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada
LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod
WHERE ent.cod = 2 and categoria = 'Motor'



SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Entradas]	WHERE cod > 3 ORDER BY cod

SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Entradas]	WHERE cod < 8 ORDER BY cod DESC

SELECT MIN(cod) as cont FROM [AccesoriosNauticos].[dbo].Alarmas

SELECT * FROM (SELECT TOP (6) prod.*
FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada
LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod
WHERE ent.cod = 1 and categoria = 'Electronico' and prod.cod < 25
ORDER BY prod.cod DESC) a ORDER BY a.cod

SELECT TOP (6) MAX(DISTINCT prod.cod) as Maximo
FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada
LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod
WHERE ent.cod = 1 and categoria = 'Electronico'