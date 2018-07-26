package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ShieldPlanInfo  extends AbstractModel{


    /**
    * 加固策略数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 加固策略具体信息数组
    */
    @SerializedName("PlanSet")
    @Expose
    private PlanDetailInfo [] PlanSet;

    /**
     * 获取加固策略数量
     * @return TotalCount 加固策略数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置加固策略数量
     * @param TotalCount 加固策略数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取加固策略具体信息数组
     * @return PlanSet 加固策略具体信息数组
     */
    public PlanDetailInfo [] getPlanSet() {
        return this.PlanSet;
    }

    /**
     * 设置加固策略具体信息数组
     * @param PlanSet 加固策略具体信息数组
     */
    public void setPlanSet(PlanDetailInfo [] PlanSet) {
        this.PlanSet = PlanSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PlanSet.", this.PlanSet);

    }
}

