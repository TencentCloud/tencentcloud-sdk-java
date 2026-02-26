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

public class CcnPolicyBasedRoutingNextHop extends AbstractModel {

    /**
    * 策略路由下一跳ID
    */
    @SerializedName("PolicyBasedRoutingNextHopId")
    @Expose
    private String PolicyBasedRoutingNextHopId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 下一跳地域
    */
    @SerializedName("NextHopRegion")
    @Expose
    private String NextHopRegion;

    /**
    * 关联实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 状态(ENABLE/DISABLE)
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 下一跳资源类型[HAVIP,GWLB_ENDPOINT]
    */
    @SerializedName("NextHopResourceType")
    @Expose
    private String NextHopResourceType;

    /**
    * 下一跳资源ID
    */
    @SerializedName("NextHopResourceId")
    @Expose
    private String NextHopResourceId;

    /**
    * 下一跳资源ip
    */
    @SerializedName("NextHopIp")
    @Expose
    private String NextHopIp;

    /**
    * 0
    */
    @SerializedName("PolicyBasedRoutingRulesCount")
    @Expose
    private Long PolicyBasedRoutingRulesCount;

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
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 下一跳地域 
     * @return NextHopRegion 下一跳地域
     */
    public String getNextHopRegion() {
        return this.NextHopRegion;
    }

    /**
     * Set 下一跳地域
     * @param NextHopRegion 下一跳地域
     */
    public void setNextHopRegion(String NextHopRegion) {
        this.NextHopRegion = NextHopRegion;
    }

    /**
     * Get 关联实例ID 
     * @return InstanceId 关联实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联实例ID
     * @param InstanceId 关联实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 状态(ENABLE/DISABLE) 
     * @return State 状态(ENABLE/DISABLE)
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态(ENABLE/DISABLE)
     * @param State 状态(ENABLE/DISABLE)
     */
    public void setState(String State) {
        this.State = State;
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
     * Get 关联实例类型[VPC,DIRECTCONNECT,VPNGW] 
     * @return InstanceType 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     * @param InstanceType 关联实例类型[VPC,DIRECTCONNECT,VPNGW]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 下一跳资源类型[HAVIP,GWLB_ENDPOINT] 
     * @return NextHopResourceType 下一跳资源类型[HAVIP,GWLB_ENDPOINT]
     */
    public String getNextHopResourceType() {
        return this.NextHopResourceType;
    }

    /**
     * Set 下一跳资源类型[HAVIP,GWLB_ENDPOINT]
     * @param NextHopResourceType 下一跳资源类型[HAVIP,GWLB_ENDPOINT]
     */
    public void setNextHopResourceType(String NextHopResourceType) {
        this.NextHopResourceType = NextHopResourceType;
    }

    /**
     * Get 下一跳资源ID 
     * @return NextHopResourceId 下一跳资源ID
     */
    public String getNextHopResourceId() {
        return this.NextHopResourceId;
    }

    /**
     * Set 下一跳资源ID
     * @param NextHopResourceId 下一跳资源ID
     */
    public void setNextHopResourceId(String NextHopResourceId) {
        this.NextHopResourceId = NextHopResourceId;
    }

    /**
     * Get 下一跳资源ip 
     * @return NextHopIp 下一跳资源ip
     */
    public String getNextHopIp() {
        return this.NextHopIp;
    }

    /**
     * Set 下一跳资源ip
     * @param NextHopIp 下一跳资源ip
     */
    public void setNextHopIp(String NextHopIp) {
        this.NextHopIp = NextHopIp;
    }

    /**
     * Get 0 
     * @return PolicyBasedRoutingRulesCount 0
     */
    public Long getPolicyBasedRoutingRulesCount() {
        return this.PolicyBasedRoutingRulesCount;
    }

    /**
     * Set 0
     * @param PolicyBasedRoutingRulesCount 0
     */
    public void setPolicyBasedRoutingRulesCount(Long PolicyBasedRoutingRulesCount) {
        this.PolicyBasedRoutingRulesCount = PolicyBasedRoutingRulesCount;
    }

    public CcnPolicyBasedRoutingNextHop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnPolicyBasedRoutingNextHop(CcnPolicyBasedRoutingNextHop source) {
        if (source.PolicyBasedRoutingNextHopId != null) {
            this.PolicyBasedRoutingNextHopId = new String(source.PolicyBasedRoutingNextHopId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NextHopRegion != null) {
            this.NextHopRegion = new String(source.NextHopRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NextHopResourceType != null) {
            this.NextHopResourceType = new String(source.NextHopResourceType);
        }
        if (source.NextHopResourceId != null) {
            this.NextHopResourceId = new String(source.NextHopResourceId);
        }
        if (source.NextHopIp != null) {
            this.NextHopIp = new String(source.NextHopIp);
        }
        if (source.PolicyBasedRoutingRulesCount != null) {
            this.PolicyBasedRoutingRulesCount = new Long(source.PolicyBasedRoutingRulesCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyBasedRoutingNextHopId", this.PolicyBasedRoutingNextHopId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NextHopRegion", this.NextHopRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "NextHopResourceType", this.NextHopResourceType);
        this.setParamSimple(map, prefix + "NextHopResourceId", this.NextHopResourceId);
        this.setParamSimple(map, prefix + "NextHopIp", this.NextHopIp);
        this.setParamSimple(map, prefix + "PolicyBasedRoutingRulesCount", this.PolicyBasedRoutingRulesCount);

    }
}

