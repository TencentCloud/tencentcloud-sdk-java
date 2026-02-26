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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnPolicyBasedRoutingRule extends AbstractModel {

    /**
    * 策略路由下一跳ID
    */
    @SerializedName("PolicyBasedRoutingNextHopId")
    @Expose
    private String PolicyBasedRoutingNextHopId;

    /**
    * 实例类型[VPC,DIRECTCONNECT,VPNGW]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源地址CIDR
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * 目的地址CIDR
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 策略路由匹配策略ID
    */
    @SerializedName("PolicyBasedRoutingRuleId")
    @Expose
    private String PolicyBasedRoutingRuleId;

    /**
     * Get 策略路由下一跳ID 
     * @return PolicyBasedRoutingNextHopId 策略路由下一跳ID
     */
    public String getPolicyBasedRoutingNextHopId() {
        return this.PolicyBasedRoutingNextHopId;
    }

    /**
     * Set 策略路由下一跳ID
     * @param PolicyBasedRoutingNextHopId 策略路由下一跳ID
     */
    public void setPolicyBasedRoutingNextHopId(String PolicyBasedRoutingNextHopId) {
        this.PolicyBasedRoutingNextHopId = PolicyBasedRoutingNextHopId;
    }

    /**
     * Get 实例类型[VPC,DIRECTCONNECT,VPNGW] 
     * @return InstanceType 实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型[VPC,DIRECTCONNECT,VPNGW]
     * @param InstanceType 实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源地址CIDR 
     * @return SourceCidrBlock 源地址CIDR
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set 源地址CIDR
     * @param SourceCidrBlock 源地址CIDR
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get 目的地址CIDR 
     * @return DestinationCidrBlock 目的地址CIDR
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 目的地址CIDR
     * @param DestinationCidrBlock 目的地址CIDR
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 策略路由匹配策略ID 
     * @return PolicyBasedRoutingRuleId 策略路由匹配策略ID
     */
    public String getPolicyBasedRoutingRuleId() {
        return this.PolicyBasedRoutingRuleId;
    }

    /**
     * Set 策略路由匹配策略ID
     * @param PolicyBasedRoutingRuleId 策略路由匹配策略ID
     */
    public void setPolicyBasedRoutingRuleId(String PolicyBasedRoutingRuleId) {
        this.PolicyBasedRoutingRuleId = PolicyBasedRoutingRuleId;
    }

    public CcnPolicyBasedRoutingRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnPolicyBasedRoutingRule(CcnPolicyBasedRoutingRule source) {
        if (source.PolicyBasedRoutingNextHopId != null) {
            this.PolicyBasedRoutingNextHopId = new String(source.PolicyBasedRoutingNextHopId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SourceCidrBlock != null) {
            this.SourceCidrBlock = new String(source.SourceCidrBlock);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyBasedRoutingRuleId != null) {
            this.PolicyBasedRoutingRuleId = new String(source.PolicyBasedRoutingRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyBasedRoutingNextHopId", this.PolicyBasedRoutingNextHopId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyBasedRoutingRuleId", this.PolicyBasedRoutingRuleId);

    }
}

