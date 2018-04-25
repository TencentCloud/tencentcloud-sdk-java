package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyDBInstanceNameRequest  extends AbstractModel{


    /**
    * 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;
    

    /**
     * 获取待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @return InstanceId 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     * @return InstanceName 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     * @param InstanceName 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

