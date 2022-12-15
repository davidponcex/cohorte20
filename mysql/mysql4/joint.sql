/*====== JOINTS=======*/
select * from productos;
select * from c.categoria;

select p.nombre, p.precio, p.existencia, t.nombre from productos as p left join temp as t
on p.idCategoria = t.id;

select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temp as t
on p.idCategoria = t.id;

select * from categoria UNION 
select * from proveedores ;

/*====== MULTI CONSULTA ===== */
select p.nombre, p.precio, p.existencia from productos as p;

select nombre from categoria;

SELECT p.nombre as nom_producto, c.nombre as nom_Categoria, prov.nombre as nom_proveedor
FROM productos AS p 
left JOIN categoria AS c 
ON p.idCategoria = c.id
left join detalle_producto_proveedor as det 
on p.idProducto=detalle.idProducto
left join proveedores as prov 
on det.id = prov.id; 
