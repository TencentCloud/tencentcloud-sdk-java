package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DatabasePrivilege  extends AbstractModel{


    /**
    * 权限信息
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;
    

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;
    

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "Database", this.Database);

    }
}

