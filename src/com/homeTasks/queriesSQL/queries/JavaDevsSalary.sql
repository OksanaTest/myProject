SELECT SUM(salary), skills_name FROM dev_skills ds 
LEFT JOIN skills s ON ds.skills_id = s.id 
LEFT JOIN developers d ON ds.developers_id = d.id 
WHERE s.skills_name = 'Java';