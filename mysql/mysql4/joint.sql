/*====== JOINTS=======*/
select * from productos;
select * from c.categoria;
select p.nombre, p.precio, p.existencia, t.nombre from productos as p left join temp as t
on p.idCategoria = t.id;
select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temp as t
on p.idCategoria = t.id;