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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNetworkFirewallPolicyDetailRequest extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 策略Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * 出站规则

全部允许：1

全部拒绝 ：2

自定义：3
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * pod选择器
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 自定义规则
    */
    @SerializedName("CustomPolicy")
    @Expose
    private NetworkCustomPolicy [] CustomPolicy;

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
     * Get 策略Id 
     * @return Id 策略Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 策略Id
     * @param Id 策略Id
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get 出站规则

全部允许：1

全部拒绝 ：2

自定义：3 
     * @return ToPolicyRule 出站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set 出站规则

全部允许：1

全部拒绝 ：2

自定义：3
     * @param ToPolicyRule 出站规则

全部允许：1

全部拒绝 ：2

自定义：3
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
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
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 自定义规则 
     * @return CustomPolicy 自定义规则
     */
    public NetworkCustomPolicy [] getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set 自定义规则
     * @param CustomPolicy 自定义规则
     */
    public void setCustomPolicy(NetworkCustomPolicy [] CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    public UpdateNetworkFirewallPolicyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateNetworkFirewallPolicyDetailRequest(UpdateNetworkFirewallPolicyDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new NetworkCustomPolicy[source.CustomPolicy.length];
            for (int i = 0; i < source.CustomPolicy.length; i++) {
                this.CustomPolicy[i] = new NetworkCustomPolicy(source.CustomPolicy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "CustomPolicy.", this.CustomPolicy);

    }
}

