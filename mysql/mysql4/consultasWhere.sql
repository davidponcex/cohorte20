/*====== LISTAS======*/
/*==== IN, NOT IN ====*/
select * from productos;
select * from productos
where precio in (5,6,7,8,9,10);
select * from productos
where precio not in (5,6,7,8,9,10);

/*====== BUSQUEDA POR FECHAS =====*/
select * from productos
where date(fecha_alta)
between "2015-01-01" and "2016-07-24";
/* ==== SE PUEDEN USAR OPERADORES ARITMETICOS===*/
select * from productos
where precio = 10-3.5;
/*===== PARA SACAR PROMEDIOS====*/
/*==== AVG()====*/
select nombre , avg(precio) as promedio_precios 
from productos where idProducto = 1;
