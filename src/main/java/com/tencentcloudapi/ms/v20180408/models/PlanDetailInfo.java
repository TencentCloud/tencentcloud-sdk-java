package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class PlanDetailInfo  extends AbstractModel{


    /**
    * 默认策略，1为默认，0为非默认
    */
    @SerializedName("IsDefault")
    @Expose
    private Integer IsDefault;

    /**
    * 策略id
    */
    @SerializedName("PlanId")
    @Expose
    private Integer PlanId;

    /**
    * 策略名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 策略信息
    */
    @SerializedName("PlanInfo")
    @Expose
    private PlanInfo PlanInfo;

    /**
     * 获取默认策略，1为默认，0为非默认
     * @return IsDefault 默认策略，1为默认，0为非默认
     */
    public Integer getIsDefault() {
        return this.IsDefault;
    }

    /**
     * 设置默认策略，1为默认，0为非默认
     * @param IsDefault 默认策略，1为默认，0为非默认
     */
    public void setIsDefault(Integer IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * 获取策略id
     * @return PlanId 策略id
     */
    public Integer getPlanId() {
        return this.PlanId;
    }

    /**
     * 设置策略id
     * @param PlanId 策略id
     */
    public void setPlanId(Integer PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * 获取策略名称
     * @return PlanName 策略名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * 设置策略名称
     * @param PlanName 策略名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * 获取策略信息
     * @return PlanInfo 策略信息
     */
    public PlanInfo getPlanInfo() {
        return this.PlanInfo;
    }

    /**
     * 设置策略信息
     * @param PlanInfo 策略信息
     */
    public void setPlanInfo(PlanInfo PlanInfo) {
        this.PlanInfo = PlanInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamObj(map, prefix + "PlanInfo.", this.PlanInfo);

    }
}

