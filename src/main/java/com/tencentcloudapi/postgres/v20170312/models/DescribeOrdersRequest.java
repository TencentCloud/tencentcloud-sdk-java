package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeOrdersRequest  extends AbstractModel{


    /**
    * 订单名集合
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * 获取订单名集合
     * @return DealNames 订单名集合
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置订单名集合
     * @param DealNames 订单名集合
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

