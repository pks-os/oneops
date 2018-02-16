/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class DjRmRfcCi extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 271394635;

    /**
     * The parameter <code>kloopzcm.dj_rm_rfc_ci.p_rfc_id</code>.
     */
    public static final Parameter<Long> P_RFC_ID = createParameter("p_rfc_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public DjRmRfcCi() {
        super("dj_rm_rfc_ci", Kloopzcm.KLOOPZCM);

        addInParameter(P_RFC_ID);
    }

    /**
     * Set the <code>p_rfc_id</code> parameter IN value to the routine
     */
    public void setPRfcId(Long value) {
        setValue(P_RFC_ID, value);
    }
}
