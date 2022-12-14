USE [AccesoriosNauticos]
GO
/****** Object:  Table [dbo].[Alarmas]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Alarmas](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[f_creacion] [date] NOT NULL,
	[f_modificacion] [date] NOT NULL,
	[limite] [numeric](2, 0) NOT NULL,
	[cod_producto] [numeric](8, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Clientes]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clientes](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[cedularif] [nvarchar](15) NOT NULL,
	[nombre] [nvarchar](50) NOT NULL,
	[direccion] [nvarchar](30) NOT NULL,
	[telefono] [nvarchar](15) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ent_Prod]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ent_Prod](
	[cantidad] [numeric](3, 0) NOT NULL,
	[iva] [numeric](8, 2) NOT NULL,
	[cod_entrada] [numeric](8, 0) NOT NULL,
	[cod_producto] [numeric](8, 0) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Entradas]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Entradas](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[f_emision] [date] NOT NULL,
	[f_recepcion] [date] NULL,
	[monto_pagar] [numeric](8, 2) NOT NULL,
	[proveedor] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Facturas]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Facturas](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[f_emision] [date] NOT NULL,
	[total_iva] [numeric](8, 2) NOT NULL,
	[monto_total] [numeric](8, 2) NOT NULL,
	[cod_cliente] [numeric](8, 0) NOT NULL,
	[cod_salida] [numeric](8, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Productos]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Productos](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](100) NOT NULL,
	[imagen] [nvarchar](50) NOT NULL,
	[disponibilidad] [numeric](3, 0) NOT NULL,
	[precio_compra] [numeric](8, 2) NOT NULL,
	[p_rentabilidad] [numeric](8, 2) NOT NULL,
	[pvpdetal] [numeric](8, 2) NOT NULL,
	[pvp2mayor] [numeric](8, 2) NOT NULL,
	[ganancia] [numeric](8, 2) NOT NULL,
	[categoria] [nvarchar](30) NOT NULL,
	[no_visible] [numeric](1, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sal_Prod]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sal_Prod](
	[cantidad] [numeric](3, 0) NOT NULL,
	[iva] [numeric](8, 2) NOT NULL,
	[cod_salida] [numeric](8, 0) NOT NULL,
	[cod_producto] [numeric](8, 0) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Salidas]    Script Date: 31/12/2022 2:19:57 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Salidas](
	[cod] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[f_emision] [date] NOT NULL,
	[f_recepcion] [date] NULL,
	[monto_pagar] [numeric](8, 2) NOT NULL,
	[ganancia] [numeric](8, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Clientes] ON 

INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(1 AS Numeric(8, 0)), N'20026536', N'LUIS BELISARIO', N'Pick Up', N'414-301-59-13')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(2 AS Numeric(8, 0)), N'9882334', N'PIETRO FELICE', N'Caracas', N'414-322-36-56')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(3 AS Numeric(8, 0)), N'3732742', N'"XAVIMARINE C.A."', N'Santa Paula', N'414-249-49-93')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(4 AS Numeric(8, 0)), N'11234270', N'GRUPO AQUI HAY C.A.', N'Tucacas', N'412-419-00-85')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(5 AS Numeric(8, 0)), N'15244412', N'EDGAR QUINTERO', N'Caracas', N'424-271-58-93')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(6 AS Numeric(8, 0)), N'13531978', N'MANUEL GIMENEZ', N'La California', N'414-333-74-23')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(7 AS Numeric(8, 0)), N'13344234', N'JORGE LUIS CABBEDU', N'Caracas', N'414-132-09-90')
INSERT [dbo].[Clientes] ([cod], [cedularif], [nombre], [direccion], [telefono]) VALUES (CAST(8 AS Numeric(8, 0)), N'14778594', N'CARLOS MACHIN', N'Ciudad Bolivar', N'412-061-66-69')
SET IDENTITY_INSERT [dbo].[Clientes] OFF
GO
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(2 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(12.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(10.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(4 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(4 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(4 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Ent_Prod] ([cantidad], [iva], [cod_entrada], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
GO
SET IDENTITY_INSERT [dbo].[Entradas] ON 

INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(1 AS Numeric(8, 0)), CAST(N'2021-01-05' AS Date), CAST(N'2021-02-05' AS Date), CAST(371.26 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(2 AS Numeric(8, 0)), CAST(N'2021-01-06' AS Date), CAST(N'2021-04-05' AS Date), CAST(191.04 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(3 AS Numeric(8, 0)), CAST(N'2021-01-07' AS Date), CAST(N'2021-06-12' AS Date), CAST(243.08 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(4 AS Numeric(8, 0)), CAST(N'2021-01-08' AS Date), NULL, CAST(56.41 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(5 AS Numeric(8, 0)), CAST(N'2021-02-05' AS Date), NULL, CAST(61.32 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(6 AS Numeric(8, 0)), CAST(N'2021-03-05' AS Date), CAST(N'2021-06-12' AS Date), CAST(64.88 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(7 AS Numeric(8, 0)), CAST(N'2021-04-05' AS Date), CAST(N'2021-10-05' AS Date), CAST(71.32 AS Numeric(8, 2)), N'Donovan')
INSERT [dbo].[Entradas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [proveedor]) VALUES (CAST(8 AS Numeric(8, 0)), CAST(N'2021-01-10' AS Date), CAST(N'2021-01-15' AS Date), CAST(52.20 AS Numeric(8, 2)), N'Donovan')
SET IDENTITY_INSERT [dbo].[Entradas] OFF
GO
SET IDENTITY_INSERT [dbo].[Facturas] ON 

INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(1 AS Numeric(8, 0)), CAST(N'2023-01-02' AS Date), CAST(50.12 AS Numeric(8, 2)), CAST(125.13 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(2 AS Numeric(8, 0)), CAST(N'2023-01-05' AS Date), CAST(124.42 AS Numeric(8, 2)), CAST(235.11 AS Numeric(8, 2)), CAST(2 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(3 AS Numeric(8, 0)), CAST(N'2023-01-08' AS Date), CAST(2.15 AS Numeric(8, 2)), CAST(145.45 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(4 AS Numeric(8, 0)), CAST(N'2023-01-12' AS Date), CAST(43.76 AS Numeric(8, 2)), CAST(112.63 AS Numeric(8, 2)), CAST(4 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(5 AS Numeric(8, 0)), CAST(N'2023-01-17' AS Date), CAST(65.56 AS Numeric(8, 2)), CAST(119.49 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(6 AS Numeric(8, 0)), CAST(N'2023-01-21' AS Date), CAST(16.23 AS Numeric(8, 2)), CAST(141.46 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(7 AS Numeric(8, 0)), CAST(N'2023-02-02' AS Date), CAST(23.76 AS Numeric(8, 2)), CAST(113.79 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Facturas] ([cod], [f_emision], [total_iva], [monto_total], [cod_cliente], [cod_salida]) VALUES (CAST(8 AS Numeric(8, 0)), CAST(N'2023-03-03' AS Date), CAST(19.49 AS Numeric(8, 2)), CAST(149.13 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(8 AS Numeric(8, 0)))
SET IDENTITY_INSERT [dbo].[Facturas] OFF
GO
SET IDENTITY_INSERT [dbo].[Productos] ON 

INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(1 AS Numeric(8, 0)), N'Kit de Sellos BRP', N'img1.jpg', CAST(1 AS Numeric(3, 0)), CAST(53.80 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(37.00 AS Numeric(8, 2)), CAST(67.25 AS Numeric(8, 2)), CAST(21.00 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(2 AS Numeric(8, 0)), N'Kit de Sellos Ciguenal Etec', N'img2.jpg', CAST(6 AS Numeric(3, 0)), CAST(9.12 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(30.00 AS Numeric(8, 2)), CAST(11.40 AS Numeric(8, 2)), CAST(30.00 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(3 AS Numeric(8, 0)), N'Kit de Sellos de Inyectores Etec 5007017', N'img3.jpg', CAST(5 AS Numeric(3, 0)), CAST(7.60 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(3.00 AS Numeric(8, 2)), CAST(9.50 AS Numeric(8, 2)), CAST(14.00 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(4 AS Numeric(8, 0)), N'Kit de sellos M2 5007700 (M)', N'img3.jpg', CAST(4 AS Numeric(3, 0)), CAST(30.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(120.00 AS Numeric(8, 2)), CAST(37.50 AS Numeric(8, 2)), CAST(25.00 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(5 AS Numeric(8, 0)), N'Kit de Servicio de Inyectores Etec', N'img3.jpg', CAST(7 AS Numeric(3, 0)), CAST(6.85 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), CAST(8.56 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(6 AS Numeric(8, 0)), N'Kit Servicio De Inyectores (M)', N'img3.jpg', CAST(8 AS Numeric(3, 0)), CAST(10.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(15.00 AS Numeric(8, 2)), CAST(12.50 AS Numeric(8, 2)), CAST(34.00 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(7 AS Numeric(8, 0)), N'Luces De Navegacion Led Ojo De Gato', N'img3.jpg', CAST(2 AS Numeric(3, 0)), CAST(50.72 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(20.00 AS Numeric(8, 2)), CAST(63.40 AS Numeric(8, 2)), CAST(20.00 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(8 AS Numeric(8, 0)), N'Luz De Cortesia 3" Led Blancas Marpac"', N'img3.jpg', CAST(0 AS Numeric(3, 0)), CAST(6.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), CAST(7.50 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(9 AS Numeric(8, 0)), N'Luz De Cortesia Lumitec Azules (A)', N'img3.jpg', CAST(3 AS Numeric(3, 0)), CAST(16.20 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(20.25 AS Numeric(8, 2)), CAST(41.00 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(10 AS Numeric(8, 0)), N'Luz De Cortesia Orbit Lumitec (A)', N'img3.jpg', CAST(0 AS Numeric(3, 0)), CAST(12.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(120.00 AS Numeric(8, 2)), CAST(15.00 AS Numeric(8, 2)), CAST(42.00 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(11 AS Numeric(8, 0)), N'Luz De Cortesia Orbit Lumitec (M)', N'img3.jpg', CAST(0 AS Numeric(3, 0)), CAST(15.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), CAST(18.75 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(12 AS Numeric(8, 0)), N'Luz De Emergencia Led Advance (M)', N'img3.jpg', CAST(1 AS Numeric(3, 0)), CAST(30.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(25.00 AS Numeric(8, 2)), CAST(37.50 AS Numeric(8, 2)), CAST(78.00 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(13 AS Numeric(8, 0)), N'Luz de Navegacion Fija', N'img2.jpg', CAST(5 AS Numeric(3, 0)), CAST(31.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(20.00 AS Numeric(8, 2)), CAST(38.75 AS Numeric(8, 2)), CAST(20.00 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(14 AS Numeric(8, 0)), N'Luz De Popa 2 - 3/8" (A)"', N'img2.jpg', CAST(5 AS Numeric(3, 0)), CAST(9.44 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), CAST(11.80 AS Numeric(8, 2)), CAST(40.00 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(15 AS Numeric(8, 0)), N'Luz De Popa De Vastago (M)', N'img2.jpg', CAST(6 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(31.25 AS Numeric(8, 2)), CAST(55.00 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(16 AS Numeric(8, 0)), N'Luz De Popa Perko (A)', N'img2.jpg', CAST(4 AS Numeric(3, 0)), CAST(39.32 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(49.15 AS Numeric(8, 2)), CAST(52.49 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(17 AS Numeric(8, 0)), N'Salida De Agua 1" Y 1 1/2"" (M)"', N'img2.jpg', CAST(2 AS Numeric(3, 0)), CAST(5.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(6.25 AS Numeric(8, 2)), CAST(54.55 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(18 AS Numeric(8, 0)), N'Salida De Agua 1" Y 1 1/8"" (M)"', N'img2.jpg', CAST(0 AS Numeric(3, 0)), CAST(5.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(6.25 AS Numeric(8, 2)), CAST(56.61 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(19 AS Numeric(8, 0)), N'Salida De Agua De 1" (A)"', N'img2.jpg', CAST(0 AS Numeric(3, 0)), CAST(5.00 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(6.25 AS Numeric(8, 2)), CAST(58.67 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(20 AS Numeric(8, 0)), N'Salida De Agua De 2" X 3/4"" (M)"', N'img2.jpg', CAST(0 AS Numeric(3, 0)), CAST(7.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(8.75 AS Numeric(8, 2)), CAST(60.73 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(21 AS Numeric(8, 0)), N'Sender de gasolina Marpac', N'img2.jpg', CAST(1 AS Numeric(3, 0)), CAST(25.58 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(31.98 AS Numeric(8, 2)), CAST(62.79 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(22 AS Numeric(8, 0)), N'Sensor de Temperatura de Aire Etec', N'img2.jpg', CAST(2 AS Numeric(3, 0)), CAST(27.40 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(34.25 AS Numeric(8, 2)), CAST(64.85 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(23 AS Numeric(8, 0)), N'Sensor De Temperatura Etec', N'img1.jpg', CAST(2 AS Numeric(3, 0)), CAST(13.70 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(17.13 AS Numeric(8, 2)), CAST(66.91 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(24 AS Numeric(8, 0)), N'Sensor De Temperatura Etec (M)', N'img1.jpg', CAST(1 AS Numeric(3, 0)), CAST(50.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(62.50 AS Numeric(8, 2)), CAST(68.97 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(25 AS Numeric(8, 0)), N'Sensor De Temperatura Motores V4 (M)', N'img1.jpg', CAST(3 AS Numeric(3, 0)), CAST(50.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(62.50 AS Numeric(8, 2)), CAST(71.03 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(26 AS Numeric(8, 0)), N'Sensor TPS Etec', N'img1.jpg', CAST(5 AS Numeric(3, 0)), CAST(30.14 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(37.68 AS Numeric(8, 2)), CAST(73.09 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(27 AS Numeric(8, 0)), N'Silicon 4200', N'img1.jpg', CAST(4 AS Numeric(3, 0)), CAST(10.84 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(13.55 AS Numeric(8, 2)), CAST(75.15 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(28 AS Numeric(8, 0)), N'Silicon Marino 3M 5200 10 oz', N'img1.jpg', CAST(1 AS Numeric(3, 0)), CAST(15.87 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(19.84 AS Numeric(8, 2)), CAST(77.21 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(29 AS Numeric(8, 0)), N'Suichera de Ignicion Etec', N'img1.jpg', CAST(5 AS Numeric(3, 0)), CAST(10.96 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(13.70 AS Numeric(8, 2)), CAST(81.34 AS Numeric(8, 2)), N'Seguridad', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(30 AS Numeric(8, 0)), N'Suitch De Botica 3 Pases (M)', N'img1.jpg', CAST(1 AS Numeric(3, 0)), CAST(75.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(93.75 AS Numeric(8, 2)), CAST(83.40 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(31 AS Numeric(8, 0)), N'Switch Para Bomba De Achique (M)', N'img1.jpg', CAST(4 AS Numeric(3, 0)), CAST(60.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(75.00 AS Numeric(8, 2)), CAST(85.46 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(32 AS Numeric(8, 0)), N'Tapa de Termostato Evinrude', N'img1.jpg', CAST(7 AS Numeric(3, 0)), CAST(26.26 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(32.82 AS Numeric(8, 2)), CAST(87.52 AS Numeric(8, 2)), N'Electronico', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(33 AS Numeric(8, 0)), N'Tapon De Drenaje Bronce (M)', N'img1.jpg', CAST(6 AS Numeric(3, 0)), CAST(3.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(3.75 AS Numeric(8, 2)), CAST(89.58 AS Numeric(8, 2)), N'Miscelaneo', CAST(1 AS Numeric(1, 0)))
INSERT [dbo].[Productos] ([cod], [nombre], [imagen], [disponibilidad], [precio_compra], [p_rentabilidad], [pvpdetal], [pvp2mayor], [ganancia], [categoria], [no_visible]) VALUES (CAST(34 AS Numeric(8, 0)), N'Tapon de Drenaje Bronce 1/2"', N'img1.jpg', CAST(4 AS Numeric(3, 0)), CAST(9.00 AS Numeric(8, 2)), CAST(0.45 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)), CAST(11.25 AS Numeric(8, 2)), CAST(91.64 AS Numeric(8, 2)), N'Motor', CAST(1 AS Numeric(1, 0)))
SET IDENTITY_INSERT [dbo].[Productos] OFF
GO
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(1 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(2 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(3 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(4 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(4 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(5 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(6 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(1.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(1 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(4 AS Numeric(3, 0)), CAST(20.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(2 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(7 AS Numeric(8, 0)), CAST(3 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(4 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(3 AS Numeric(3, 0)), CAST(35.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(5 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(1 AS Numeric(3, 0)), CAST(102.25 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(6 AS Numeric(8, 0)))
INSERT [dbo].[Sal_Prod] ([cantidad], [iva], [cod_salida], [cod_producto]) VALUES (CAST(2 AS Numeric(3, 0)), CAST(25.00 AS Numeric(8, 2)), CAST(8 AS Numeric(8, 0)), CAST(7 AS Numeric(8, 0)))
GO
SET IDENTITY_INSERT [dbo].[Salidas] ON 

INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(1 AS Numeric(8, 0)), CAST(N'2021-01-05' AS Date), CAST(N'2021-02-05' AS Date), CAST(371.26 AS Numeric(8, 2)), CAST(123.50 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(2 AS Numeric(8, 0)), CAST(N'2021-01-06' AS Date), NULL, CAST(191.04 AS Numeric(8, 2)), CAST(56.60 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(3 AS Numeric(8, 0)), CAST(N'2021-01-07' AS Date), CAST(N'2021-06-12' AS Date), CAST(243.08 AS Numeric(8, 2)), CAST(45.50 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(4 AS Numeric(8, 0)), CAST(N'2021-01-08' AS Date), CAST(N'2022-01-05' AS Date), CAST(56.41 AS Numeric(8, 2)), CAST(45.00 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(5 AS Numeric(8, 0)), CAST(N'2021-02-05' AS Date), CAST(N'2022-01-01' AS Date), CAST(61.32 AS Numeric(8, 2)), CAST(60.00 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(6 AS Numeric(8, 0)), CAST(N'2021-03-05' AS Date), CAST(N'2021-06-12' AS Date), CAST(64.88 AS Numeric(8, 2)), CAST(54.50 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(7 AS Numeric(8, 0)), CAST(N'2021-04-05' AS Date), CAST(N'2021-10-05' AS Date), CAST(71.32 AS Numeric(8, 2)), CAST(70.00 AS Numeric(8, 2)))
INSERT [dbo].[Salidas] ([cod], [f_emision], [f_recepcion], [monto_pagar], [ganancia]) VALUES (CAST(8 AS Numeric(8, 0)), CAST(N'2021-01-10' AS Date), NULL, CAST(52.20 AS Numeric(8, 2)), CAST(51.40 AS Numeric(8, 2)))
SET IDENTITY_INSERT [dbo].[Salidas] OFF
GO
ALTER TABLE [dbo].[Alarmas]  WITH CHECK ADD FOREIGN KEY([cod_producto])
REFERENCES [dbo].[Productos] ([cod])
GO
ALTER TABLE [dbo].[Ent_Prod]  WITH CHECK ADD FOREIGN KEY([cod_entrada])
REFERENCES [dbo].[Entradas] ([cod])
GO
ALTER TABLE [dbo].[Ent_Prod]  WITH CHECK ADD FOREIGN KEY([cod_producto])
REFERENCES [dbo].[Productos] ([cod])
GO
ALTER TABLE [dbo].[Facturas]  WITH CHECK ADD FOREIGN KEY([cod_cliente])
REFERENCES [dbo].[Clientes] ([cod])
GO
ALTER TABLE [dbo].[Facturas]  WITH CHECK ADD FOREIGN KEY([cod_salida])
REFERENCES [dbo].[Salidas] ([cod])
GO
ALTER TABLE [dbo].[Sal_Prod]  WITH CHECK ADD FOREIGN KEY([cod_producto])
REFERENCES [dbo].[Productos] ([cod])
GO
ALTER TABLE [dbo].[Sal_Prod]  WITH CHECK ADD FOREIGN KEY([cod_salida])
REFERENCES [dbo].[Salidas] ([cod])
GO
ALTER TABLE [dbo].[Alarmas]  WITH CHECK ADD  CONSTRAINT [Ala_f_creacion_check] CHECK  (([f_creacion]>='1900-01-01' AND [f_creacion]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Alarmas] CHECK CONSTRAINT [Ala_f_creacion_check]
GO
ALTER TABLE [dbo].[Alarmas]  WITH CHECK ADD  CONSTRAINT [Ala_f_modificacion_check] CHECK  (([f_modificacion]>='1900-01-01' AND [f_modificacion]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Alarmas] CHECK CONSTRAINT [Ala_f_modificacion_check]
GO
ALTER TABLE [dbo].[Alarmas]  WITH CHECK ADD  CONSTRAINT [Ala_limite_check] CHECK  (([limite]>=(0)))
GO
ALTER TABLE [dbo].[Alarmas] CHECK CONSTRAINT [Ala_limite_check]
GO
ALTER TABLE [dbo].[Ent_Prod]  WITH CHECK ADD  CONSTRAINT [EProd_disponibilidad_check] CHECK  (([cantidad]>(0)))
GO
ALTER TABLE [dbo].[Ent_Prod] CHECK CONSTRAINT [EProd_disponibilidad_check]
GO
ALTER TABLE [dbo].[Ent_Prod]  WITH CHECK ADD  CONSTRAINT [EProd_precio_compra_check] CHECK  (([iva]>(0)))
GO
ALTER TABLE [dbo].[Ent_Prod] CHECK CONSTRAINT [EProd_precio_compra_check]
GO
ALTER TABLE [dbo].[Entradas]  WITH CHECK ADD  CONSTRAINT [Ent_f_emision_check] CHECK  (([f_emision]>='1900-01-01' AND [f_emision]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Entradas] CHECK CONSTRAINT [Ent_f_emision_check]
GO
ALTER TABLE [dbo].[Entradas]  WITH CHECK ADD  CONSTRAINT [Ent_f_recepcion_check] CHECK  (([f_recepcion]>='1900-01-01' AND [f_recepcion]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Entradas] CHECK CONSTRAINT [Ent_f_recepcion_check]
GO
ALTER TABLE [dbo].[Entradas]  WITH CHECK ADD  CONSTRAINT [Ent_monto_pagar_check] CHECK  (([monto_pagar]>(0)))
GO
ALTER TABLE [dbo].[Entradas] CHECK CONSTRAINT [Ent_monto_pagar_check]
GO
ALTER TABLE [dbo].[Facturas]  WITH CHECK ADD  CONSTRAINT [Fac_f_emision_check] CHECK  (([f_emision]>='1900-01-01' AND [f_emision]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Facturas] CHECK CONSTRAINT [Fac_f_emision_check]
GO
ALTER TABLE [dbo].[Facturas]  WITH CHECK ADD  CONSTRAINT [Fac_monto_total_check] CHECK  (([monto_total]>(0)))
GO
ALTER TABLE [dbo].[Facturas] CHECK CONSTRAINT [Fac_monto_total_check]
GO
ALTER TABLE [dbo].[Facturas]  WITH CHECK ADD  CONSTRAINT [Fac_total_iva_check] CHECK  (([total_iva]>(0)))
GO
ALTER TABLE [dbo].[Facturas] CHECK CONSTRAINT [Fac_total_iva_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_categoria_check] CHECK  (([categoria]='Combustible' OR [categoria]='Seguridad' OR [categoria]='Motor' OR [categoria]='Miscelaneo' OR [categoria]='Electronico'))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_categoria_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_disponibilidad_check] CHECK  (([disponibilidad]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_disponibilidad_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_ganancia_check] CHECK  (([ganancia]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_ganancia_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_no_visible_check] CHECK  (([no_visible]=(0) OR [no_visible]=(1)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_no_visible_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_p_rentabilidad_check] CHECK  (([p_rentabilidad]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_p_rentabilidad_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_precio_compra_check] CHECK  (([precio_compra]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_precio_compra_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_pvp2mayor_check] CHECK  (([pvp2mayor]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_pvp2mayor_check]
GO
ALTER TABLE [dbo].[Productos]  WITH CHECK ADD  CONSTRAINT [Prod_pvpdetal_check] CHECK  (([pvpdetal]>=(0)))
GO
ALTER TABLE [dbo].[Productos] CHECK CONSTRAINT [Prod_pvpdetal_check]
GO
ALTER TABLE [dbo].[Sal_Prod]  WITH CHECK ADD  CONSTRAINT [SProd_disponibilidad_check] CHECK  (([cantidad]>(0)))
GO
ALTER TABLE [dbo].[Sal_Prod] CHECK CONSTRAINT [SProd_disponibilidad_check]
GO
ALTER TABLE [dbo].[Sal_Prod]  WITH CHECK ADD  CONSTRAINT [SProd_precio_compra_check] CHECK  (([iva]>(0)))
GO
ALTER TABLE [dbo].[Sal_Prod] CHECK CONSTRAINT [SProd_precio_compra_check]
GO
ALTER TABLE [dbo].[Salidas]  WITH CHECK ADD  CONSTRAINT [Sal_f_emision_check] CHECK  (([f_emision]>='1900-01-01' AND [f_emision]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Salidas] CHECK CONSTRAINT [Sal_f_emision_check]
GO
ALTER TABLE [dbo].[Salidas]  WITH CHECK ADD  CONSTRAINT [Sal_f_recepcion_check] CHECK  (([f_recepcion]>='1900-01-01' AND [f_recepcion]<='2999-12-31'))
GO
ALTER TABLE [dbo].[Salidas] CHECK CONSTRAINT [Sal_f_recepcion_check]
GO
ALTER TABLE [dbo].[Salidas]  WITH CHECK ADD  CONSTRAINT [Sal_ganancia_check] CHECK  (([ganancia]>(0)))
GO
ALTER TABLE [dbo].[Salidas] CHECK CONSTRAINT [Sal_ganancia_check]
GO
ALTER TABLE [dbo].[Salidas]  WITH CHECK ADD  CONSTRAINT [Sal_monto_pagar_check] CHECK  (([monto_pagar]>(0)))
GO
ALTER TABLE [dbo].[Salidas] CHECK CONSTRAINT [Sal_monto_pagar_check]
GO
