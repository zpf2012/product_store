create table CUX_Apply (
	uuid_ VARCHAR(75) null,
	applyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	projectName VARCHAR(75) null,
	integrationObject VARCHAR(75) null,
	useType VARCHAR(75) null,
	approveFlag VARCHAR(75) null,
	approveDate DATE null,
	creationDate DATE null,
	createdBy LONG,
	updateDate DATE null,
	updatedBy LONG,
	productId LONG,
	useDate DATE null
);

create table CUX_Assess (
	uuid_ VARCHAR(75) null,
	assessId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	projectName VARCHAR(75) null,
	createDate DATE null,
	multipleAssess DOUBLE,
	multiPercent DOUBLE,
	configurable LONG,
	stability LONG,
	integrationGrade LONG,
	applyId LONG,
	productId LONG
);

create table CUX_Product (
	uuid_ VARCHAR(75) null,
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productName VARCHAR(75) null,
	productDesc VARCHAR(75) null,
	videoLink VARCHAR(75) null,
	productLink VARCHAR(75) null,
	wikiLink VARCHAR(75) null,
	createdBy LONG,
	updatedBy LONG
);