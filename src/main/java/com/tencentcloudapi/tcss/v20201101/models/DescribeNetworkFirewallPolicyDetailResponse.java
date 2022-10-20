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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkFirewallPolicyDetailResponse extends AbstractModel{

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 策略名
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 入站类型
    */
    @SerializedName("FromPolicyRule")
    @Expose
    private Long FromPolicyRule;

    /**
    * 出站类型
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * 自定义规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomPolicy")
    @Expose
    private NetworkCustomPolicy [] CustomPolicy;

    /**
    * pod选择器
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 策略创建时间
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private String PolicyCreateTime;

    /**
    * 策略源类型，分为System和Manual，分别代表手动和系统添加
    */
    @SerializedName("PolicySourceType")
    @Expose
    private String PolicySourceType;

    /**
    * 网络策略对应的网络插件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * 网络策略状态
    */
    @SerializedName("PublishStatus")
    @Expose
    private String PublishStatus;

    /**
    * 网络发布结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 策略名 
     * @return PolicyName 策略名
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名
     * @param PolicyName 策略名
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 入站类型 
     * @return FromPolicyRule 入站类型
     */
    public Long getFromPolicyRule() {
        return this.FromPolicyRule;
    }

    /**
     * Set 入站类型
     * @param FromPolicyRule 入站类型
     */
    public void setFromPolicyRule(Long FromPolicyRule) {
        this.FromPolicyRule = FromPolicyRule;
    }

    /**
     * Get 出站类型 
     * @return ToPolicyRule 出站类型
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set 出站类型
     * @param ToPolicyRule 出站类型
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
    }

    /**
     * Get 自定义规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomPolicy 自定义规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkCustomPolicy [] getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set 自定义规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomPolicy 自定义规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomPolicy(NetworkCustomPolicy [] CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get pod选择器 
     * @return PodSelector pod选择器
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set pod选择器
     * @param PodSelector pod选择器
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 策略创建时间 
     * @return PolicyCreateTime 策略创建时间
     */
    public String getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set 策略创建时间
     * @param PolicyCreateTime 策略创建时间
     */
    public void setPolicyCreateTime(String PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get 策略源类型，分为System和Manual，分别代表手动和系统添加 
     * @return PolicySourceType 策略源类型，分为System和Manual，分别代表手动和系统添加
     */
    public String getPolicySourceType() {
        return this.PolicySourceType;
    }

    /**
     * Set 策略源类型，分为System和Manual，分别代表手动和系统添加
     * @param PolicySourceType 策略源类型，分为System和Manual，分别代表手动和系统添加
     */
    public void setPolicySourceType(String PolicySourceType) {
        this.PolicySourceType = PolicySourceType;
    }

    /**
     * Get 网络策略对应的网络插件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkPolicyPlugin 网络策略对应的网络插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set 网络策略对应的网络插件
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkPolicyPlugin 网络策略对应的网络插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
    }

    /**
     * Get 网络策略状态 
     * @return PublishStatus 网络策略状态
     */
    public String getPublishStatus() {
        return this.PublishStatus;
    }

    /**
     * Set 网络策略状态
     * @param PublishStatus 网络策略状态
     */
    public void setPublishStatus(String PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    /**
     * Get 网络发布结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishResult 网络发布结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishResult() {
        return this.PublishResult;
    }

    /**
     * Set 网络发布结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishResult 网络发布结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishResult(String PublishResult) {
        this.PublishResult = PublishResult;
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

    public DescribeNetworkFirewallPolicyDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkFirewallPolicyDetailResponse(DescribeNetworkFirewallPolicyDetailResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FromPolicyRule != null) {
            this.FromPolicyRule = new Long(source.FromPolicyRule);
        }
        if (source.ToPolicyRule != null) {
            this.ToPolicyRule = new Long(source.ToPolicyRule);
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new NetworkCustomPolicy[source.CustomPolicy.length];
            for (int i = 0; i < source.CustomPolicy.length; i++) {
                this.CustomPolicy[i] = new NetworkCustomPolicy(source.CustomPolicy[i]);
            }
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new String(source.PolicyCreateTime);
        }
        if (source.PolicySourceType != null) {
            this.PolicySourceType = new String(source.PolicySourceType);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.PublishStatus != null) {
            this.PublishStatus = new String(source.PublishStatus);
        }
        if (source.PublishResult != null) {
            this.PublishResult = new String(source.PublishResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamArrayObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "PolicySourceType", this.PolicySourceType);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "PublishStatus", this.PublishStatus);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

