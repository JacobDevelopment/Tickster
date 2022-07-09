CREATE TABLE IF NOT EXISTS GUILD_DATA
(
    GUILD_ID                   BIGINT NOT NULL PRIMARY KEY,
    OWNER_ID                   BIGINT NOT NULL,
    TICKET_CREATION_CHANNEL_ID BIGINT NOT NULL DEFAULT 0,
    TICKET_LOGGING_CHANNEL_ID  BIGINT NOT NULL DEFAULT 0,
    TICKET_MASTER_ROLE_ID      BIGINT NOT NULL DEFAULT 0,
    TICKET_CATEGORY_ID         BIGINT NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS ACTIVE_TICKET_DATA
(
    CHANNEL_ID       BIGINT  NOT NULL PRIMARY KEY,
    GUILD_ID         BIGINT  NOT NULL,
    CREATOR_ID       BIGINT  NOT NULL,
    ALLOW_TRANSCRIPT BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS GUILD_TICKET_BLACKLIST
(
    GUILD_ID             BIGINT NOT NULL PRIMARY KEY REFERENCES GUILD_DATA (GUILD_ID) ON DELETE CASCADE,
    BLACKLISTED_USER_IDS BIGINT[]
);