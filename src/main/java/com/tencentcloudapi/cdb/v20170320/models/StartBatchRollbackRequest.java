package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class StartBatchRollbackRequest  extends AbstractModel{


    /**
    * 用于回档的实例详情信息
    */
    @SerializedName("Instances")
    @Expose
    private RollbackInstancesInfo [] Instances;

    /**
     * 获取用于回档的实例详情信息
     * @return Instances 用于回档的实例详情信息
     */
    public RollbackInstancesInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * 设置用于回档的实例详情信息
     * @param Instances 用于回档的实例详情信息
     */
    public void setInstances(RollbackInstancesInfo [] Instances) {
        this.Instances = Instances;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

