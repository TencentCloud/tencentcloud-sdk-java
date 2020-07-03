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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCertInfo extends AbstractModel{

    /**
    * 证书Id。
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * 证书名称。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间，UTC格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 证书内容。
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * 证书类型。
0：用户添加证书，
1：腾讯云托管证书。
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 证书过期时间，UTC格式。
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * 使用此证书的域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 证书状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 证书Id。 
     * @return CertId 证书Id。
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书Id。
     * @param CertId 证书Id。
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书名称。 
     * @return CertName 证书名称。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称。
     * @param CertName 证书名称。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间，UTC格式。 
     * @return CreateTime 创建时间，UTC格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，UTC格式。
     * @param CreateTime 创建时间，UTC格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 证书内容。 
     * @return HttpsCrt 证书内容。
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set 证书内容。
     * @param HttpsCrt 证书内容。
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get 证书类型。
0：用户添加证书，
1：腾讯云托管证书。 
     * @return CertType 证书类型。
0：用户添加证书，
1：腾讯云托管证书。
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型。
0：用户添加证书，
1：腾讯云托管证书。
     * @param CertType 证书类型。
0：用户添加证书，
1：腾讯云托管证书。
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书过期时间，UTC格式。 
     * @return CertExpireTime 证书过期时间，UTC格式。
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set 证书过期时间，UTC格式。
     * @param CertExpireTime 证书过期时间，UTC格式。
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get 使用此证书的域名名称。 
     * @return DomainName 使用此证书的域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 使用此证书的域名名称。
     * @param DomainName 使用此证书的域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 证书状态。 
     * @return Status 证书状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态。
     * @param Status 证书状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    }
}

