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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInsPublicEndpointRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>带宽,单位Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>公网访问规则</p>
    */
    @SerializedName("Rules")
    @Expose
    private PublicAccessRule [] Rules;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>带宽,单位Mbps</p> 
     * @return Bandwidth <p>带宽,单位Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽,单位Mbps</p>
     * @param Bandwidth <p>带宽,单位Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>公网访问规则</p> 
     * @return Rules <p>公网访问规则</p>
     */
    public PublicAccessRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>公网访问规则</p>
     * @param Rules <p>公网访问规则</p>
     */
    public void setRules(PublicAccessRule [] Rules) {
        this.Rules = Rules;
    }

    public CreateInsPublicEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInsPublicEndpointRequest(CreateInsPublicEndpointRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Rules != null) {
            this.Rules = new PublicAccessRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PublicAccessRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

