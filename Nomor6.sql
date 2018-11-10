SELECT product_categories.id, product_categories.name, 
COUNT( products.category_id ) AS Jumlah_product
FROM product_categories
JOIN products ON product_categories.id = products.category_id
GROUP BY category_id
