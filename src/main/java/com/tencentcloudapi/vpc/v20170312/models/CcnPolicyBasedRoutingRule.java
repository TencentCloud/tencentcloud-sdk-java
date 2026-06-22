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
    * <p>策略路由下一跳ID</p>
    */
    @SerializedName("PolicyBasedRoutingNextHopId")
    @Expose
    private String PolicyBasedRoutingNextHopId;

    /**
    * <p>实例类型[VPC,DIRECTCONNECT,VPNGW]</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>源地址CIDR</p>
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * <p>目的地址CIDR</p>
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略路由匹配策略ID</p>
    */
    @SerializedName("PolicyBasedRoutingRuleId")
    @Expose
    private String PolicyBasedRoutingRuleId;

    /**
    * <p>目的端实例ID</p><p>枚举值：</p><ul><li>VPC： 私有网络</li></ul>
    */
    @SerializedName("DestinationInstanceType")
    @Expose
    private String DestinationInstanceType;

    /**
    * <p>目的端实例ID</p>
    */
    @SerializedName("DestinationInstanceId")
    @Expose
    private String DestinationInstanceId;

    /**
     * Get <p>策略路由下一跳ID</p> 
     * @return PolicyBasedRoutingNextHopId <p>策略路由下一跳ID</p>
     */
    public String getPolicyBasedRoutingNextHopId() {
        return this.PolicyBasedRoutingNextHopId;
    }

    /**
     * Set <p>策略路由下一跳ID</p>
     * @param PolicyBasedRoutingNextHopId <p>策略路由下一跳ID</p>
     */
    public void setPolicyBasedRoutingNextHopId(String PolicyBasedRoutingNextHopId) {
        this.PolicyBasedRoutingNextHopId = PolicyBasedRoutingNextHopId;
    }

    /**
     * Get <p>实例类型[VPC,DIRECTCONNECT,VPNGW]</p> 
     * @return InstanceType <p>实例类型[VPC,DIRECTCONNECT,VPNGW]</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型[VPC,DIRECTCONNECT,VPNGW]</p>
     * @param InstanceType <p>实例类型[VPC,DIRECTCONNECT,VPNGW]</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>源地址CIDR</p> 
     * @return SourceCidrBlock <p>源地址CIDR</p>
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set <p>源地址CIDR</p>
     * @param SourceCidrBlock <p>源地址CIDR</p>
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get <p>目的地址CIDR</p> 
     * @return DestinationCidrBlock <p>目的地址CIDR</p>
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set <p>目的地址CIDR</p>
     * @param DestinationCidrBlock <p>目的地址CIDR</p>
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get <p>优先级</p> 
     * @return Priority <p>优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p>
     * @param Priority <p>优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略路由匹配策略ID</p> 
     * @return PolicyBasedRoutingRuleId <p>策略路由匹配策略ID</p>
     */
    public String getPolicyBasedRoutingRuleId() {
        return this.PolicyBasedRoutingRuleId;
    }

    /**
     * Set <p>策略路由匹配策略ID</p>
     * @param PolicyBasedRoutingRuleId <p>策略路由匹配策略ID</p>
     */
    public void setPolicyBasedRoutingRuleId(String PolicyBasedRoutingRuleId) {
        this.PolicyBasedRoutingRuleId = PolicyBasedRoutingRuleId;
    }

    /**
     * Get <p>目的端实例ID</p><p>枚举值：</p><ul><li>VPC： 私有网络</li></ul> 
     * @return DestinationInstanceType <p>目的端实例ID</p><p>枚举值：</p><ul><li>VPC： 私有网络</li></ul>
     */
    public String getDestinationInstanceType() {
        return this.DestinationInstanceType;
    }

    /**
     * Set <p>目的端实例ID</p><p>枚举值：</p><ul><li>VPC： 私有网络</li></ul>
     * @param DestinationInstanceType <p>目的端实例ID</p><p>枚举值：</p><ul><li>VPC： 私有网络</li></ul>
     */
    public void setDestinationInstanceType(String DestinationInstanceType) {
        this.DestinationInstanceType = DestinationInstanceType;
    }

    /**
     * Get <p>目的端实例ID</p> 
     * @return DestinationInstanceId <p>目的端实例ID</p>
     */
    public String getDestinationInstanceId() {
        return this.DestinationInstanceId;
    }

    /**
     * Set <p>目的端实例ID</p>
     * @param DestinationInstanceId <p>目的端实例ID</p>
     */
    public void setDestinationInstanceId(String DestinationInstanceId) {
        this.DestinationInstanceId = DestinationInstanceId;
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
        if (source.DestinationInstanceType != null) {
            this.DestinationInstanceType = new String(source.DestinationInstanceType);
        }
        if (source.DestinationInstanceId != null) {
            this.DestinationInstanceId = new String(source.DestinationInstanceId);
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
        this.setParamSimple(map, prefix + "DestinationInstanceType", this.DestinationInstanceType);
        this.setParamSimple(map, prefix + "DestinationInstanceId", this.DestinationInstanceId);

    }
}

