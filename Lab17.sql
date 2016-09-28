-- #1
SELECT * FROM northwind.customers;

-- #2
select distinct country_region
from customers;

-- #3
SELECT * FROM customers
WHERE last_name LIKE 'b%';

-- #4
SELECT *
FROM orders
LIMIT 100;

-- #5
select * 
from customers
where zip_postal_code
LIKE '99999%';

-- #6
select * from orders
where ship_country_region is not null;

-- #7
SELECT * FROM customers
ORDER BY country_region,city;

-- #8
insert into customers(last_name , first_name)
values ('madadi', 'pranavi');

-- #9
UPDATE orders
SET ship_zip_postal_code  = '97201'
WHERE ship_city = 'Portland';

-- #10
delete from order_details
where quantity = 1;

-- #11
select avg(quantity),max(quantity),min(quantity) 
from order_details;

-- #12
select avg(quantity),max(quantity),min(quantity) 
from order_details
group by order_id;

-- #13
select customer_id
from orders
where id = '65';

-- #14
select *
from customers
inner join orders
on customers.id = orders.customer_id;

select *
from customers
left join orders
on customers.id = orders.customer_id;

select *
from customers
right join orders
on customers.id = orders.customer_id;

-- #15
select first_name 
from employees
where notes is null;

-- #16
Select ship_city 
From orders  o inner join customers c
On o.customer_id =c.id 
Where  first_name ='Francisco';
