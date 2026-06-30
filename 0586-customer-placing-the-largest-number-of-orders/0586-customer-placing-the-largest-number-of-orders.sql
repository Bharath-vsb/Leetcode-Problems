select customer_number from orders
group by customer_number
ORDER BY count(customer_number) desc
limit 1;