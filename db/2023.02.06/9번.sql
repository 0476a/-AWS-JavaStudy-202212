CREATE group admin_group;

CREATE USER new_user;

ALTER USER new_user ADD TO GROUP admin_group;

GRANT SELECT, INSERT, UPDATE ON *.* TO admin_group;

CREATE USER new_user;
GRANT SELECT, INSERT, UPDATE ON *.* TO new_user;