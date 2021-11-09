/*
 * This file is generated by jOOQ.
 */
package io.jking.untitled.jooq;


import io.jking.untitled.jooq.tables.GuildData;
import io.jking.untitled.jooq.tables.records.GuildDataRecord;

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

    public static final UniqueKey<GuildDataRecord> GUILD_DATA_PKEY = Internal.createUniqueKey(GuildData.GUILD_DATA, DSL.name("guild_data_pkey"), new TableField[] { GuildData.GUILD_DATA.GUILD_ID }, true);
}