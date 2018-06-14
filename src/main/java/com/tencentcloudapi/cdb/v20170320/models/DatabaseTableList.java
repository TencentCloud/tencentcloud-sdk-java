package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DatabaseTableList  extends AbstractModel{


    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据表数组
    */
    @SerializedName("TableList")
    @Expose
    private String [] TableList;

    /**
     * 获取数据库名
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * 设置数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * 获取数据表数组
     * @return TableList 数据表数组
     */
    public String [] getTableList() {
        return this.TableList;
    }

    /**
     * 设置数据表数组
     * @param TableList 数据表数组
     */
    public void setTableList(String [] TableList) {
        this.TableList = TableList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "TableList.", this.TableList);

    }
}

