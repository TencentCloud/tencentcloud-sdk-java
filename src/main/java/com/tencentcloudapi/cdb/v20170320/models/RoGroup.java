package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RoGroup  extends AbstractModel{


    /**
    * 只读组ID
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;
    

    /**
    * 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;
    

    /**
    * 只读组名称
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;
    

    /**
    * 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值值，只读实例将被隔离。可选值：1-启用；0-不启用
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Integer RoOfflineDelay;
    

    /**
    * 延迟阀值
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Integer RoMaxDelayTime;
    

    /**
    * 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Integer MinRoInGroup;
    

    /**
    * 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;
    

    /**
    * 权重值
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;
    

    /**
     * 获取只读组ID
     * @return RoGroupId 只读组ID
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * 设置只读组ID
     * @param RoGroupId 只读组ID
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * 获取只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     * @return RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * 设置只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     * @param RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * 获取只读组名称
     * @return RoGroupName 只读组名称
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * 设置只读组名称
     * @param RoGroupName 只读组名称
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * 获取是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值值，只读实例将被隔离。可选值：1-启用；0-不启用
     * @return RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值值，只读实例将被隔离。可选值：1-启用；0-不启用
     */
    public Integer getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * 设置是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值值，只读实例将被隔离。可选值：1-启用；0-不启用
     * @param RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值值，只读实例将被隔离。可选值：1-启用；0-不启用
     */
    public void setRoOfflineDelay(Integer RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * 获取延迟阀值
     * @return RoMaxDelayTime 延迟阀值
     */
    public Integer getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * 设置延迟阀值
     * @param RoMaxDelayTime 延迟阀值
     */
    public void setRoMaxDelayTime(Integer RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * 获取最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     * @return MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     */
    public Integer getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * 设置最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     * @param MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     */
    public void setMinRoInGroup(Integer MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * 获取读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     * @return WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * 设置读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     * @param WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * 获取权重值
     * @return Weight 权重值
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置权重值
     * @param Weight 权重值
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamSimple(map, prefix + "RoGroupMode", this.RoGroupMode);
        this.setParamSimple(map, prefix + "RoGroupName", this.RoGroupName);
        this.setParamSimple(map, prefix + "RoOfflineDelay", this.RoOfflineDelay);
        this.setParamSimple(map, prefix + "RoMaxDelayTime", this.RoMaxDelayTime);
        this.setParamSimple(map, prefix + "MinRoInGroup", this.MinRoInGroup);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

