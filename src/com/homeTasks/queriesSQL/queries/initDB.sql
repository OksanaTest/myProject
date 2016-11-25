/* use IF NOT EXISTS to prevent error if such table have existed in the DB 
DEFAULT ENGINE InnoDB, DEFAULT CHARSET  - UTF8*/

CREATE TABLE IF NOT EXISTS developers (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	dev_name VARCHAR(25) NOT NULL,
	dev_surname VARCHAR(35) NOT NULL
);

CREATE TABLE IF NOT EXISTS skills (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	skills_name VARCHAR(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS dev_skills (
	dev_skills_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	developers_id INT,
	skills_id INT,
	UNIQUE (developers_id, skills_id),
	FOREIGN KEY (developers_id) REFERENCES developers (id) ON UPDATE RESTRICT
	ON DELETE CASCADE,
	FOREIGN KEY (skills_id) REFERENCES skills (id) ON UPDATE RESTRICT
	ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS projects(
	project_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	projects_name VARCHAR(30) NOT NULL UNIQUE, 
	projects_description VARCHAR(100) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS projects_dev (
	projects_dev_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	developers_id INT NOT NULL,
	projects_id INT NOT NULL,
	UNIQUE (developers_id, projects_id),
	FOREIGN KEY (developers_id) REFERENCES developers (id) ON UPDATE RESTRICT
	ON DELETE CASCADE,
	FOREIGN KEY (projects_id) REFERENCES projects (project_id) ON UPDATE RESTRICT
	ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS companies(
	companies_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	company_name VARCHAR(35) NOT NULL,
	company_description VARCHAR(100) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS companies_projects(
	companies_projects_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	company_id INT NOT NULL,
	projects_id INT NOT NULL,
	UNIQUE (company_id, projects_id),
	FOREIGN KEY (company_id) REFERENCES companies (companies_id) ON UPDATE RESTRICT 
	ON DELETE CASCADE,
	FOREIGN KEY (projects_id) REFERENCES projects (project_id) ON UPDATE RESTRICT 
	ON DELETE CASCADE 
);

CREATE TABLE IF NOT EXISTS customer(
	customer_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	customer_name VARCHAR(35) NOT NULL UNIQUE,
	customer_description VARCHAR(100) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS customer_projects(
	customer_projects_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	customer_id INT NOT NULL,
	projects_id INT NOT NULL,
	UNIQUE (customer_id, projects_id),
	FOREIGN KEY (customer_id) REFERENCES customer (customer_id) ON UPDATE RESTRICT 
	ON DELETE CASCADE,
	FOREIGN KEY (projects_id) REFERENCES projects (project_id) ON UPDATE RESTRICT 
	ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS companies_projects_customer(
 id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 companies_id INT NOT NULL,
 project_id INT NOT NULL,
 customer_id INT NOT NULL,
 UNIQUE(companies_id, project_id, customer_id),
 FOREIGN KEY (companies_id) REFERENCES companies (companies_id) ON UPDATE RESTRICT
 ON DELETE CASCADE,
 FOREIGN KEY (project_id) REFERENCES projects (project_id) ON UPDATE RESTRICT
 ON DELETE CASCADE
 );