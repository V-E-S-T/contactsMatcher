DROP TABLE IF EXISTS contacts;

CREATE SCHEMA IF NOT EXISTS contactsMatcher;

CREATE SEQUENCE global_seq START 100000;
-- SELECT contactsMatcher;
CREATE TABLE contacts(

  id            INTEGER PRIMARY KEY DEFAULT nextval(global_seq),
  name          VARCHAR NOT NULL)

