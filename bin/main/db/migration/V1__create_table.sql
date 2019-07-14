CREATE TABLE [dbo].[rule] (
    [id] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    [category] [varchar](64) NULL,
    [description] [varchar](500) NULL
);