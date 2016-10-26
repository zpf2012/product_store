create index IX_5FBD69FE on CUX_Apply (applyId);
create index IX_A67DFFAB on CUX_Apply (groupId, productId);
create index IX_334656D9 on CUX_Apply (uuid_);
create index IX_35971BAF on CUX_Apply (uuid_, companyId);
create unique index IX_7C40C1F1 on CUX_Apply (uuid_, groupId);

create index IX_92E4536 on CUX_Assess (applyId);
create index IX_96C6F356 on CUX_Assess (assessId);
create index IX_CFD6FA32 on CUX_Assess (groupId, applyId);
create index IX_5E627173 on CUX_Assess (groupId, productId);
create index IX_5B24A011 on CUX_Assess (uuid_);
create index IX_6DFD5F77 on CUX_Assess (uuid_, companyId);
create unique index IX_AF7557B9 on CUX_Assess (uuid_, groupId);

create index IX_12E2BC1E on CUX_Product (productId);
create index IX_8E3CBC38 on CUX_Product (uuid_);
create index IX_760BF4F0 on CUX_Product (uuid_, companyId);
create unique index IX_B6ECF772 on CUX_Product (uuid_, groupId);