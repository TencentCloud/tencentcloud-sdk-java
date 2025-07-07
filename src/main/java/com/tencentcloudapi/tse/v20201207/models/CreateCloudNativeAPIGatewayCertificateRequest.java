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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayCertificateRequest extends AbstractModel {

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 绑定的域名
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * ssl平台证书 Id
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 证书名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 证书私钥
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 证书pem格式
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

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
     * Get 绑定的域名 
     * @return BindDomains 绑定的域名
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set 绑定的域名
     * @param BindDomains 绑定的域名
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get ssl平台证书 Id 
     * @return CertId ssl平台证书 Id
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl平台证书 Id
     * @param CertId ssl平台证书 Id
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书名称 
     * @return Name 证书名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 证书名称
     * @param Name 证书名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 证书私钥 
     * @return Key 证书私钥
     * @deprecated
     */
    @Deprecated
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 证书私钥
     * @param Key 证书私钥
     * @deprecated
     */
    @Deprecated
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 证书pem格式 
     * @return Crt 证书pem格式
     * @deprecated
     */
    @Deprecated
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set 证书pem格式
     * @param Crt 证书pem格式
     * @deprecated
     */
    @Deprecated
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    public CreateCloudNativeAPIGatewayCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayCertificateRequest(CreateCloudNativeAPIGatewayCertificateRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Crt", this.Crt);

    }
}

