/*==== BUSQUEDA DE INFORMACION DE UN DATO========*/
/*======= LIKE ========*/
select * from productos 
where nombre like "Limonada";

select * from productos 
where nombre like "limon%";

select * from productos 
where nombre like "%limon";

select * from productos 
where nombre like "%limon%";

/*====== NOT LIKE =====*/
select * from productos 
where nombre not like "%limon%";