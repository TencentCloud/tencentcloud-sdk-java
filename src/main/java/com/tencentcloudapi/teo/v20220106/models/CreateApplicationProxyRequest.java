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

public class CreateApplicationProxyRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 四层代理名称
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
    * 规则详细信息
    */
    @SerializedName("Rule")
    @Expose
    private ApplicationProxyRule [] Rule;

    /**
    * 会话保持时间，取值范围：30-3600，单位：秒
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 服务类型
hostname：子域名
instance：实例
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称 
     * @return ZoneName 站点名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称
     * @param ZoneName 站点名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 四层代理名称 
     * @return ProxyName 四层代理名称
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 四层代理名称
     * @param ProxyName 四层代理名称
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
     * Get 规则详细信息 
     * @return Rule 规则详细信息
     */
    public ApplicationProxyRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则详细信息
     * @param Rule 规则详细信息
     */
    public void setRule(ApplicationProxyRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 会话保持时间，取值范围：30-3600，单位：秒 
     * @return SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间，取值范围：30-3600，单位：秒
     * @param SessionPersistTime 会话保持时间，取值范围：30-3600，单位：秒
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 服务类型
hostname：子域名
instance：实例 
     * @return ProxyType 服务类型
hostname：子域名
instance：实例
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 服务类型
hostname：子域名
instance：实例
     * @param ProxyType 服务类型
hostname：子域名
instance：实例
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    public CreateApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationProxyRequest(CreateApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
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
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);

    }
}

