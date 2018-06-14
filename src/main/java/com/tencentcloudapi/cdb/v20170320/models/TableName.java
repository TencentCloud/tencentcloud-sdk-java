package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TableName  extends AbstractModel{


    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * 获取表名
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * 设置表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

