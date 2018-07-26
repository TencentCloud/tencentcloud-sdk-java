package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstanceMarketOptionsRequest  extends AbstractModel{


    /**
    * 市场选项类型，当前只支持取值：spot
    */
    @SerializedName("MarketType")
    @Expose
    private String MarketType;

    /**
    * 竞价相关选项
    */
    @SerializedName("SpotOptions")
    @Expose
    private SpotMarketOptions SpotOptions;

    /**
     * 获取市场选项类型，当前只支持取值：spot
     * @return MarketType 市场选项类型，当前只支持取值：spot
     */
    public String getMarketType() {
        return this.MarketType;
    }

    /**
     * 设置市场选项类型，当前只支持取值：spot
     * @param MarketType 市场选项类型，当前只支持取值：spot
     */
    public void setMarketType(String MarketType) {
        this.MarketType = MarketType;
    }

    /**
     * 获取竞价相关选项
     * @return SpotOptions 竞价相关选项
     */
    public SpotMarketOptions getSpotOptions() {
        return this.SpotOptions;
    }

    /**
     * 设置竞价相关选项
     * @param SpotOptions 竞价相关选项
     */
    public void setSpotOptions(SpotMarketOptions SpotOptions) {
        this.SpotOptions = SpotOptions;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarketType", this.MarketType);
        this.setParamObj(map, prefix + "SpotOptions.", this.SpotOptions);

    }
}

