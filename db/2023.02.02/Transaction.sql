show variables like 'AUTOCOMMIT';

/* autocommit 끄기*/
set autocommit = 0;

start transaction;

savepoint sp1;
savepoint sp2;
savepoint sp3;

insert into user_mst
values (0, 'jjjj', '1234', '김삼겹', 'jjjj@gamil.com');

select * from user_mst;

rollback to sp1;

commit;