SET search_path TO dnd;

insert into users(id, name, password, type)
values
    (1, 'Дмитрий', 'f4180', 'MASTER'),
    (2, 'Таня', 't1339', 'PLAYER'),
    (3, 'Миша', 'm1339', 'PLAYER'),
    (4, 'Саша', 's1339', 'PLAYER'),
    (5, 'Тимофей', 'f1339', 'PLAYER');

insert into skills(id)
values
    (1),
    (2),
    (3),
    (4);

insert into sessions(id, name, password, max_users)
values
    (1, 'HaloweenSpecial','4180', 4);

insert into game_sessions(id, user_id, session_id)
values
    (1,1,1),
    (2,2,1),
    (3,3,1),
    (4,4,1),
    (5,5,1);

insert into characters(id, user_id, name, skills_id)
values
    (1,2,'Таня', 1),
    (2,3,'Миша', 2),
    (3,4,'Саша', 3),
    (4,5,'Тимофей', 4);

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




