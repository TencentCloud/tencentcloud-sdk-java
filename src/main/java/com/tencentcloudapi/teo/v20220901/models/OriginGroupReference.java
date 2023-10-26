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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupReference extends AbstractModel {

    /**
    * 引用服务类型，取值有：
<li>AccelerationDomain: 加速域名；</li>
<li>RuleEngine: 规则引擎；</li>
<li>Loadbalance: 负载均衡；</li>
<li>ApplicationProxy: 四层代理。</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 引用类型的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用类型的实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 引用服务类型，取值有：
<li>AccelerationDomain: 加速域名；</li>
<li>RuleEngine: 规则引擎；</li>
<li>Loadbalance: 负载均衡；</li>
<li>ApplicationProxy: 四层代理。</li> 
     * @return InstanceType 引用服务类型，取值有：
<li>AccelerationDomain: 加速域名；</li>
<li>RuleEngine: 规则引擎；</li>
<li>Loadbalance: 负载均衡；</li>
<li>ApplicationProxy: 四层代理。</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 引用服务类型，取值有：
<li>AccelerationDomain: 加速域名；</li>
<li>RuleEngine: 规则引擎；</li>
<li>Loadbalance: 负载均衡；</li>
<li>ApplicationProxy: 四层代理。</li>
     * @param InstanceType 引用服务类型，取值有：
<li>AccelerationDomain: 加速域名；</li>
<li>RuleEngine: 规则引擎；</li>
<li>Loadbalance: 负载均衡；</li>
<li>ApplicationProxy: 四层代理。</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 引用类型的实例ID。 
     * @return InstanceId 引用类型的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 引用类型的实例ID。
     * @param InstanceId 引用类型的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用类型的实例名称。 
     * @return InstanceName 应用类型的实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 应用类型的实例名称。
     * @param InstanceName 应用类型的实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public OriginGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupReference(OriginGroupReference source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

