/*
Найти самый дорогой проект (исходя из ЗП разработчиков).
*/
SELECT project_name, SUM(salary) AS salary FROM projects_dev pd
LEFT JOIN projects p ON pd.projects_id = p.project_id 
LEFT JOIN developers d ON pd.developers_id = d.id
GROUP BY project_name HAVING SUM(salary) >= ALL(SELECT SUM(salary) FROM projects_dev
LEFT JOIN projects ON projects_dev.projects_id = projects.project_id 
LEFT JOIN developers ON projects_dev.developers_id = developers.id
GROUP BY project_name);
