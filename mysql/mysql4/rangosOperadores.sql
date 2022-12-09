/* ===== OPERADORES =====*/
SELECT * from productos ;
/*====OPERADOR AND===*/
SELECT * from productos where idCategoria = 1 and precio = 10 ;
/*===OPERADOR OR=====*/
select * from productos where idCategoria = 1 or precio = 10;
/*===== NOT = != , <> (diferente)======*/
select * from productos where idCategoria != 1;
select * from productos where idCategoria <> 1;
/* ===== LOS NULL Y NOT NULL === */
select * from productos where precio is null;
select * from productos where precio is not null;
/* ====== BETWEEN AND  =====*/
select * from productos where precio
between 5 and 10;
select * from productos where precio
not between 5 and 10;
