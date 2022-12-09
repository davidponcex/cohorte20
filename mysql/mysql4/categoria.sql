SELECT * FROM tiendita.categoria;
SELECT * FROM tiendita.productos;
SELECT nombre, precio, existencia, idCategoria FROM productos where idCategoria >= 2;
/* max(),min() busca minimos y maximos */
SELECT min(existencia) as existencia_minima, max(existencia) as existencia_maxima FROM productos;
/*limit ayuda a limitar un rango para mostrar cierta cantidad de registros*/
select * from productos limit 6, 3;
/*  order by asc o desc sirven para ordenar */
SELECT * from productos order by nombre asc;


