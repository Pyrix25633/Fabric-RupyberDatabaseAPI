/*
 * This file is generated by jOOQ.
 */
package net.rupyber_studios.rupyber_database_api.jooq.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.rupyber_studios.rupyber_database_api.jooq.DefaultSchema;
import net.rupyber_studios.rupyber_database_api.jooq.Keys;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentPlayersTable.IncidentPlayers;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.RolesRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolesTable extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Roles</code>
     */
    public static final RolesTable Roles = new RolesTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>Roles.id</code>.
     */
    public final TableField<RolesRecord, Integer> id = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Roles.role</code>.
     */
    public final TableField<RolesRecord, String> role = createField(DSL.name("role"), SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Roles.color</code>.
     */
    public final TableField<RolesRecord, Integer> color = createField(DSL.name("color"), SQLDataType.INTEGER.nullable(false), this, "");

    private RolesTable(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private RolesTable(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>Roles</code> table reference
     */
    public RolesTable(String alias) {
        this(DSL.name(alias), Roles);
    }

    /**
     * Create an aliased <code>Roles</code> table reference
     */
    public RolesTable(Name alias) {
        this(alias, Roles);
    }

    /**
     * Create a <code>Roles</code> table reference
     */
    public RolesTable() {
        this(DSL.name("Roles"), null);
    }

    public <O extends Record> RolesTable(Table<O> path, ForeignKey<O, RolesRecord> childPath, InverseForeignKey<O, RolesRecord> parentPath) {
        super(path, childPath, parentPath, Roles);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class Roles extends RolesTable implements Path<RolesRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> Roles(Table<O> path, ForeignKey<O, RolesRecord> childPath, InverseForeignKey<O, RolesRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private Roles(Name alias, Table<RolesRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public Roles as(String alias) {
            return new Roles(DSL.name(alias), this);
        }

        @Override
        public Roles as(Name alias) {
            return new Roles(alias, this);
        }

        @Override
        public Roles as(Table<?> alias) {
            return new Roles(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.pk_Roles;
    }

    @Override
    public List<UniqueKey<RolesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.uk_Roles_90990481);
    }

    private transient IncidentPlayers _incidentplayers;

    /**
     * Get the implicit to-many join path to the <code>IncidentPlayers</code>
     * table
     */
    public IncidentPlayers incidentplayers() {
        if (_incidentplayers == null)
            _incidentplayers = new IncidentPlayers(this, null, Keys.fk_IncidentPlayers_pk_Roles.getInverseKey());

        return _incidentplayers;
    }

    @Override
    public RolesTable as(String alias) {
        return new RolesTable(DSL.name(alias), this);
    }

    @Override
    public RolesTable as(Name alias) {
        return new RolesTable(alias, this);
    }

    @Override
    public RolesTable as(Table<?> alias) {
        return new RolesTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesTable rename(String name) {
        return new RolesTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesTable rename(Name name) {
        return new RolesTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesTable rename(Table<?> name) {
        return new RolesTable(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable where(Condition condition) {
        return new RolesTable(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RolesTable where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RolesTable where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RolesTable where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RolesTable where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RolesTable whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
