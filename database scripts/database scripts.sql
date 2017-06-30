use zack;
insert into role(role)values('USER');
insert into user(enabled,password,username)values(1,'zack','zbristor@gmail.com');
insert into user_roles(user_id,role_id)values(1,1);
insert into role(role)values('ADMIN');
insert into user(enabled,password,username)values(1,'hen','henok@gmail.com');
insert into user_roles(user_id,role_id)values(2,2);

insert into education(degree,email,school,year)values('BS in IS','zbristor@gmail.com','Mount St. Marys University','2012');
insert into education(degree,email,school,year)values('MS in Cybersecurity','zbristor@gmail.com','UMD','2015');

insert into education(degree,email,school,year)values('BS in IS','henok@gmail.com','Mount St. Marys University','2010');
insert into education(degree,email,school,year)values('MS in Martial Arts','henok@gmail.com','UMD','2007');

insert into work(company, duties, email,end,position,start)values('IBM','coding','zbristor@gmail.com','June 2014','Software Developer','August 2011');
insert into work(company, duties, email,end,position,start)values('Cisco','coding','henok@gmail.com','June 2014','Database Administrator','August 2011');

insert into skills(email, skill)values('zbristor@gmail.com','coding');
insert into skills(email, skill)values('henok@gmail.com','coding');