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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSignaturePolicyRequest extends AbstractModel{

    /**
    * 实例 Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * KMS 密钥
    */
    @SerializedName("KmsId")
    @Expose
    private String KmsId;

    /**
    * KMS 密钥所属地域
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * 用户自定义域名，为空时使用 TCR 实例默认域名生成签名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 禁用加签策略，默认为 false
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get 实例 Id 
     * @return RegistryId 实例 Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例 Id
     * @param RegistryId 实例 Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get KMS 密钥 
     * @return KmsId KMS 密钥
     */
    public String getKmsId() {
        return this.KmsId;
    }

    /**
     * Set KMS 密钥
     * @param KmsId KMS 密钥
     */
    public void setKmsId(String KmsId) {
        this.KmsId = KmsId;
    }

    /**
     * Get KMS 密钥所属地域 
     * @return KmsRegion KMS 密钥所属地域
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set KMS 密钥所属地域
     * @param KmsRegion KMS 密钥所属地域
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get 用户自定义域名，为空时使用 TCR 实例默认域名生成签名 
     * @return Domain 用户自定义域名，为空时使用 TCR 实例默认域名生成签名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 用户自定义域名，为空时使用 TCR 实例默认域名生成签名
     * @param Domain 用户自定义域名，为空时使用 TCR 实例默认域名生成签名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 禁用加签策略，默认为 false 
     * @return Disabled 禁用加签策略，默认为 false
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 禁用加签策略，默认为 false
     * @param Disabled 禁用加签策略，默认为 false
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    public CreateSignaturePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignaturePolicyRequest(CreateSignaturePolicyRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.KmsId != null) {
            this.KmsId = new String(source.KmsId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "KmsId", this.KmsId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

