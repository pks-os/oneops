/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.CmsVarsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmsVars extends TableImpl<CmsVarsRecord> {

    private static final long serialVersionUID = 866903110;

    /**
     * The reference instance of <code>kloopzcm.cms_vars</code>
     */
    public static final CmsVars CMS_VARS = new CmsVars();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsVarsRecord> getRecordType() {
        return CmsVarsRecord.class;
    }

    /**
     * The column <code>kloopzcm.cms_vars.var_id</code>.
     */
    public final TableField<CmsVarsRecord, Long> VAR_ID = createField("var_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.var_name</code>.
     */
    public final TableField<CmsVarsRecord, String> VAR_NAME = createField("var_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.var_value</code>.
     */
    public final TableField<CmsVarsRecord, String> VAR_VALUE = createField("var_value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.updated_by</code>.
     */
    public final TableField<CmsVarsRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.created</code>.
     */
    public final TableField<CmsVarsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.updated</code>.
     */
    public final TableField<CmsVarsRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_vars.criteria</code>.
     */
    public final TableField<CmsVarsRecord, String> CRITERIA = createField("criteria", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * Create a <code>kloopzcm.cms_vars</code> table reference
     */
    public CmsVars() {
        this(DSL.name("cms_vars"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.cms_vars</code> table reference
     */
    public CmsVars(String alias) {
        this(DSL.name(alias), CMS_VARS);
    }

    /**
     * Create an aliased <code>kloopzcm.cms_vars</code> table reference
     */
    public CmsVars(Name alias) {
        this(alias, CMS_VARS);
    }

    private CmsVars(Name alias, Table<CmsVarsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsVars(Name alias, Table<CmsVarsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CMS_VARS_IDX1, Indexes.CMS_VARS_IDX2, Indexes.CMS_VARS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsVarsRecord> getPrimaryKey() {
        return Keys.CMS_VARS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsVarsRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsVarsRecord>>asList(Keys.CMS_VARS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsVars as(String alias) {
        return new CmsVars(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsVars as(Name alias) {
        return new CmsVars(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsVars rename(String name) {
        return new CmsVars(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsVars rename(Name name) {
        return new CmsVars(name, null);
    }
}
