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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceEndpointRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接入点类型，
PUBLIC 公网
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 公网带宽，Mbps为单位
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网安全组信息
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * 公网是否按流量计费
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 接入点类型，
PUBLIC 公网 
     * @return Type 接入点类型，
PUBLIC 公网
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 接入点类型，
PUBLIC 公网
     * @param Type 接入点类型，
PUBLIC 公网
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 公网带宽，Mbps为单位 
     * @return Bandwidth 公网带宽，Mbps为单位
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽，Mbps为单位
     * @param Bandwidth 公网带宽，Mbps为单位
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网安全组信息 
     * @return IpRules 公网安全组信息
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网安全组信息
     * @param IpRules 公网安全组信息
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 公网是否按流量计费 
     * @return BillingFlow 公网是否按流量计费
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set 公网是否按流量计费
     * @param BillingFlow 公网是否按流量计费
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public ModifyInstanceEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceEndpointRequest(ModifyInstanceEndpointRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

