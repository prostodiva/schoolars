CREATE TABLE clubs (
club_id SERIAL PRIMARY KEY,
club_name VARCHAR(255) NOT NULL,
club_role VARCHAR(255) NOT NULL
);

CREATE TABLE users (
user_id SERIAL PRIMARY KEY,
user_firstName VARCHAR(255) NOT NULL,
user_lastName VARCHAR(255) NOT NULL,
user_name  VARCHAR(255) NOT NULL,
user_email VARCHAR(255) NOT NULL,
user_password VARCHAR(255) NOT NULL
);

CREATE TABLE announcements (
announcements_id SERIAL PRIMARY KEY,
user_id int,
FOREIGN KEY (user_id) REFERENCES users (user_id),
club_id int,
FOREIGN KEY (club_id) REFERENCES clubs (club_id)
);