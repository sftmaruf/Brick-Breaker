CREATE DATABASE Brick_Breaker_Eclipse;
USE  Brick_Breaker_Eclipse;

CREATE TABLE user_reg(
user_Name VARCHAR(30),
user_ID INT,
user_EmailAdress VARCHAR(30),
user_Password INT NOT NULL,
)

DROP TABLE user_reg;

CREATE TABLE sign_in(
user_Name VARCHAR(30),
user_Password INT
)

DROP TABLE sign_in

CREATE TABLE high_score(
user_name VARCHAR(30),
high_Score int
)

DROP TABLE high_score

SELECT  * FROM user_reg
SELECT * FROM sign_in
SELECT * FROM high_score


DELETE FROM high_score

DELETE FROM high_score WHERE high_Score < (Select MAX (high_score) FROM high_score);