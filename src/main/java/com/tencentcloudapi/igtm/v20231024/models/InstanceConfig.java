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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfig extends AbstractModel {

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 业务域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 全局记录过期时间	
    */
    @SerializedName("GlobalTtl")
    @Expose
    private Long GlobalTtl;

    /**
    * 接入主域名，自定义接入域名时必填

    */
    @SerializedName("AccessDomain")
    @Expose
    private String AccessDomain;

    /**
    * 接入子域名，自定义接入域名时必填
    */
    @SerializedName("AccessSubDomain")
    @Expose
    private String AccessSubDomain;

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 业务域名 
     * @return Domain 业务域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 业务域名
     * @param Domain 业务域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名 
     * @return AccessType CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     * @param AccessType CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 全局记录过期时间	 
     * @return GlobalTtl 全局记录过期时间	
     */
    public Long getGlobalTtl() {
        return this.GlobalTtl;
    }

    /**
     * Set 全局记录过期时间	
     * @param GlobalTtl 全局记录过期时间	
     */
    public void setGlobalTtl(Long GlobalTtl) {
        this.GlobalTtl = GlobalTtl;
    }

    /**
     * Get 接入主域名，自定义接入域名时必填
 
     * @return AccessDomain 接入主域名，自定义接入域名时必填

     */
    public String getAccessDomain() {
        return this.AccessDomain;
    }

    /**
     * Set 接入主域名，自定义接入域名时必填

     * @param AccessDomain 接入主域名，自定义接入域名时必填

     */
    public void setAccessDomain(String AccessDomain) {
        this.AccessDomain = AccessDomain;
    }

    /**
     * Get 接入子域名，自定义接入域名时必填 
     * @return AccessSubDomain 接入子域名，自定义接入域名时必填
     */
    public String getAccessSubDomain() {
        return this.AccessSubDomain;
    }

    /**
     * Set 接入子域名，自定义接入域名时必填
     * @param AccessSubDomain 接入子域名，自定义接入域名时必填
     */
    public void setAccessSubDomain(String AccessSubDomain) {
        this.AccessSubDomain = AccessSubDomain;
    }

    public InstanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfig(InstanceConfig source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.GlobalTtl != null) {
            this.GlobalTtl = new Long(source.GlobalTtl);
        }
        if (source.AccessDomain != null) {
            this.AccessDomain = new String(source.AccessDomain);
        }
        if (source.AccessSubDomain != null) {
            this.AccessSubDomain = new String(source.AccessSubDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "GlobalTtl", this.GlobalTtl);
        this.setParamSimple(map, prefix + "AccessDomain", this.AccessDomain);
        this.setParamSimple(map, prefix + "AccessSubDomain", this.AccessSubDomain);

    }
}

