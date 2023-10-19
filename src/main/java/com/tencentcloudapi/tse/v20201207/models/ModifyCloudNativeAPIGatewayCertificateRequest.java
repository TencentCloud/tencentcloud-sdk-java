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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayCertificateRequest extends AbstractModel {

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 证书id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 证书名称，即将废弃
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 证书私钥，CertSource为native时必填。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 证书pem格式，CertSource为native时必填。
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
    * 绑定的域名，即将废弃
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * ssl平台证书 Id，CertSource为ssl时必填。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 证书来源
- ssl (ssl平台证书)，默认值
- native (kong自定义证书) 

    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 证书id 
     * @return Id 证书id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 证书id
     * @param Id 证书id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 证书名称，即将废弃 
     * @return Name 证书名称，即将废弃
     * @deprecated
     */
    @Deprecated
    public String getName() {
        return this.Name;
    }

    /**
     * Set 证书名称，即将废弃
     * @param Name 证书名称，即将废弃
     * @deprecated
     */
    @Deprecated
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 证书私钥，CertSource为native时必填。 
     * @return Key 证书私钥，CertSource为native时必填。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 证书私钥，CertSource为native时必填。
     * @param Key 证书私钥，CertSource为native时必填。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 证书pem格式，CertSource为native时必填。 
     * @return Crt 证书pem格式，CertSource为native时必填。
     */
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set 证书pem格式，CertSource为native时必填。
     * @param Crt 证书pem格式，CertSource为native时必填。
     */
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    /**
     * Get 绑定的域名，即将废弃 
     * @return BindDomains 绑定的域名，即将废弃
     * @deprecated
     */
    @Deprecated
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set 绑定的域名，即将废弃
     * @param BindDomains 绑定的域名，即将废弃
     * @deprecated
     */
    @Deprecated
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get ssl平台证书 Id，CertSource为ssl时必填。 
     * @return CertId ssl平台证书 Id，CertSource为ssl时必填。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl平台证书 Id，CertSource为ssl时必填。
     * @param CertId ssl平台证书 Id，CertSource为ssl时必填。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书来源
- ssl (ssl平台证书)，默认值
- native (kong自定义证书) 
 
     * @return CertSource 证书来源
- ssl (ssl平台证书)，默认值
- native (kong自定义证书) 

     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set 证书来源
- ssl (ssl平台证书)，默认值
- native (kong自定义证书) 

     * @param CertSource 证书来源
- ssl (ssl平台证书)，默认值
- native (kong自定义证书) 

     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    public ModifyCloudNativeAPIGatewayCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayCertificateRequest(ModifyCloudNativeAPIGatewayCertificateRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Crt", this.Crt);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);

    }
}

