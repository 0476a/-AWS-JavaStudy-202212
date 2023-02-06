CREATE TABLE sales ( 
    customer VARCHAR(255), 
    amount INT
);

INSERT INTO sales (customer, amount)
VALUES 
    ('John', 100), 
    ('Jane', 200), 
    ('John', 150), 
    ('Jane', 50), 
    ('Jim', 300);

select
	customer,
    sum(amount) as total_sales,
	DENSE_RANK() over(order by sum(amount) DESC) as sales_rank
from
	sales
group by
	customer
order by
	sales_rank DESC
    , customer ASC;

    
    
    
    