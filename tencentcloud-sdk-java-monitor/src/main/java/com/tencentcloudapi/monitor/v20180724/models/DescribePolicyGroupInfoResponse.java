/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoResponse extends AbstractModel{

    /**
    * 策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 策略组所属的项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 是否为默认策略，0表示非默认策略，1表示默认策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 策略类型
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 策略说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略类型名称
    */
    @SerializedName("ShowName")
    @Expose
    private String ShowName;

    /**
    * 最近编辑的用户uin
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * 最近编辑时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 该策略支持的地域
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * 策略类型的维度列表
    */
    @SerializedName("DimensionGroup")
    @Expose
    private String [] DimensionGroup;

    /**
    * 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsConfig")
    @Expose
    private DescribePolicyGroupInfoCondition [] ConditionsConfig;

    /**
    * 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConfig")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConfig;

    /**
    * 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * 用户回调信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Callback")
    @Expose
    private DescribePolicyGroupInfoCallback Callback;

    /**
    * 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * 是否可以设置成默认策略
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略组名称 
     * @return GroupName 策略组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 策略组名称
     * @param GroupName 策略组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 策略组所属的项目id 
     * @return ProjectId 策略组所属的项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 策略组所属的项目id
     * @param ProjectId 策略组所属的项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否为默认策略，0表示非默认策略，1表示默认策略 
     * @return IsDefault 是否为默认策略，0表示非默认策略，1表示默认策略
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认策略，0表示非默认策略，1表示默认策略
     * @param IsDefault 是否为默认策略，0表示非默认策略，1表示默认策略
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 策略类型 
     * @return ViewName 策略类型
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略类型
     * @param ViewName 策略类型
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 策略说明 
     * @return Remark 策略说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略说明
     * @param Remark 策略说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 策略类型名称 
     * @return ShowName 策略类型名称
     */
    public String getShowName() {
        return this.ShowName;
    }

    /**
     * Set 策略类型名称
     * @param ShowName 策略类型名称
     */
    public void setShowName(String ShowName) {
        this.ShowName = ShowName;
    }

    /**
     * Get 最近编辑的用户uin 
     * @return LastEditUin 最近编辑的用户uin
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最近编辑的用户uin
     * @param LastEditUin 最近编辑的用户uin
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 最近编辑时间 
     * @return UpdateTime 最近编辑时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近编辑时间
     * @param UpdateTime 最近编辑时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 该策略支持的地域 
     * @return Region 该策略支持的地域
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 该策略支持的地域
     * @param Region 该策略支持的地域
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get 策略类型的维度列表 
     * @return DimensionGroup 策略类型的维度列表
     */
    public String [] getDimensionGroup() {
        return this.DimensionGroup;
    }

    /**
     * Set 策略类型的维度列表
     * @param DimensionGroup 策略类型的维度列表
     */
    public void setDimensionGroup(String [] DimensionGroup) {
        this.DimensionGroup = DimensionGroup;
    }

    /**
     * Get 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsConfig 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCondition [] getConditionsConfig() {
        return this.ConditionsConfig;
    }

    /**
     * Set 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsConfig 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsConfig(DescribePolicyGroupInfoCondition [] ConditionsConfig) {
        this.ConditionsConfig = ConditionsConfig;
    }

    /**
     * Get 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConfig 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConfig() {
        return this.EventConfig;
    }

    /**
     * Set 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConfig 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConfig(DescribePolicyGroupInfoEventCondition [] EventConfig) {
        this.EventConfig = EventConfig;
    }

    /**
     * Get 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get 用户回调信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Callback 用户回调信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCallback getCallback() {
        return this.Callback;
    }

    /**
     * Set 用户回调信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Callback 用户回调信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallback(DescribePolicyGroupInfoCallback Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 模板策略组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get 是否可以设置成默认策略 
     * @return CanSetDefault 是否可以设置成默认策略
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set 是否可以设置成默认策略
     * @param CanSetDefault 是否可以设置成默认策略
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get 是否且规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ShowName", this.ShowName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamArraySimple(map, prefix + "DimensionGroup.", this.DimensionGroup);
        this.setParamArrayObj(map, prefix + "ConditionsConfig.", this.ConditionsConfig);
        this.setParamArrayObj(map, prefix + "EventConfig.", this.EventConfig);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

