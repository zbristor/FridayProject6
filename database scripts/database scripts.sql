use zack;
insert into role(role)values('USER');
insert into user(enabled,password,username)values(1,'zack','zbristor@gmail.com');
insert into user_roles(user_id,role_id)values(1,1);

insert into person(fname,lname)values('zack','bristor');