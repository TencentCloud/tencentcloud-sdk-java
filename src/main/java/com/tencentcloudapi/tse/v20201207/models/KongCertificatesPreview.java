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

public class KongCertificatesPreview extends AbstractModel {

    /**
    * 证书名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 绑定的域名
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * 证书状态：expired(已过期)
                   active(生效中)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 证书pem格式
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
    * 证书私钥
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 证书过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 证书上传时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 证书签发时间
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * 证书来源：native(kong自定义证书)
                    ssl(ssl平台证书)
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * ssl平台证书Id
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

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
     * Get Id 
     * @return Id Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 证书状态：expired(已过期)
                   active(生效中) 
     * @return Status 证书状态：expired(已过期)
                   active(生效中)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态：expired(已过期)
                   active(生效中)
     * @param Status 证书状态：expired(已过期)
                   active(生效中)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 证书pem格式 
     * @return Crt 证书pem格式
     */
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set 证书pem格式
     * @param Crt 证书pem格式
     */
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    /**
     * Get 证书私钥 
     * @return Key 证书私钥
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 证书私钥
     * @param Key 证书私钥
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 证书过期时间 
     * @return ExpireTime 证书过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书过期时间
     * @param ExpireTime 证书过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 证书上传时间 
     * @return CreateTime 证书上传时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 证书上传时间
     * @param CreateTime 证书上传时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 证书签发时间 
     * @return IssueTime 证书签发时间
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set 证书签发时间
     * @param IssueTime 证书签发时间
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get 证书来源：native(kong自定义证书)
                    ssl(ssl平台证书) 
     * @return CertSource 证书来源：native(kong自定义证书)
                    ssl(ssl平台证书)
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set 证书来源：native(kong自定义证书)
                    ssl(ssl平台证书)
     * @param CertSource 证书来源：native(kong自定义证书)
                    ssl(ssl平台证书)
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get ssl平台证书Id 
     * @return CertId ssl平台证书Id
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl平台证书Id
     * @param CertId ssl平台证书Id
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    public KongCertificatesPreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongCertificatesPreview(KongCertificatesPreview source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Crt", this.Crt);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}

