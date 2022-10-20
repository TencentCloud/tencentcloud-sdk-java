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

public class NetworkPolicyInfoItem extends AbstractModel{

    /**
    * 网络策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网络策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 发布状态：

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
    */
    @SerializedName("PublishStatus")
    @Expose
    private String PublishStatus;

    /**
    * 策略类型：

自动发现：System

手动添加：Manual
    */
    @SerializedName("PolicySourceType")
    @Expose
    private String PolicySourceType;

    /**
    * 策略空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 策略创建日期
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private String PolicyCreateTime;

    /**
    * 策略类型

kube-router：KubeRouter

cilium：Cilium
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * 策略发布结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

    /**
    * 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
    */
    @SerializedName("FromPolicyRule")
    @Expose
    private Long FromPolicyRule;

    /**
    * 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * 作用对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * 网络策略Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 网络策略名 
     * @return Name 网络策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网络策略名
     * @param Name 网络策略名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网络策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 网络策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 网络策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 网络策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 发布状态：

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit 
     * @return PublishStatus 发布状态：

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
     */
    public String getPublishStatus() {
        return this.PublishStatus;
    }

    /**
     * Set 发布状态：

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
     * @param PublishStatus 发布状态：

开启待确认：PublishedNoConfirm

开启已确认：PublishedConfirmed

关闭中：unPublishing

开启中：Publishing

待开启：unPublishEdit
     */
    public void setPublishStatus(String PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    /**
     * Get 策略类型：

自动发现：System

手动添加：Manual 
     * @return PolicySourceType 策略类型：

自动发现：System

手动添加：Manual
     */
    public String getPolicySourceType() {
        return this.PolicySourceType;
    }

    /**
     * Set 策略类型：

自动发现：System

手动添加：Manual
     * @param PolicySourceType 策略类型：

自动发现：System

手动添加：Manual
     */
    public void setPolicySourceType(String PolicySourceType) {
        this.PolicySourceType = PolicySourceType;
    }

    /**
     * Get 策略空间 
     * @return Namespace 策略空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 策略空间
     * @param Namespace 策略空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 策略创建日期 
     * @return PolicyCreateTime 策略创建日期
     */
    public String getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set 策略创建日期
     * @param PolicyCreateTime 策略创建日期
     */
    public void setPolicyCreateTime(String PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get 策略类型

kube-router：KubeRouter

cilium：Cilium 
     * @return NetworkPolicyPlugin 策略类型

kube-router：KubeRouter

cilium：Cilium
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set 策略类型

kube-router：KubeRouter

cilium：Cilium
     * @param NetworkPolicyPlugin 策略类型

kube-router：KubeRouter

cilium：Cilium
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
    }

    /**
     * Get 策略发布结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishResult 策略发布结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishResult() {
        return this.PublishResult;
    }

    /**
     * Set 策略发布结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishResult 策略发布结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishResult(String PublishResult) {
        this.PublishResult = PublishResult;
    }

    /**
     * Get 入站规则

全部允许：1

全部拒绝 ：2

自定义：3 
     * @return FromPolicyRule 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public Long getFromPolicyRule() {
        return this.FromPolicyRule;
    }

    /**
     * Set 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     * @param FromPolicyRule 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public void setFromPolicyRule(Long FromPolicyRule) {
        this.FromPolicyRule = FromPolicyRule;
    }

    /**
     * Get 入站规则

全部允许：1

全部拒绝 ：2

自定义：3 
     * @return ToPolicyRule 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     * @param ToPolicyRule 入站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
    }

    /**
     * Get 作用对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodSelector 作用对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set 作用对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodSelector 作用对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get 网络策略Id 
     * @return Id 网络策略Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 网络策略Id
     * @param Id 网络策略Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public NetworkPolicyInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkPolicyInfoItem(NetworkPolicyInfoItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PublishStatus != null) {
            this.PublishStatus = new String(source.PublishStatus);
        }
        if (source.PolicySourceType != null) {
            this.PolicySourceType = new String(source.PolicySourceType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new String(source.PolicyCreateTime);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.PublishResult != null) {
            this.PublishResult = new String(source.PublishResult);
        }
        if (source.FromPolicyRule != null) {
            this.FromPolicyRule = new Long(source.FromPolicyRule);
        }
        if (source.ToPolicyRule != null) {
            this.ToPolicyRule = new Long(source.ToPolicyRule);
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublishStatus", this.PublishStatus);
        this.setParamSimple(map, prefix + "PolicySourceType", this.PolicySourceType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

