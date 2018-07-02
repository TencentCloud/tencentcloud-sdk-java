package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SetAutoRenewFlagRequest  extends AbstractModel{


    /**
    * 实例ID数组
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 续费标记。0-正常续费；1-自动续费；2-到期不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
     * 获取实例ID数组
     * @return DBInstanceIdSet 实例ID数组
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * 设置实例ID数组
     * @param DBInstanceIdSet 实例ID数组
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * 获取续费标记。0-正常续费；1-自动续费；2-到期不续费
     * @return AutoRenewFlag 续费标记。0-正常续费；1-自动续费；2-到期不续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置续费标记。0-正常续费；1-自动续费；2-到期不续费
     * @param AutoRenewFlag 续费标记。0-正常续费；1-自动续费；2-到期不续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

