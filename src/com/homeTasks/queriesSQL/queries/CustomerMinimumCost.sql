/*
Найти клиента (customer), который приносит меньше всего прибыли компании (company) для каждой из компаний
*/
SELECT SUM(cost), company_name, customer_name FROM customer_projects cp
LEFT JOIN projects p ON cp.projects_id = p.project_id
LEFT JOIN customer c ON cp.customer_id = c.customer_id
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE company_name = 'Luxoft'
GROUP BY customer_name HAVING sum(cost) <= ALL(SELECT SUM(cost) FROM customer_projects cp
LEFT JOIN projects p ON cp.projects_id = p.project_id
LEFT JOIN customer c ON cp.customer_id = c.customer_id
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE company_name = 'Luxoft' GROUP BY customer_name)

UNION

SELECT SUM(cost), company_name, customer_name FROM customer_projects cp
LEFT JOIN projects p ON cp.projects_id = p.project_id 
LEFT JOIN customer c ON cp.customer_id = c.customer_id
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE customer_name = 'Lohika'
GROUP BY project_name HAVING SUM(cost) <= ALL(SELECT SUM(cost) FROM customer_projects cp 
LEFT JOIN projects p ON cp.projects_id = p.project_id
LEFT JOIN customer c ON cp.customer_id = c.customer_id
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE company_name = 'Lohika' GROUP BY customer_name)

UNION

SELECT SUM(cost), company_name, customer_name FROM customer_projects cp
LEFT JOIN projects p ON cp.projects_id = p.project_id
LEFT JOIN customer c ON cp.customer_id = c.customer_id
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE customer_name = 'SBT Systems'
GROUP BY project_name HAVING SUM(cost) <= ALL(SELECT SUM(cost)
FROM customer_projects cp LEFT JOIN projects p ON cp.projects_id = p.project_id 
LEFT JOIN customer c ON cp.customer_id = c.customer_id 
LEFT JOIN companies_projects copmp ON cp.projects_id = copmp.project_id
LEFT JOIN companies ON copmp.company_id = companies.companies_id
WHERE company_name = 'SBT Systems' GROUP BY customer_name);