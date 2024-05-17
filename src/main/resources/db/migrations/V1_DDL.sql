
CREATE TABLE users (
id SERIAL PRIMARY KEY,
user_firstName VARCHAR(255) NOT NULL,
user_lastName VARCHAR(255) NOT NULL,
user_email VARCHAR(255) NOT NULL,
user_password VARCHAR(255) NOT NULL
);


CREATE TABLE clubs (
id SERIAL PRIMARY KEY,
name VARCHAR(255) NOT NULL,
logo UUID,
description text,
links json
);


CREATE TABLE clubs_users (
id int REFERENCES clubs(id),
user_id int REFERENCES users(user_id),
role text default "MEMBER"
);


CREATE TABLE announcements (
id SERIAL PRIMARY KEY,
publisher_id int REFERENCES users (user_id),
club_id int REFERENCES clubs (club_id),
title VARCHAR(50),
description text,
is_meeting boolean default false,
created_at timestamp default NOW(),
scheduled_for timestamp default NULL
);

CREATE TABLE announcements_registrations (
announcements int REFERENCES announcements(id),
users int REFERENCES users(id)
);

CREATE TABLE announcements_attachments (
id SERIAL PRIMARY KEY,
announcements_id int REFERENCES announcements(id),
url uuid,
position int 
);
