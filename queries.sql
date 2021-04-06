## Part 1: Test it with SQL

job - NULL
employer - NULL
name - NULL
skill - NULL

## Part 2: Test it with SQL

SELECT name FROM employer WHERE location = 'St. Louis';

## Part 3: Test it with SQL

DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL

// return a list of the names and descriptions of all skills that are attached to jobs in alphabetical order
// if a skill does not have a job listed, it should not be included in the results of the query

SELECT name, description
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id != "null"
ORDER BY name desc;