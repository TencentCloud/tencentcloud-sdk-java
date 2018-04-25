package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyDBParametersRequest  extends AbstractModel{


    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 参数列表，每一个元素是Param和Value的组合
    */
    @SerializedName("Params")
    @Expose
    private DBParamValue [] Params;
    

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取参数列表，每一个元素是Param和Value的组合
     * @return Params 参数列表，每一个元素是Param和Value的组合
     */
    public DBParamValue [] getParams() {
        return this.Params;
    }

    /**
     * 设置参数列表，每一个元素是Param和Value的组合
     * @param Params 参数列表，每一个元素是Param和Value的组合
     */
    public void setParams(DBParamValue [] Params) {
        this.Params = Params;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

