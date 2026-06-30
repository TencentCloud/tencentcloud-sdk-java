/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoResponse extends AbstractModel {

    /**
    * <p>策略组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>策略组所属的项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>策略说明</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>策略类型名称</p>
    */
    @SerializedName("ShowName")
    @Expose
    private String ShowName;

    /**
    * <p>最近编辑的用户uin</p>
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * <p>最近编辑时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>该策略支持的地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * <p>策略类型的维度列表</p>
    */
    @SerializedName("DimensionGroup")
    @Expose
    private String [] DimensionGroup;

    /**
    * <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsConfig")
    @Expose
    private DescribePolicyGroupInfoCondition [] ConditionsConfig;

    /**
    * <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConfig")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConfig;

    /**
    * <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * <p>用户回调信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Callback")
    @Expose
    private DescribePolicyGroupInfoCallback Callback;

    /**
    * <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * <p>是否可以设置成默认策略</p>
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * <p>是否且规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>策略组名称</p> 
     * @return GroupName <p>策略组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>策略组名称</p>
     * @param GroupName <p>策略组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>策略组所属的项目id</p> 
     * @return ProjectId <p>策略组所属的项目id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>策略组所属的项目id</p>
     * @param ProjectId <p>策略组所属的项目id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否为默认策略，0表示非默认策略，1表示默认策略</p> 
     * @return IsDefault <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     * @param IsDefault <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>策略类型</p> 
     * @return ViewName <p>策略类型</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>策略类型</p>
     * @param ViewName <p>策略类型</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>策略说明</p> 
     * @return Remark <p>策略说明</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>策略说明</p>
     * @param Remark <p>策略说明</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>策略类型名称</p> 
     * @return ShowName <p>策略类型名称</p>
     */
    public String getShowName() {
        return this.ShowName;
    }

    /**
     * Set <p>策略类型名称</p>
     * @param ShowName <p>策略类型名称</p>
     */
    public void setShowName(String ShowName) {
        this.ShowName = ShowName;
    }

    /**
     * Get <p>最近编辑的用户uin</p> 
     * @return LastEditUin <p>最近编辑的用户uin</p>
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最近编辑的用户uin</p>
     * @param LastEditUin <p>最近编辑的用户uin</p>
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>最近编辑时间</p> 
     * @return UpdateTime <p>最近编辑时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近编辑时间</p>
     * @param UpdateTime <p>最近编辑时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>该策略支持的地域</p> 
     * @return Region <p>该策略支持的地域</p>
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set <p>该策略支持的地域</p>
     * @param Region <p>该策略支持的地域</p>
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get <p>策略类型的维度列表</p> 
     * @return DimensionGroup <p>策略类型的维度列表</p>
     */
    public String [] getDimensionGroup() {
        return this.DimensionGroup;
    }

    /**
     * Set <p>策略类型的维度列表</p>
     * @param DimensionGroup <p>策略类型的维度列表</p>
     */
    public void setDimensionGroup(String [] DimensionGroup) {
        this.DimensionGroup = DimensionGroup;
    }

    /**
     * Get <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsConfig <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCondition [] getConditionsConfig() {
        return this.ConditionsConfig;
    }

    /**
     * Set <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsConfig <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsConfig(DescribePolicyGroupInfoCondition [] ConditionsConfig) {
        this.ConditionsConfig = ConditionsConfig;
    }

    /**
     * Get <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConfig <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConfig() {
        return this.EventConfig;
    }

    /**
     * Set <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConfig <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConfig(DescribePolicyGroupInfoEventCondition [] EventConfig) {
        this.EventConfig = EventConfig;
    }

    /**
     * Get <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get <p>用户回调信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Callback <p>用户回调信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCallback getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>用户回调信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Callback <p>用户回调信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallback(DescribePolicyGroupInfoCallback Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get <p>是否可以设置成默认策略</p> 
     * @return CanSetDefault <p>是否可以设置成默认策略</p>
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set <p>是否可以设置成默认策略</p>
     * @param CanSetDefault <p>是否可以设置成默认策略</p>
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get <p>是否且规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule <p>是否且规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>是否且规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule <p>是否且规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePolicyGroupInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoResponse(DescribePolicyGroupInfoResponse source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ShowName != null) {
            this.ShowName = new String(source.ShowName);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.DimensionGroup != null) {
            this.DimensionGroup = new String[source.DimensionGroup.length];
            for (int i = 0; i < source.DimensionGroup.length; i++) {
                this.DimensionGroup[i] = new String(source.DimensionGroup[i]);
            }
        }
        if (source.ConditionsConfig != null) {
            this.ConditionsConfig = new DescribePolicyGroupInfoCondition[source.ConditionsConfig.length];
            for (int i = 0; i < source.ConditionsConfig.length; i++) {
                this.ConditionsConfig[i] = new DescribePolicyGroupInfoCondition(source.ConditionsConfig[i]);
            }
        }
        if (source.EventConfig != null) {
            this.EventConfig = new DescribePolicyGroupInfoEventCondition[source.EventConfig.length];
            for (int i = 0; i < source.EventConfig.length; i++) {
                this.EventConfig[i] = new DescribePolicyGroupInfoEventCondition(source.EventConfig[i]);
            }
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new DescribePolicyGroupInfoReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new DescribePolicyGroupInfoReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.Callback != null) {
            this.Callback = new DescribePolicyGroupInfoCallback(source.Callback);
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new DescribePolicyGroupInfoConditionTpl(source.ConditionsTemp);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

