CREATE TABLE IF NOT EXISTS guild_tickets
(
    id          SERIAL PRIMARY KEY NOT NULL,
    guild_id    BIGINT             NOT NULL,
    channel_id  BIGINT             NOT NULL,
    category_id BIGINT             NOT NULL,
    creator_id  BIGINT             NOT NULL,
    transcript  TEXT default 'Transcript not set.'
);