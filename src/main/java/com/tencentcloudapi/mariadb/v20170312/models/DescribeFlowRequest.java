package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeFlowRequest  extends AbstractModel{


    /**
    * 异步请求接口返回的任务流程号。
    */
    @SerializedName("FlowId")
    @Expose
    private Integer FlowId;
    

    /**
     * 获取异步请求接口返回的任务流程号。
     * @return FlowId 异步请求接口返回的任务流程号。
     */
    public Integer getFlowId() {
        return this.FlowId;
    }

    /**
     * 设置异步请求接口返回的任务流程号。
     * @param FlowId 异步请求接口返回的任务流程号。
     */
    public void setFlowId(Integer FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

