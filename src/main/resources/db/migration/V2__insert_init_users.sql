SET search_path TO dnd;

insert into users(uuid, name, password, type)
values
    ('bce587c3-01bc-4782-a40d-7aa37b68cd95', 'Дмитрий', 'f4180', 'MASTER'),
    ('55f56447-7dd5-4c8d-9e94-02f845d56283', 'Таня', 't1339', 'PLAYER'),
    ('d8959c33-bcde-45b7-9a96-c8df6811bfa2', 'Миша', 'm1339', 'PLAYER'),
    ('25de2135-2a86-4d4e-b032-f5d59fec97da', 'Саша', 's1339', 'PLAYER'),
    ('d8fcf92d-3591-4dd6-a947-50f679879011', 'Тимофей', 'f1339', 'PLAYER');

insert into skills(id)
values
    (1),
    (2),
    (3),
    (4);

insert into sessions(uuid, name, password, max_users)
values
    ('d0918e36-aa16-456d-aff0-be6dd82df868', 'HaloweenSpecial','4180', 4);

insert into game_sessions(id, user_uuid, session_uuid)
values
    (1,'bce587c3-01bc-4782-a40d-7aa37b68cd95','d0918e36-aa16-456d-aff0-be6dd82df868'),
    (2,'55f56447-7dd5-4c8d-9e94-02f845d56283','d0918e36-aa16-456d-aff0-be6dd82df868'),
    (3,'d8959c33-bcde-45b7-9a96-c8df6811bfa2','d0918e36-aa16-456d-aff0-be6dd82df868'),
    (4,'25de2135-2a86-4d4e-b032-f5d59fec97da','d0918e36-aa16-456d-aff0-be6dd82df868'),
    (5,'d8fcf92d-3591-4dd6-a947-50f679879011','d0918e36-aa16-456d-aff0-be6dd82df868');

insert into characters(id, user_uuid, name, skills_id)
values
    (1,'55f56447-7dd5-4c8d-9e94-02f845d56283','Таня', 1),
    (2,'d8959c33-bcde-45b7-9a96-c8df6811bfa2','Миша', 2),
    (3,'25de2135-2a86-4d4e-b032-f5d59fec97da','Саша', 3),
    (4,'d8fcf92d-3591-4dd6-a947-50f679879011','Тимофей', 4);

insert into equipments(id, character_id, prop_name, prop_description, prop_text)
values
    (1,1,'FirstPropName','Таня', ''),
    (2,2,'FirstPropName','Миша', ''),
    (3,3,'FirstPropName','Саша', ''),
    (4,4,'FirstPropName','Тимофей', '');

insert into abilities(id, character_id, title, subtitle, description, ability_text)
values
    (1,1,'FirstAbilityTitle','FirstAbilitySubTitle','Таня', ''),
    (2,2,'FirstAbilityTitle','FirstAbilitySubTitle','Миша', ''),
    (3,3,'FirstAbilityTitle','FirstAbilitySubTitle','Саша', ''),
    (4,4,'FirstAbilityTitle','FirstAbilitySubTitle','Тимофей', '');




