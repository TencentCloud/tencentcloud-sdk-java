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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCertInfo extends AbstractModel {

    /**
    * <p>证书Id。</p>
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * <p>证书名称。</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>描述信息。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>证书内容。</p>
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * <p>证书类型。<br>0：用户添加证书，<br>1：腾讯云托管证书。</p>
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * <p>证书过期时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * <p>使用此证书的域名名称。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>证书状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>证书本身标识的域名列表。<br>比如: [&quot;*.x.com&quot;]</p>
    */
    @SerializedName("CertDomains")
    @Expose
    private String [] CertDomains;

    /**
    * <p>腾讯云ssl的证书Id</p>
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get <p>证书Id。</p> 
     * @return CertId <p>证书Id。</p>
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书Id。</p>
     * @param CertId <p>证书Id。</p>
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>证书名称。</p> 
     * @return CertName <p>证书名称。</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>证书名称。</p>
     * @param CertName <p>证书名称。</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get <p>描述信息。</p> 
     * @return Description <p>描述信息。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。</p>
     * @param Description <p>描述信息。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p> 
     * @return CreateTime <p>创建时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     * @param CreateTime <p>创建时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>证书内容。</p> 
     * @return HttpsCrt <p>证书内容。</p>
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set <p>证书内容。</p>
     * @param HttpsCrt <p>证书内容。</p>
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get <p>证书类型。<br>0：用户添加证书，<br>1：腾讯云托管证书。</p> 
     * @return CertType <p>证书类型。<br>0：用户添加证书，<br>1：腾讯云托管证书。</p>
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型。<br>0：用户添加证书，<br>1：腾讯云托管证书。</p>
     * @param CertType <p>证书类型。<br>0：用户添加证书，<br>1：腾讯云托管证书。</p>
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>证书过期时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p> 
     * @return CertExpireTime <p>证书过期时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set <p>证书过期时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     * @param CertExpireTime <p>证书过期时间，UTC格式。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get <p>使用此证书的域名名称。</p> 
     * @return DomainName <p>使用此证书的域名名称。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>使用此证书的域名名称。</p>
     * @param DomainName <p>使用此证书的域名名称。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>证书状态。</p> 
     * @return Status <p>证书状态。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>证书状态。</p>
     * @param Status <p>证书状态。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>证书本身标识的域名列表。<br>比如: [&quot;*.x.com&quot;]</p> 
     * @return CertDomains <p>证书本身标识的域名列表。<br>比如: [&quot;*.x.com&quot;]</p>
     */
    public String [] getCertDomains() {
        return this.CertDomains;
    }

    /**
     * Set <p>证书本身标识的域名列表。<br>比如: [&quot;*.x.com&quot;]</p>
     * @param CertDomains <p>证书本身标识的域名列表。<br>比如: [&quot;*.x.com&quot;]</p>
     */
    public void setCertDomains(String [] CertDomains) {
        this.CertDomains = CertDomains;
    }

    /**
     * Get <p>腾讯云ssl的证书Id</p> 
     * @return CloudCertId <p>腾讯云ssl的证书Id</p>
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set <p>腾讯云ssl的证书Id</p>
     * @param CloudCertId <p>腾讯云ssl的证书Id</p>
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    public DomainCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCertInfo(DomainCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.HttpsCrt != null) {
            this.HttpsCrt = new String(source.HttpsCrt);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertDomains != null) {
            this.CertDomains = new String[source.CertDomains.length];
            for (int i = 0; i < source.CertDomains.length; i++) {
                this.CertDomains[i] = new String(source.CertDomains[i]);
            }
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CertDomains.", this.CertDomains);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);

    }
}

