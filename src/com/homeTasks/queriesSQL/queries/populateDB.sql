/*1)*/ insert into developers values(null, 'Jon','G'),(null, 'Mick','Topn'),(null, 'Tom','Broun'),(null, 'Anna','Cher'),
(null, 'Ginna','Mj'),(null, 'Paul','Vovk'),(null, 'Tracy','DF'),(null, 'Mikle','VB'),(null, 'Don','NBN'), (null, 'Jimmy','Kl'),
(null, 'Brain','Lee'), (null, 'Taddy','Ps'), (null, 'Rose','Tree');
/*+----+----------+-------------+
| id | dev_name | dev_surname |
+----+----------+-------------+
|  2 | Jon      | G           |
|  3 | Mick     | Topn        |
|  4 | Tom      | Broun       |
|  5 | Anna     | Cher        |
|  6 | Ginna    | Mj          |
|  7 | Paul     | Vovk        |
|  8 | Tracy    | DF          |
|  9 | Mikle    | VB          |
| 10 | Don      | NBN         |
| 11 | Jimmy    | Kl          |
| 12 | Brain    | Lee         |
| 13 | Taddy    | Ps          |
| 14 | Rose     | Tree        |
+----+----------+-------------+
2)*/ insert into skills values(null, 'Java'),(null, 'Ruby'),(null, 'C#'),(null, 'C++'),(null, 'PHP'),(null, 'JavaScript'),(null, 'Perl');
/*+----+-------------+
| id | skills_name |
+----+-------------+
|  1 | Java        |
|  2 | Ruby        |
|  4 | C#          |
|  5 | C++         |
|  6 | PHP         |
|  7 | JavaScript  |
|  8 | Perl        |
+----+-------------+
3)*/ insert into dev_skills values(null,2,2),(null,3,2),(null,3,4),(null,3,5),(null,4,7),(null,5,1),(null,6,1),(null,7,1),(null,7,4),
(null,8,1),(null,9,8),(null,10,6),(null,11,6),(null,14,6);
/*+---------------+---------------+-----------+
| dev_skills_id | developers_id | skills_id |
+---------------+---------------+-----------+
|             9 |             2 |         2 |
|             6 |             3 |         2 |
|             4 |             3 |         4 |
|             8 |             3 |         5 |
|            23 |             4 |         7 |
|            20 |             5 |         1 |
|            19 |             6 |         1 |
|            17 |             7 |         1 |
|            21 |             7 |         4 |
|            18 |             8 |         1 |
|            12 |             9 |         8 |
|            10 |            10 |         6 |
|            11 |            11 |         6 |
|            33 |            14 |         6 |
+---------------+---------------+-----------+
4)*/ insert into projects values(null, 'Hotwire',''),(null, 'Boeing','create schedules to build planes'),
(null, 'Automotive',''),(null, 'RentalCar','');
/*+------------+--------------+----------------------------------+
| project_id | project_name | project_description              |
+------------+--------------+----------------------------------+
|          2 | Hotwire      |                                  |
|          3 | Boeing       | create schedules to build planes |
|          4 | Automotive   |                                  |
|          5 | RentalCar    |                                  |
+------------+--------------+----------------------------------+
5)*/ insert into projects_dev values (null,2,3),(null,3,3),(null,4,2),(null,5,2),(null,6,2),(null,7,4),(null,8,4),(null,9,4),(null,10,4),
(null,11,4),(null,12,5),(null,13,5),(null,14,5);
/*+----------------+---------------+-------------+
| project_dev_id | developers_id | projects_id |
+----------------+---------------+-------------+
|              1 |             2 |           3 |
|              2 |             3 |           3 |
|             13 |             4 |           2 |
|             12 |             5 |           2 |
|             11 |             6 |           2 |
|              3 |             7 |           4 |
|              4 |             8 |           4 |
|              5 |             9 |           4 |
|              6 |            10 |           4 |
|              7 |            11 |           4 |
|             10 |            12 |           5 |
|              8 |            13 |           5 |
|              9 |            14 |           5 |
+----------------+---------------+-------------+
6)*/ insert into companies values(null,'Luxoft',''),(null,'Lohika',''),(null,'SBT Systems','');
/*+--------------+--------------+---------------------+
| companies_id | company_name | company_description |
+--------------+--------------+---------------------+
|            1 | Luxoft       |                     |
|            2 | Lohika       |                     |
|            3 | SBT Systems  |                     |
+--------------+--------------+---------------------+
7)*/ insert into companies_projects values(null,1,2),(null,1,3),(null,2,5),(null,3,4);
/*+----------------------+------------+------------+
| companies_project_id | company_id | project_id |
+----------------------+------------+------------+
|                    5 |          1 |          2 |
|                    6 |          1 |          3 |
|                    4 |          2 |          5 |
|                    3 |          3 |          4 |
+----------------------+------------+------------+
8)*/ insert into customer values(null, 'customer1',''),(null, 'customer2',''),(null, 'customer3',''),(null, 'customer4',''),
(null,'customer5','');
/*+-------------+---------------+----------------------+
| customer_id | customer_name | customer_description |
+-------------+---------------+----------------------+
|           1 | customer1     |                      |
|           2 | customer2     |                      |
|           3 | customer3     |                      |
|           4 | customer4     |                      |
|           5 | customer5     |                      |
+-------------+---------------+----------------------+
9)*/ insert into customer_projects values(null,1,2),(null,1,3),(null,4,4),(null,5,4);
/*+----------------------+-------------+-------------+
| customer_projects_id | customer_id | projects_id |
+----------------------+-------------+-------------+
|                    1 |           1 |           2 |
|                    2 |           1 |           3 |
|                    4 |           4 |           4 |
|                    3 |           5 |           4 |
+----------------------+-------------+-------------+*/