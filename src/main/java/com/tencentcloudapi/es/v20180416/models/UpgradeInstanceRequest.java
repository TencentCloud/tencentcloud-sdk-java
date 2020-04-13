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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标ES版本，支持：”6.4.3“, "6.8.2"，"7.5.1"
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * 是否只做升级检查，默认值为false
    */
    @SerializedName("CheckOnly")
    @Expose
    private Boolean CheckOnly;

    /**
    * 目标商业特性版本：<li>oss 开源版</li><li>basic 基础版</li>当前仅在5.6.4升级6.x版本时使用，默认值为basic
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

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
     * Get 目标ES版本，支持：”6.4.3“, "6.8.2"，"7.5.1" 
     * @return EsVersion 目标ES版本，支持：”6.4.3“, "6.8.2"，"7.5.1"
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set 目标ES版本，支持：”6.4.3“, "6.8.2"，"7.5.1"
     * @param EsVersion 目标ES版本，支持：”6.4.3“, "6.8.2"，"7.5.1"
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get 是否只做升级检查，默认值为false 
     * @return CheckOnly 是否只做升级检查，默认值为false
     */
    public Boolean getCheckOnly() {
        return this.CheckOnly;
    }

    /**
     * Set 是否只做升级检查，默认值为false
     * @param CheckOnly 是否只做升级检查，默认值为false
     */
    public void setCheckOnly(Boolean CheckOnly) {
        this.CheckOnly = CheckOnly;
    }

    /**
     * Get 目标商业特性版本：<li>oss 开源版</li><li>basic 基础版</li>当前仅在5.6.4升级6.x版本时使用，默认值为basic 
     * @return LicenseType 目标商业特性版本：<li>oss 开源版</li><li>basic 基础版</li>当前仅在5.6.4升级6.x版本时使用，默认值为basic
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 目标商业特性版本：<li>oss 开源版</li><li>basic 基础版</li>当前仅在5.6.4升级6.x版本时使用，默认值为basic
     * @param LicenseType 目标商业特性版本：<li>oss 开源版</li><li>basic 基础版</li>当前仅在5.6.4升级6.x版本时使用，默认值为basic
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li> 
     * @return BasicSecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     * @param BasicSecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "CheckOnly", this.CheckOnly);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);

    }
}

