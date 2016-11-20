/*1)*/ INSERT INTO developers VALUES(NULL,'Jon','G'),(NULL,'Mick','Topn'),
							(NULL,'Tom','Broun'),(NULL,'Anna','Cher'),
							(NULL,'Ginna','Mj'),(NULL,'Paul','Vovk'),
							(NULL,'Tracy','DF'),(NULL,'Mikle','VB'),
							(NULL,'Don','NBN'),(NULL,'Jimmy','KL'),
							(NULL,'Brain','LEE'),(NULL,'Taddy','Ps'), 
							(NULL,'Rose','Tree'),(NULL,'Ariel','Pr'),
							(NULL,'Glory','Fto'),(NULL,'Matt','Knight'),
							(NULL,'Sam','Smt'),(NULL,'Jonny','Glre'),
							(NULL,'Albert','Nsht'),(NULL,'Grant','Dre'),
							(NULL,'Hue','Kim'),(NULL,'Robert','Amst'),
							(NULL,'Anna','Main'),(NULL,'Alex','Kos');
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
| 15 | Ariel    | Pr          |
| 16 | Glory    | Fto         |
| 17 | Matt     | Knight      |
| 18 | Sam      | Smt         |
| 19 | Jonny    | Glre        |
| 20 | Albert   | Nsht        |
| 21 | Grant    | Dre         |
| 22 | Hue      | Kim         |
| 23 | Robert   | Amst        |
| 24 | Anna     | Main        |
| 25 | Alex     | Kos         |
+----+----------+-------------+
2)*/ INSERT INTO skills VALUES(NULL, 'Java'),(NULL, 'Ruby'),(NULL, 'C#'),
							(NULL, 'C++'),(NULL, 'PHP'),(NULL, 'JavaScript'),
							(NULL, 'Perl');
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
3)*/ INSERT INTO dev_skills VALUES(NULL,2,2),(NULL,3,2),(NULL,3,4),
								(NULL,3,5),(NULL,4,7),(NULL,5,1),
								(NULL,6,1),(NULL,7,1),(NULL,7,4),
								(NULL,8,1),(NULL,9,8),(NULL,10,6),
								(NULL,11,6),(NULL,14,6),(NULL,15,4),
								(NULL,16,4),(NULL,17,7),(NULL,18,7),
								(NULL,19,1),(NULL,20,1),(NULL,21,1),
								(NULL,22,1),(NULL,23,5),(NULL,24,5),
								(NULL,25,5);
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
|            34 |            15 |         4 |
|            35 |            16 |         4 |
|            36 |            17 |         7 |
|            37 |            18 |         7 |
|            38 |            19 |         1 |
|            39 |            20 |         1 |
|            40 |            21 |         1 |
|            41 |            22 |         1 |
|            42 |            23 |         5 |
|            43 |            24 |         5 |
|            44 |            25 |         5 |
+---------------+---------------+-----------+
4)*/ INSERT INTO projects VALUES(NULL, 'Hotwire',''),
							(NULL,'Boeing','create schedules to build planes'),
							(NULL,'Automotive',''),(NULL,'RentalCar',''),
							(NULL,'Deutsche Bank',''),(NULL,'DHL','');
/*+------------+---------------+----------------------------------+
| project_id | project_name  | project_description              |
+------------+---------------+----------------------------------+
|          2 | Hotwire       |                                  |
|          3 | Boeing        | create schedules to build planes |
|          4 | Automotive    |                                  |
|          5 | RentalCar     |                                  |
|          6 | Deutsche Bank |                                  |
|          7 | DHL           |                                  |
+------------+---------------+----------------------------------+
5)*/ INSERT INTO projects_dev VALUES (NULL,2,3),(NULL,3,3),(NULL,4,2),
								   (NULL,5,2),(NULL,6,2),(NULL,7,4),
								   (NULL,8,4),(NULL,9,4),(NULL,10,4),
								   (NULL,11,4),(NULL,12,5),(NULL,13,5),
								   (NULL,14,5),(NULL,15,6),(NULL,16,6),
								   (NULL,17,6),(NULL,18,6),(NULL,19,7),
								   (NULL,20,7),(NULL,21,7),(NULL,22,7),
								   (NULL,23,7),(NULL,24,7),(NULL,25,7);
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
|             14 |            15 |           6 |
|             15 |            16 |           6 |
|             16 |            17 |           6 |
|             17 |            18 |           6 |
|             18 |            19 |           7 |
|             19 |            20 |           7 |
|             20 |            21 |           7 |
|             21 |            22 |           7 |
|             22 |            23 |           7 |
|             23 |            24 |           7 |
|             24 |            25 |           7 |
+----------------+---------------+-------------+
6)*/ INSERT INTO companies VALUES(NULL,'Luxoft',''),(NULL,'Lohika',''),
							   (NULL,'SBT Systems','');
/*+--------------+--------------+---------------------+
| companies_id | company_name | company_description |
+--------------+--------------+---------------------+
|            1 | Luxoft       |                     |
|            2 | Lohika       |                     |
|            3 | SBT Systems  |                     |
+--------------+--------------+---------------------+*/
7) INSERT INTO companies_projects VALUES(NULL,1,2),(NULL,1,3),
										(NULL,1,6),(NULL,3,4),
										(NULL,2,5),(NULL,2,7)
/*+----------------------+------------+------------+
| companies_project_id | company_id | project_id |
+----------------------+------------+------------+
|                    5 |          1 |          2 |
|                    6 |          1 |          3 |
|                    7 |          1 |          6 |
|                    4 |          2 |          5 |
|                    8 |          2 |          7 |
|                    3 |          3 |          4 |
+----------------------+------------+------------+
8)*/ INSERT INTO customer VALUES(NULL, 'customer1',''),(NULL, 'customer2',''),
							  (NULL, 'customer3',''),(NULL, 'customer4',''),
							  (NULL,'customer5','');
/*+-------------+---------------+----------------------+
| customer_id | customer_name | customer_description |
+-------------+---------------+----------------------+
|           1 | customer1     |                      |
|           2 | customer2     |                      |
|           3 | customer3     |                      |
|           4 | customer4     |                      |
|           5 | customer5     |                      |
+-------------+---------------+----------------------+
9)*/ INSERT INTO customer_projects VALUES(NULL,1,2),(NULL,1,3),
									   (NULL,4,4),(NULL,5,5);
									   (NULL,4,6),(NULL,4,7);
/*+----------------------+-------------+-------------+
| customer_projects_id | customer_id | projects_id |
+----------------------+-------------+-------------+
|                    1 |           1 |           2 |
|                    2 |           1 |           3 |
|                    4 |           4 |           4 |
|                    5 |           4 |           6 |
|                    6 |           4 |           7 |
|                    3 |           5 |           5 |
+----------------------+-------------+-------------+*/