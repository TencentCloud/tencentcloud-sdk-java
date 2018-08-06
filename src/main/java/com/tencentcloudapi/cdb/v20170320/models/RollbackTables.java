package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RollbackTables  extends AbstractModel{


    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表详情
    */
    @SerializedName("Table")
    @Expose
    private RollbackTableName [] Table;

    /**
     * 获取数据库名
     * @return Database 数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * 设置数据库名
     * @param Database 数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * 获取数据库表详情
     * @return Table 数据库表详情
     */
    public RollbackTableName [] getTable() {
        return this.Table;
    }

    /**
     * 设置数据库表详情
     * @param Table 数据库表详情
     */
    public void setTable(RollbackTableName [] Table) {
        this.Table = Table;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Table.", this.Table);

    }
}

