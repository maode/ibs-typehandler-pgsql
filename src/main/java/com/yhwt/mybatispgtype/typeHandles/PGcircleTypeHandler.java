package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.geometric.PGcircle;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(PGcircle.class)
public class PGcircleTypeHandler extends BaseTypeHandler<PGcircle> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, PGcircle parameter, JdbcType jdbcType) throws SQLException {

        ps.setObject(i,parameter);
    }

    @Override
    public PGcircle getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return (PGcircle)rs.getObject(columnName);
    }

    @Override
    public PGcircle getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return (PGcircle) rs.getObject(columnIndex);
    }

    @Override
    public PGcircle getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (PGcircle) cs.getObject(columnIndex);
    }
}
