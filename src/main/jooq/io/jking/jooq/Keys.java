/*
 * This file is generated by jOOQ.
 */
package io.jking.jooq;


import io.jking.jooq.tables.ActiveTicketData;
import io.jking.jooq.tables.GuildData;
import io.jking.jooq.tables.GuildTicketBlacklist;
import io.jking.jooq.tables.records.ActiveTicketDataRecord;
import io.jking.jooq.tables.records.GuildDataRecord;
import io.jking.jooq.tables.records.GuildTicketBlacklistRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActiveTicketDataRecord> ACTIVE_TICKET_DATA_PKEY = Internal.createUniqueKey(ActiveTicketData.ACTIVE_TICKET_DATA, DSL.name("active_ticket_data_pkey"), new TableField[] { ActiveTicketData.ACTIVE_TICKET_DATA.CHANNEL_ID }, true);
    public static final UniqueKey<GuildDataRecord> GUILD_DATA_PKEY = Internal.createUniqueKey(GuildData.GUILD_DATA, DSL.name("guild_data_pkey"), new TableField[] { GuildData.GUILD_DATA.GUILD_ID }, true);
    public static final UniqueKey<GuildTicketBlacklistRecord> GUILD_TICKET_BLACKLIST_PKEY = Internal.createUniqueKey(GuildTicketBlacklist.GUILD_TICKET_BLACKLIST, DSL.name("guild_ticket_blacklist_pkey"), new TableField[] { GuildTicketBlacklist.GUILD_TICKET_BLACKLIST.GUILD_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<GuildTicketBlacklistRecord, GuildDataRecord> GUILD_TICKET_BLACKLIST__GUILD_TICKET_BLACKLIST_GUILD_ID_FKEY = Internal.createForeignKey(GuildTicketBlacklist.GUILD_TICKET_BLACKLIST, DSL.name("guild_ticket_blacklist_guild_id_fkey"), new TableField[] { GuildTicketBlacklist.GUILD_TICKET_BLACKLIST.GUILD_ID }, Keys.GUILD_DATA_PKEY, new TableField[] { GuildData.GUILD_DATA.GUILD_ID }, true);
}
