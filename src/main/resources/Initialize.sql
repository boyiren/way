/*初始化目录数据表*/
delete from CATEGORY;
insert into CATEGORY values (1, '测试目录1');
insert into CATEGORY values (2, '测试目录2');

/*初始化标签数据表*/
delete from TAG;
insert into TAG values (1, '测试标签1');
insert into TAG values (2, '测试标签2');

/*初始化文章数据表*/
delete from POST;
insert into POST (ID, TITLE, CONTENT, CATEGORY_ID) values (1, '标题：测试1', '正文：测试1', 1);
insert into POST (ID, TITLE, CONTENT, CATEGORY_ID) values (2, '标题：测试2', '正文：测试2', 2);

/*文章和标签绑定*/
insert into POST_TAG values (1, 1);
insert into POST_TAG values (1, 2);
insert into POST_TAG values (2, 1);
insert into POST_TAG values (2, 2);