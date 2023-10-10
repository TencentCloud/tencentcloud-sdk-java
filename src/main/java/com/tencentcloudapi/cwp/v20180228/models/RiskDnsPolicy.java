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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDnsPolicy extends AbstractModel{

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型[0:系统,1:用户]
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 策略动作[0:告警,1:放行,2:拦截+告警]
    */
    @SerializedName("PolicyAction")
    @Expose
    private Long PolicyAction;

    /**
    * 主机范围[1: 所有专业版+旗舰版|2:所有旗舰版|0: 部分主机]
    */
    @SerializedName("HostScope")
    @Expose
    private Long HostScope;

    /**
    * 主机ID
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 域名,作为入参时需要进行base64 encode
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 是否生效[0:生效,1:不生效]
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * 是否处理之前的事件[0:不处理|1:处理]
    */
    @SerializedName("IsDealOldEvent")
    @Expose
    private Long IsDealOldEvent;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 事件ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型[0:系统,1:用户] 
     * @return PolicyType 策略类型[0:系统,1:用户]
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型[0:系统,1:用户]
     * @param PolicyType 策略类型[0:系统,1:用户]
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略动作[0:告警,1:放行,2:拦截+告警] 
     * @return PolicyAction 策略动作[0:告警,1:放行,2:拦截+告警]
     */
    public Long getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set 策略动作[0:告警,1:放行,2:拦截+告警]
     * @param PolicyAction 策略动作[0:告警,1:放行,2:拦截+告警]
     */
    public void setPolicyAction(Long PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get 主机范围[1: 所有专业版+旗舰版|2:所有旗舰版|0: 部分主机] 
     * @return HostScope 主机范围[1: 所有专业版+旗舰版|2:所有旗舰版|0: 部分主机]
     */
    public Long getHostScope() {
        return this.HostScope;
    }

    /**
     * Set 主机范围[1: 所有专业版+旗舰版|2:所有旗舰版|0: 部分主机]
     * @param HostScope 主机范围[1: 所有专业版+旗舰版|2:所有旗舰版|0: 部分主机]
     */
    public void setHostScope(Long HostScope) {
        this.HostScope = HostScope;
    }

    /**
     * Get 主机ID 
     * @return HostIds 主机ID
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 主机ID
     * @param HostIds 主机ID
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 域名,作为入参时需要进行base64 encode 
     * @return Domains 域名,作为入参时需要进行base64 encode
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名,作为入参时需要进行base64 encode
     * @param Domains 域名,作为入参时需要进行base64 encode
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 是否生效[0:生效,1:不生效] 
     * @return IsEnabled 是否生效[0:生效,1:不生效]
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否生效[0:生效,1:不生效]
     * @param IsEnabled 是否生效[0:生效,1:不生效]
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略描述 
     * @return PolicyDesc 策略描述
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set 策略描述
     * @param PolicyDesc 策略描述
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get 是否处理之前的事件[0:不处理|1:处理] 
     * @return IsDealOldEvent 是否处理之前的事件[0:不处理|1:处理]
     */
    public Long getIsDealOldEvent() {
        return this.IsDealOldEvent;
    }

    /**
     * Set 是否处理之前的事件[0:不处理|1:处理]
     * @param IsDealOldEvent 是否处理之前的事件[0:不处理|1:处理]
     */
    public void setIsDealOldEvent(Long IsDealOldEvent) {
        this.IsDealOldEvent = IsDealOldEvent;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 事件ID 
     * @return EventId 事件ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
     * @param EventId 事件ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public RiskDnsPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsPolicy(RiskDnsPolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new Long(source.PolicyAction);
        }
        if (source.HostScope != null) {
            this.HostScope = new Long(source.HostScope);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.IsDealOldEvent != null) {
            this.IsDealOldEvent = new Long(source.IsDealOldEvent);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamSimple(map, prefix + "HostScope", this.HostScope);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "IsDealOldEvent", this.IsDealOldEvent);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

