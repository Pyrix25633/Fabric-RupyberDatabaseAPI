/*
 * This file is generated by jOOQ.
 */
package net.rupyber_studios.rupyber_database_api.jooq.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.rupyber_studios.rupyber_database_api.jooq.DefaultSchema;
import net.rupyber_studios.rupyber_database_api.jooq.Keys;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentsTable.Incidents;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.ResponseCodesRecord;

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
public class ResponseCodesTable extends TableImpl<ResponseCodesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ResponseCodes</code>
     */
    public static final ResponseCodesTable ResponseCodes = new ResponseCodesTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResponseCodesRecord> getRecordType() {
        return ResponseCodesRecord.class;
    }

    /**
     * The column <code>ResponseCodes.id</code>.
     */
    public final TableField<ResponseCodesRecord, Integer> id = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ResponseCodes.code</code>.
     */
    public final TableField<ResponseCodesRecord, String> code = createField(DSL.name("code"), SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>ResponseCodes.color</code>.
     */
    public final TableField<ResponseCodesRecord, Integer> color = createField(DSL.name("color"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ResponseCodes.description</code>.
     */
    public final TableField<ResponseCodesRecord, String> description = createField(DSL.name("description"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    private ResponseCodesTable(Name alias, Table<ResponseCodesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ResponseCodesTable(Name alias, Table<ResponseCodesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>ResponseCodes</code> table reference
     */
    public ResponseCodesTable(String alias) {
        this(DSL.name(alias), ResponseCodes);
    }

    /**
     * Create an aliased <code>ResponseCodes</code> table reference
     */
    public ResponseCodesTable(Name alias) {
        this(alias, ResponseCodes);
    }

    /**
     * Create a <code>ResponseCodes</code> table reference
     */
    public ResponseCodesTable() {
        this(DSL.name("ResponseCodes"), null);
    }

    public <O extends Record> ResponseCodesTable(Table<O> path, ForeignKey<O, ResponseCodesRecord> childPath, InverseForeignKey<O, ResponseCodesRecord> parentPath) {
        super(path, childPath, parentPath, ResponseCodes);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ResponseCodes extends ResponseCodesTable implements Path<ResponseCodesRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ResponseCodes(Table<O> path, ForeignKey<O, ResponseCodesRecord> childPath, InverseForeignKey<O, ResponseCodesRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ResponseCodes(Name alias, Table<ResponseCodesRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ResponseCodes as(String alias) {
            return new ResponseCodes(DSL.name(alias), this);
        }

        @Override
        public ResponseCodes as(Name alias) {
            return new ResponseCodes(alias, this);
        }

        @Override
        public ResponseCodes as(Table<?> alias) {
            return new ResponseCodes(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ResponseCodesRecord> getPrimaryKey() {
        return Keys.pk_ResponseCodes;
    }

    @Override
    public List<UniqueKey<ResponseCodesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.uk_ResponseCodes_28237986);
    }

    private transient Incidents _incidents;

    /**
     * Get the implicit to-many join path to the <code>Incidents</code> table
     */
    public Incidents incidents() {
        if (_incidents == null)
            _incidents = new Incidents(this, null, Keys.fk_Incidents_pk_ResponseCodes.getInverseKey());

        return _incidents;
    }

    @Override
    public ResponseCodesTable as(String alias) {
        return new ResponseCodesTable(DSL.name(alias), this);
    }

    @Override
    public ResponseCodesTable as(Name alias) {
        return new ResponseCodesTable(alias, this);
    }

    @Override
    public ResponseCodesTable as(Table<?> alias) {
        return new ResponseCodesTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResponseCodesTable rename(String name) {
        return new ResponseCodesTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResponseCodesTable rename(Name name) {
        return new ResponseCodesTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResponseCodesTable rename(Table<?> name) {
        return new ResponseCodesTable(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable where(Condition condition) {
        return new ResponseCodesTable(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ResponseCodesTable where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ResponseCodesTable where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ResponseCodesTable where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ResponseCodesTable where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ResponseCodesTable whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
