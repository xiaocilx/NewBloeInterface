# 创建user用户
CREATE USER 'user'@'localhost' IDENTIFIED BY '123456';
# mysql给予用户权限
GRANT ALL PRIVILEGES ON *.* TO 'user'@'localhost';
# 刷新权限
FLUSH PRIVILEGES;


