create DATABASE Masroka;

Create Table Account(
UserName int Primary Key, #edited to varchar(50)
Pass varchar(50),
Email varchar(50)	
);

Alter Table account modify column UserName varchar(50);

create Table Post(
text varchar(100),
PostID int primary key,
foundsth boolean,
UserName varchar(50),
FOREIGN KEY (UserName) REFERENCES Account (UserName)
);

create Table comment(
text varchar(100),
commentid int primary key,
UserName varchar(50),
FOREIGN KEY (UserName) REFERENCES Account (UserName),
PostID int,
FOREIGN KEY (PostID) REFERENCES Post (PostID)
);

insert into account values("amr","7263","email");

select * from account;

delete from account;

select * from account where UserName = "amr" and Pass = "7263115"; 

Alter table comment drop foreign key comment_ibfk_2;

Alter Table Post modify postID int auto_increment; 

Alter table comment add constraint comment_post_fk foreign key (UserName) references Post(UserName);

select * from Post;