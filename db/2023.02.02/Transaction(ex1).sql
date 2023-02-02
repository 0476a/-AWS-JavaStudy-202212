show variables like 'AUTOCOMMIT';

set autocommit = 0;

start transaction;

savepoint sp1;
savepoint sp2;
savepoint sp3;

insert into user_mst
values (0, 'jjjj', '1234', '김삼겹', 'jjjj@gamil.com');

delete from user_mst
where username = 'jjjj';


select * from user_mst;

rollback;

commit;

 