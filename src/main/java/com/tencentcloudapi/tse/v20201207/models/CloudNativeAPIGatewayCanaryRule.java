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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayCanaryRule extends AbstractModel {

    /**
    * 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否启用规则
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 参数匹配条件
    */
    @SerializedName("ConditionList")
    @Expose
    private CloudNativeAPIGatewayCanaryRuleCondition [] ConditionList;

    /**
    * 服务的流量百分比配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BalancedServiceList")
    @Expose
    private CloudNativeAPIGatewayBalancedService [] BalancedServiceList;

    /**
    * 归属服务 ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 归属服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 灰度规则类别
Standard｜Lane
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 全链路灰度策略多个条件之间的匹配方式，与AND，或OR
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 泳道组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 泳道组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 泳道ID
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * 泳道名称
    */
    @SerializedName("LaneName")
    @Expose
    private String LaneName;

    /**
    * 泳道匹配规则：严格STRICT｜宽松PERMISSIVE
    */
    @SerializedName("MatchMode")
    @Expose
    private String MatchMode;

    /**
    * 泳道标签
    */
    @SerializedName("LaneTag")
    @Expose
    private String LaneTag;

    /**
     * Get 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复 
     * @return Priority 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
     * @param Priority 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否启用规则 
     * @return Enabled 是否启用规则
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用规则
     * @param Enabled 是否启用规则
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 参数匹配条件 
     * @return ConditionList 参数匹配条件
     */
    public CloudNativeAPIGatewayCanaryRuleCondition [] getConditionList() {
        return this.ConditionList;
    }

    /**
     * Set 参数匹配条件
     * @param ConditionList 参数匹配条件
     */
    public void setConditionList(CloudNativeAPIGatewayCanaryRuleCondition [] ConditionList) {
        this.ConditionList = ConditionList;
    }

    /**
     * Get 服务的流量百分比配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BalancedServiceList 服务的流量百分比配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudNativeAPIGatewayBalancedService [] getBalancedServiceList() {
        return this.BalancedServiceList;
    }

    /**
     * Set 服务的流量百分比配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param BalancedServiceList 服务的流量百分比配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBalancedServiceList(CloudNativeAPIGatewayBalancedService [] BalancedServiceList) {
        this.BalancedServiceList = BalancedServiceList;
    }

    /**
     * Get 归属服务 ID 
     * @return ServiceId 归属服务 ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 归属服务 ID
     * @param ServiceId 归属服务 ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 归属服务名称 
     * @return ServiceName 归属服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 归属服务名称
     * @param ServiceName 归属服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 灰度规则类别
Standard｜Lane 
     * @return RuleType 灰度规则类别
Standard｜Lane
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 灰度规则类别
Standard｜Lane
     * @param RuleType 灰度规则类别
Standard｜Lane
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 全链路灰度策略多个条件之间的匹配方式，与AND，或OR 
     * @return MatchType 全链路灰度策略多个条件之间的匹配方式，与AND，或OR
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 全链路灰度策略多个条件之间的匹配方式，与AND，或OR
     * @param MatchType 全链路灰度策略多个条件之间的匹配方式，与AND，或OR
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 泳道组ID 
     * @return GroupId 泳道组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 泳道组ID
     * @param GroupId 泳道组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 泳道组名称 
     * @return GroupName 泳道组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 泳道组名称
     * @param GroupName 泳道组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 泳道ID 
     * @return LaneId 泳道ID
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set 泳道ID
     * @param LaneId 泳道ID
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get 泳道名称 
     * @return LaneName 泳道名称
     */
    public String getLaneName() {
        return this.LaneName;
    }

    /**
     * Set 泳道名称
     * @param LaneName 泳道名称
     */
    public void setLaneName(String LaneName) {
        this.LaneName = LaneName;
    }

    /**
     * Get 泳道匹配规则：严格STRICT｜宽松PERMISSIVE 
     * @return MatchMode 泳道匹配规则：严格STRICT｜宽松PERMISSIVE
     */
    public String getMatchMode() {
        return this.MatchMode;
    }

    /**
     * Set 泳道匹配规则：严格STRICT｜宽松PERMISSIVE
     * @param MatchMode 泳道匹配规则：严格STRICT｜宽松PERMISSIVE
     */
    public void setMatchMode(String MatchMode) {
        this.MatchMode = MatchMode;
    }

    /**
     * Get 泳道标签 
     * @return LaneTag 泳道标签
     */
    public String getLaneTag() {
        return this.LaneTag;
    }

    /**
     * Set 泳道标签
     * @param LaneTag 泳道标签
     */
    public void setLaneTag(String LaneTag) {
        this.LaneTag = LaneTag;
    }

    public CloudNativeAPIGatewayCanaryRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayCanaryRule(CloudNativeAPIGatewayCanaryRule source) {
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ConditionList != null) {
            this.ConditionList = new CloudNativeAPIGatewayCanaryRuleCondition[source.ConditionList.length];
            for (int i = 0; i < source.ConditionList.length; i++) {
                this.ConditionList[i] = new CloudNativeAPIGatewayCanaryRuleCondition(source.ConditionList[i]);
            }
        }
        if (source.BalancedServiceList != null) {
            this.BalancedServiceList = new CloudNativeAPIGatewayBalancedService[source.BalancedServiceList.length];
            for (int i = 0; i < source.BalancedServiceList.length; i++) {
                this.BalancedServiceList[i] = new CloudNativeAPIGatewayBalancedService(source.BalancedServiceList[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
        if (source.LaneName != null) {
            this.LaneName = new String(source.LaneName);
        }
        if (source.MatchMode != null) {
            this.MatchMode = new String(source.MatchMode);
        }
        if (source.LaneTag != null) {
            this.LaneTag = new String(source.LaneTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "ConditionList.", this.ConditionList);
        this.setParamArrayObj(map, prefix + "BalancedServiceList.", this.BalancedServiceList);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "LaneName", this.LaneName);
        this.setParamSimple(map, prefix + "MatchMode", this.MatchMode);
        this.setParamSimple(map, prefix + "LaneTag", this.LaneTag);

    }
}

