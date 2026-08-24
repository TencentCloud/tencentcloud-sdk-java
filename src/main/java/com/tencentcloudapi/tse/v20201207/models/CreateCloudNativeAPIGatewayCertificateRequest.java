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
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>ssl平台证书 Id</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>绑定的域名</p>
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * <p>证书名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
    */
    @SerializedName("CertUsage")
    @Expose
    private String CertUsage;

    /**
    * <p>证书私钥</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>证书pem格式</p>
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>ssl平台证书 Id</p> 
     * @return CertId <p>ssl平台证书 Id</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>ssl平台证书 Id</p>
     * @param CertId <p>ssl平台证书 Id</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>绑定的域名</p> 
     * @return BindDomains <p>绑定的域名</p>
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set <p>绑定的域名</p>
     * @param BindDomains <p>绑定的域名</p>
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get <p>证书名称</p> 
     * @return Name <p>证书名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>证书名称</p>
     * @param Name <p>证书名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul> 
     * @return CertType <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     * @param CertType <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul> 
     * @return CertUsage <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     */
    public String getCertUsage() {
        return this.CertUsage;
    }

    /**
     * Set <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     * @param CertUsage <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     */
    public void setCertUsage(String CertUsage) {
        this.CertUsage = CertUsage;
    }

    /**
     * Get <p>证书私钥</p> 
     * @return Key <p>证书私钥</p>
     * @deprecated
     */
    @Deprecated
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>证书私钥</p>
     * @param Key <p>证书私钥</p>
     * @deprecated
     */
    @Deprecated
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>证书pem格式</p> 
     * @return Crt <p>证书pem格式</p>
     * @deprecated
     */
    @Deprecated
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set <p>证书pem格式</p>
     * @param Crt <p>证书pem格式</p>
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
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertUsage != null) {
            this.CertUsage = new String(source.CertUsage);
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
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertUsage", this.CertUsage);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Crt", this.Crt);

    }
}

