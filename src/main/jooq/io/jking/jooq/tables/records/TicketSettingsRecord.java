/*
 * This file is generated by jOOQ.
 */
package io.jking.jooq.tables.records;


import io.jking.jooq.tables.TicketSettings;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketSettingsRecord extends UpdatableRecordImpl<TicketSettingsRecord> implements Record4<Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.ticket_settings.guild_id</code>.
     */
    public TicketSettingsRecord setGuildId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.ticket_settings.guild_id</code>.
     */
    public Long getGuildId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ticket_settings.category_id</code>.
     */
    public TicketSettingsRecord setCategoryId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.ticket_settings.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.ticket_settings.ticket_channel_id</code>.
     */
    public TicketSettingsRecord setTicketChannelId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.ticket_settings.ticket_channel_id</code>.
     */
    public Long getTicketChannelId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.ticket_settings.ticket_support_role_id</code>.
     */
    public TicketSettingsRecord setTicketSupportRoleId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.ticket_settings.ticket_support_role_id</code>.
     */
    public Long getTicketSupportRoleId() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TicketSettings.TICKET_SETTINGS.GUILD_ID;
    }

    @Override
    public Field<Long> field2() {
        return TicketSettings.TICKET_SETTINGS.CATEGORY_ID;
    }

    @Override
    public Field<Long> field3() {
        return TicketSettings.TICKET_SETTINGS.TICKET_CHANNEL_ID;
    }

    @Override
    public Field<Long> field4() {
        return TicketSettings.TICKET_SETTINGS.TICKET_SUPPORT_ROLE_ID;
    }

    @Override
    public Long component1() {
        return getGuildId();
    }

    @Override
    public Long component2() {
        return getCategoryId();
    }

    @Override
    public Long component3() {
        return getTicketChannelId();
    }

    @Override
    public Long component4() {
        return getTicketSupportRoleId();
    }

    @Override
    public Long value1() {
        return getGuildId();
    }

    @Override
    public Long value2() {
        return getCategoryId();
    }

    @Override
    public Long value3() {
        return getTicketChannelId();
    }

    @Override
    public Long value4() {
        return getTicketSupportRoleId();
    }

    @Override
    public TicketSettingsRecord value1(Long value) {
        setGuildId(value);
        return this;
    }

    @Override
    public TicketSettingsRecord value2(Long value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public TicketSettingsRecord value3(Long value) {
        setTicketChannelId(value);
        return this;
    }

    @Override
    public TicketSettingsRecord value4(Long value) {
        setTicketSupportRoleId(value);
        return this;
    }

    @Override
    public TicketSettingsRecord values(Long value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketSettingsRecord
     */
    public TicketSettingsRecord() {
        super(TicketSettings.TICKET_SETTINGS);
    }

    /**
     * Create a detached, initialised TicketSettingsRecord
     */
    public TicketSettingsRecord(Long guildId, Long categoryId, Long ticketChannelId, Long ticketSupportRoleId) {
        super(TicketSettings.TICKET_SETTINGS);

        setGuildId(guildId);
        setCategoryId(categoryId);
        setTicketChannelId(ticketChannelId);
        setTicketSupportRoleId(ticketSupportRoleId);
    }

    /**
     * Create a detached, initialised TicketSettingsRecord
     */
    public TicketSettingsRecord(io.jking.jooq.tables.pojos.TicketSettings value) {
        super(TicketSettings.TICKET_SETTINGS);

        if (value != null) {
            setGuildId(value.getGuildId());
            setCategoryId(value.getCategoryId());
            setTicketChannelId(value.getTicketChannelId());
            setTicketSupportRoleId(value.getTicketSupportRoleId());
        }
    }
}
