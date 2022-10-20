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

public class CheckNetworkFirewallPolicyYamlRequest extends AbstractModel{

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
    * base64编码的networkpolicy yaml字符串
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get base64编码的networkpolicy yaml字符串 
     * @return Yaml base64编码的networkpolicy yaml字符串
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set base64编码的networkpolicy yaml字符串
     * @param Yaml base64编码的networkpolicy yaml字符串
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
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

    public CheckNetworkFirewallPolicyYamlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckNetworkFirewallPolicyYamlRequest(CheckNetworkFirewallPolicyYamlRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

