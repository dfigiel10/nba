CREATE TABLE game (
    id bigint NOT NULL AUTO_INCREMENT,
    homeTeam varbinary(255) DEFAULT null,
    awayTeam varbinary(255) DEFAULT null,
    homeTeamScore int NOT NULL,
    awayTeamScore int NOT NULL,
    winner varbinary(255) DEFAULT null,
    PRIMARY KEY (id)
);