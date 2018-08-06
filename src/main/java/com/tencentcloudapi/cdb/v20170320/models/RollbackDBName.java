package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RollbackDBName  extends AbstractModel{


    /**
    * 回档前的原数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 回档后的新数据库名
    */
    @SerializedName("NewDatabaseName")
    @Expose
    private String NewDatabaseName;

    /**
     * 获取回档前的原数据库名
     * @return DatabaseName 回档前的原数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * 设置回档前的原数据库名
     * @param DatabaseName 回档前的原数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * 获取回档后的新数据库名
     * @return NewDatabaseName 回档后的新数据库名
     */
    public String getNewDatabaseName() {
        return this.NewDatabaseName;
    }

    /**
     * 设置回档后的新数据库名
     * @param NewDatabaseName 回档后的新数据库名
     */
    public void setNewDatabaseName(String NewDatabaseName) {
        this.NewDatabaseName = NewDatabaseName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NewDatabaseName", this.NewDatabaseName);

    }
}

