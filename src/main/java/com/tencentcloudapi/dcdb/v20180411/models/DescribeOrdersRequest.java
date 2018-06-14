package com.tencentcloudapi.dcdb.v20180411.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeOrdersRequest  extends AbstractModel{


    /**
    * 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * 获取待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     * @return DealNames 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     * @param DealNames 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
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

