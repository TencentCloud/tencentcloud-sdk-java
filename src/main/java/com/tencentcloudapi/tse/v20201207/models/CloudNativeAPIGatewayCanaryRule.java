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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayCanaryRule extends AbstractModel{

    /**
    * 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否启用规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 参数匹配条件
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 归属服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先级，值范围为 0 到 100；值越大，优先级越高；不同规则间优先级不可重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否启用规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 是否启用规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 是否启用规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 参数匹配条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionList 参数匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudNativeAPIGatewayCanaryRuleCondition [] getConditionList() {
        return this.ConditionList;
    }

    /**
     * Set 参数匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionList 参数匹配条件
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 归属服务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 归属服务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 归属服务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 归属服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 归属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 归属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 归属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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

    }
}

