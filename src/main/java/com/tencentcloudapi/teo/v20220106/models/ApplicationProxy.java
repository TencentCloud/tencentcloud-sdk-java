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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProxy extends AbstractModel{

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 实例名称
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 调度模式：
ip表示Anycast IP
domain表示CNAME
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * 0关闭安全，1开启安全
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 0关闭加速，1开启加速
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * 字段已经移至Rule.ForwardClientIp
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 字段已经移至Rule.SessionPersist
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * 规则列表
    */
    @SerializedName("Rule")
    @Expose
    private ApplicationProxyRule [] Rule;

    /**
    * 状态：
online：启用
offline：停用
progress：部署中
stopping：停用中
fail：部署失败/停用失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 调度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleValue")
    @Expose
    private String [] ScheduleValue;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 站点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 服务类型
hostname：子域名
instance：实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * 七层实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 实例名称 
     * @return ProxyName 实例名称
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 实例名称
     * @param ProxyName 实例名称
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 调度模式：
ip表示Anycast IP
domain表示CNAME 
     * @return PlatType 调度模式：
ip表示Anycast IP
domain表示CNAME
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set 调度模式：
ip表示Anycast IP
domain表示CNAME
     * @param PlatType 调度模式：
ip表示Anycast IP
domain表示CNAME
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get 0关闭安全，1开启安全 
     * @return SecurityType 0关闭安全，1开启安全
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 0关闭安全，1开启安全
     * @param SecurityType 0关闭安全，1开启安全
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 0关闭加速，1开启加速 
     * @return AccelerateType 0关闭加速，1开启加速
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set 0关闭加速，1开启加速
     * @param AccelerateType 0关闭加速，1开启加速
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get 字段已经移至Rule.ForwardClientIp 
     * @return ForwardClientIp 字段已经移至Rule.ForwardClientIp
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 字段已经移至Rule.ForwardClientIp
     * @param ForwardClientIp 字段已经移至Rule.ForwardClientIp
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 字段已经移至Rule.SessionPersist 
     * @return SessionPersist 字段已经移至Rule.SessionPersist
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 字段已经移至Rule.SessionPersist
     * @param SessionPersist 字段已经移至Rule.SessionPersist
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 规则列表 
     * @return Rule 规则列表
     */
    public ApplicationProxyRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则列表
     * @param Rule 规则列表
     */
    public void setRule(ApplicationProxyRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 状态：
online：启用
offline：停用
progress：部署中
stopping：停用中
fail：部署失败/停用失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态：
online：启用
offline：停用
progress：部署中
stopping：停用中
fail：部署失败/停用失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：
online：启用
offline：停用
progress：部署中
stopping：停用中
fail：部署失败/停用失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态：
online：启用
offline：停用
progress：部署中
stopping：停用中
fail：部署失败/停用失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 调度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleValue 调度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScheduleValue() {
        return this.ScheduleValue;
    }

    /**
     * Set 调度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleValue 调度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleValue(String [] ScheduleValue) {
        this.ScheduleValue = ScheduleValue;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 站点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 站点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 站点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionPersistTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionPersistTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 服务类型
hostname：子域名
instance：实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyType 服务类型
hostname：子域名
instance：实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 服务类型
hostname：子域名
instance：实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyType 服务类型
hostname：子域名
instance：实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get 七层实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostId 七层实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 七层实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostId 七层实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    public ApplicationProxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProxy(ApplicationProxy source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.PlatType != null) {
            this.PlatType = new String(source.PlatType);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new Long(source.AccelerateType);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.Rule != null) {
            this.Rule = new ApplicationProxyRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new ApplicationProxyRule(source.Rule[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScheduleValue != null) {
            this.ScheduleValue = new String[source.ScheduleValue.length];
            for (int i = 0; i < source.ScheduleValue.length; i++) {
                this.ScheduleValue[i] = new String(source.ScheduleValue[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ScheduleValue.", this.ScheduleValue);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "HostId", this.HostId);

    }
}

