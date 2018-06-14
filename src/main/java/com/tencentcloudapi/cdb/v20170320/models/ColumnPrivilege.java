package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ColumnPrivilege  extends AbstractModel{


    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 数据库列名
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * 权限信息
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

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
     * 获取数据库表名
     * @return Table 数据库表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * 设置数据库表名
     * @param Table 数据库表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * 获取数据库列名
     * @return Column 数据库列名
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * 设置数据库列名
     * @param Column 数据库列名
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * 获取权限信息
     * @return Privileges 权限信息
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * 设置权限信息
     * @param Privileges 权限信息
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

