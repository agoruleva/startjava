\echo Соединяемся с базой...
\c jaegers

\echo Удаляем прежнюю таблицу
DROP TABLE IF EXISTS jaegers;

\echo Создаём новую таблицу
CREATE TABLE jaegers(
  id            SERIAL PRIMARY KEY,
  model_name    TEXT,
  mark          INTEGER CHECK(mark BETWEEN 1 AND 5),
  height        FLOAT8,
  weight        NUMERIC,
  status        TEXT CHECK (status = 'Destroyed' OR status = 'Active'),
  origin        TEXT,
  launch_date   DATE,
  kaiju_killed  INTEGER
);

\echo Заполняем таблицу данными
\ir populate.sql

\ir queries.sql