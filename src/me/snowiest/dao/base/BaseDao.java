package me.snowiest.dao.base;

import me.snowiest.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.List;

public class BaseDao<T> {

    public int update(String sql, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            return new QueryRunner().update(connection, sql, params);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection);
        }
        return -1;
    }

    public <T> T queryOne(String sql, Class<T> aClass, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            return new QueryRunner().query(connection, sql, new BeanHandler<>(aClass), params);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection);
        }
        return null;
    }

    public List<T> queryList(String sql, Class<T> aClass, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            return new QueryRunner().query(
                    connection, sql,
                    new BeanListHandler<>(aClass),
                    params);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection);
        }
        return null;
    }
}
