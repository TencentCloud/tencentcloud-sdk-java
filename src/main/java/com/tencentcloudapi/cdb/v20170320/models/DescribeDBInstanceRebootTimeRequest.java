package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstanceRebootTimeRequest  extends AbstractModel{


    /**
    * 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
     * 获取实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceIds 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceIds 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

