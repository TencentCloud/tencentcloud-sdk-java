package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DatabaseName  extends AbstractModel{


    /**
    * 数据库表名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;
    

    /**
     * 获取数据库表名
     * @return DatabaseName 数据库表名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * 设置数据库表名
     * @param DatabaseName 数据库表名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);

    }
}

