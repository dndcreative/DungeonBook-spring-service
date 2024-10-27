create schema if not exists dnd;

SET search_path TO dnd;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS characters;
DROP TABLE IF EXISTS skills;
DROP TABLE IF EXISTS equipments;
DROP TABLE IF EXISTS abilities;
DROP TABLE IF EXISTS sessions;
DROP TABLE IF EXISTS game_sessions;

CREATE TABLE IF NOT EXISTS users
(
    uuid     uuid PRIMARY KEY     DEFAULT gen_random_uuid(),
    name     VARCHAR(50) not null,
    password VARCHAR(25) not null,
    type     VARCHAR(10) NOT NULL DEFAULT 'PLAYER'
);

CREATE TABLE IF NOT EXISTS characters
(
    id          SERIAL PRIMARY KEY,
    user_uuid     uuid     not null,
    name        VARCHAR(90) NOT NULL,
    health      INTEGER     not null DEFAULT 10,
    stamina     INTEGER     not null DEFAULT 10,
    mana        INTEGER     not null DEFAULT 10,
    skills_id INTEGER     not null
);

CREATE TABLE IF NOT EXISTS skills
(
    id           SERIAL PRIMARY KEY,
    strength     INTEGER NOT NULL DEFAULT 10,
    perception   INTEGER NOT NULL DEFAULT 10,
    endurance    INTEGER NOT NULL DEFAULT 10,
    charisma     INTEGER NOT NULL DEFAULT 10,
    intelligence INTEGER NOT NULL DEFAULT 10,
    agility      INTEGER NOT NULL DEFAULT 10,
    luck         INTEGER NOT NULL DEFAULT 10
);

CREATE TABLE IF NOT EXISTS equipments
(
    id               SERIAL PRIMARY KEY,
    character_id     INTEGER      not null,
    prop_name        VARCHAR(100) not null,
    prop_description VARCHAR(255) not null,
    prop_text        TEXT default ''
);

CREATE TABLE IF NOT EXISTS abilities
(
    id           SERIAL PRIMARY KEY,
    character_id INTEGER      not null,
    title        VARCHAR(100) not null,
    subtitle     VARCHAR(100) not null,
    description  VARCHAR(255) not null DEFAULT 'descr',
    ability_text TEXT                  default ''
);

CREATE TABLE IF NOT EXISTS sessions
(
    uuid      uuid PRIMARY KEY      DEFAULT gen_random_uuid(),
    name      VARCHAR(100) not null,
    password  VARCHAR(100) not null,
    max_users int          not null DEFAULT 4
);

CREATE TABLE IF NOT EXISTS game_sessions
(
    id         SERIAL PRIMARY KEY,
    user_uuid    uuid not null,
    session_uuid uuid not null,
    UNIQUE (user_uuid, session_uuid)
);

-- ALTER TABLE characters
--     ADD FOREIGN KEY (user_uuid) REFERENCES users (uuid);
ALTER TABLE characters
    ADD FOREIGN KEY (skills_id) REFERENCES skills (id);

ALTER TABLE equipments
    ADD FOREIGN KEY (character_id) REFERENCES characters (id);
ALTER TABLE abilities
    ADD FOREIGN KEY (character_id) REFERENCES characters (id);




