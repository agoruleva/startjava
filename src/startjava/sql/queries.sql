\echo Показываем всю таблицу
SELECT model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
ORDER BY model_name ASC;

\echo ...только не уничтоженных роботов
SELECT  model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
WHERE status = 'Active'
ORDER BY model_name ASC;

\echo ...роботов серии Mark-1 и Mark-4
SELECT  model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
WHERE mark IN (1, 4)
ORDER BY model_name ASC;

\echo ...всех роботов, кроме серий Mark-1 и Mark-4
SELECT  model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
WHERE mark NOT IN (1, 4)
ORDER BY mark DESC;

\echo ...информацию о самых старых роботах
SELECT  model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
WHERE launch_date = (SELECT MIN(launch_date) FROM jaegers)
ORDER BY model_name ASC;

\echo ...информацию о роботах, которые уничтожили больше всех kaiju
SELECT  model_name, mark, launch_date, kaiju_killed
FROM jaegers
WHERE kaiju_killed = (SELECT MAX(kaiju_killed) FROM jaegers)
ORDER BY model_name ASC;

SELECT ROUND(AVG(weight), 3) AS "Средний вес роботов" FROM jaegers;

\echo Увеличиваем на единицу количество уничтоженных kaiju у неразрушенных роботов
UPDATE jaegers
SET kaiju_killed = kaiju_killed + 1
WHERE status = 'Active';

SELECT model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
ORDER BY model_name ASC;

\echo Удаляем уничтоженных роботов
DELETE FROM jaegers
WHERE status = 'Destroyed';

SELECT model_name, mark, height, weight, status, origin, launch_date, kaiju_killed
FROM jaegers
ORDER BY model_name ASC;
