/*
Найти клиента (customer), который приносит меньше всего прибыли компании (company) для каждой из компаний
*/
SELECT b.ProjectMinCost,b.company_name , t.customer_name FROM(
SELECT MIN(cost) AS ProjectMinCost, a.* FROM (
SELECT SUM(cost) AS cost, company_name
FROM companies_projects_customer cpc
INNER JOIN customer c ON cpc.customer_id = c.customer_id
INNER JOIN companies cp ON cpc.companies_id = cp.companies_id
INNER JOIN projects p ON cpc.project_id = p.project_id
GROUP BY  company_name, customer_name
)a GROUP BY a.company_name
)b

INNER JOIN

(SELECT  SUM(cost) AS cost, customer_name, company_name
FROM companies_projects_customer cpc
INNER JOIN customer c ON cpc.customer_id = c.customer_id
INNER JOIN companies cp ON cpc.companies_id = cp.companies_id
INNER JOIN projects p ON cpc.project_id = p.project_id
GROUP BY  company_name, customer_name) t

ON t.cost = b.ProjectMinCost AND t.company_name = b.company_name;