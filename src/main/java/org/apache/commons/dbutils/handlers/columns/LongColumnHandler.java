package org.apache.commons.dbutils.handlers.columns;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ColumnHandler;

/**
 * 
 * @author ygh 2016年12月28日
 */
public class LongColumnHandler implements ColumnHandler {

    public boolean match(Class<?> propType) {
        if (propType.equals(Long.class) || propType.equals(Long.TYPE)) {
            return true;
        }
        return false;
    }

    public Object apply(ResultSet rs, int columnIndex) throws SQLException {
        return Long.valueOf(rs.getLong(columnIndex));
    }

}
