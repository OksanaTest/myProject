/*
Вычислить, среднюю ЗП программистов в проекте, который приносит наименьшую прибыль.
*/
SELECT AVG(salary),MIN(cost), project_name FROM developers d 
LEFT JOIN projects_dev pd ON d.id = pd.developers_id 
LEFT JOIN projects p ON pd.projects_id = p.project_id GROUP BY project_name 
HAVING MIN(cost) <= ALL(SELECT MIN(cost) FROM projects);