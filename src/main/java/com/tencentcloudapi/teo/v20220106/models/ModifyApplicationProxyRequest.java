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

public class ModifyApplicationProxyRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 四层代理ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 四层代理名称
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 参数已经废弃
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 参数已经废弃
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

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
     * Get 四层代理ID 
     * @return ProxyId 四层代理ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理ID
     * @param ProxyId 四层代理ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
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
     * Get 参数已经废弃 
     * @return ForwardClientIp 参数已经废弃
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 参数已经废弃
     * @param ForwardClientIp 参数已经废弃
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 参数已经废弃 
     * @return SessionPersist 参数已经废弃
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 参数已经废弃
     * @param SessionPersist 参数已经废弃
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
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

    public ModifyApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProxyRequest(ModifyApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
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
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);

    }
}

